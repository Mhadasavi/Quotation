package com.uc.DAO;

import com.uc.Model.Item;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDAOImpl {

//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public void addItem(Item item) {
//        sessionFactory.getCurrentSession().saveOrUpdate(item);
//    }
//
//    @Override
//    public List<Item> getItems() {
//        return sessionFactory.getCurrentSession().createQuery("from item").list();
//    }
//
//    @Override
//    public void deleteItem(Item item) {
//        sessionFactory.getCurrentSession().delete(item);
//    }
//
//    @Override
//    public Item updateItem(Item item) {
//        sessionFactory.getCurrentSession().update(item);
//        return item;
//    }
//
//    @Override
//    public Item getItem(int itemId) {
//        return (Item) sessionFactory.getCurrentSession().get(Item.class, itemId);
//    }
}
