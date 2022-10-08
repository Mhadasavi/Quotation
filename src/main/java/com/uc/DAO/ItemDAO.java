package com.uc.DAO;

import com.uc.Model.Item;

import java.util.List;

public interface ItemDAO {

    public void addItem(Item item);
    public List<Item> getItems();
    public void deleteItem(Item item);
    public Item updateItem(Item item);
    public Item getItem(int itemId);
}
