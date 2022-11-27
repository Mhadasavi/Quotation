package com.uc.rest.controller;

import com.uc.Model.Item;
import com.uc.rest.Exception.CustomerNotFoundException;
import com.uc.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    //use autowired here to call the service
    @Autowired
    private ItemService itemService;

    @GetMapping("/Item/{id}")
    public Item getItem(@PathVariable int id) {
        Item item = itemService.getItem(id);
        if (item == null) {
            throw new CustomerNotFoundException("Item Id not found " + id);
        }
        return item;
    }

    @GetMapping("/Items")
    public List<Item> getItems() {
        List<Item> items = itemService.getItems();
        if (items == null || items.size() < 1) {
            throw new CustomerNotFoundException("No Items Found");
        }
        return items;
    }

    @PostMapping("/Item")
    public Item saveItem(@RequestBody Item item) {
        if (item != null) {
            item.setId(0);
            itemService.saveItem(item);
        }
        return item;
    }
}
