package com.uc.services;

import com.uc.DAO.ItemDAO;
import com.uc.DAO.ItemDAOImpl;
import com.uc.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemDAO itemDAO;

    @Override
    public List<Item> getItems() {
        return null;
    }

    @Override
    public void saveItem(Item theItem) {

    }

    @Override
    @Transactional
    public Item getItem(int theId) {
        return itemDAO.getItem(theId);
    }

    @Override
    public void deleteItem(int theId) {

    }
}
