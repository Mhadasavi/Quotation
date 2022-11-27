package com.uc.DAO;

import com.uc.Model.Item;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ItemDAOImpl implements ItemDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addItem(Item item) {
        sessionFactory.getCurrentSession().saveOrUpdate(item);
    }

    @Override
    @Transactional
    public List<Item> getItems() {
        return sessionFactory.getCurrentSession().createQuery("from Item").list();
    }

    @Override
    @Transactional
    public void deleteItem(Item item) {
        sessionFactory.getCurrentSession().delete(item);
    }

    @Override
    @Transactional
    public Item updateItem(Item item) {
        sessionFactory.getCurrentSession().update(item);
        return item;
    }

    @Override
    @Transactional
    public Item getItem(int itemId) {
        return (Item) sessionFactory.getCurrentSession().get(Item.class, itemId);
    }
}
