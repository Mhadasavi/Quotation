package com.uc.rest.controller;

import com.uc.Model.Item;
import com.uc.rest.Exception.CustomerNotFoundException;
import com.uc.services.ItemService;
import com.uc.services.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ItemController {

    //use autowired here to call the service
    @Autowired
    private ItemService itemService;

    @GetMapping("/Item/{id}")
    public Item getItem(@PathVariable int id){
        Item item= itemService.getItem(id);
        if(item==null){
            throw new CustomerNotFoundException("Item Id not found "+id);
        }

        return item;
    }
}
