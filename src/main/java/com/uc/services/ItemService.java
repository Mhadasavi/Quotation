package com.uc.services;

import com.uc.Model.Item;

import java.util.List;

public interface ItemService {
    public List<Item> getItems();

    public void saveItem(Item theItem);

    public Item getItem(int theId);

    public void deleteItem(int theId);
}
