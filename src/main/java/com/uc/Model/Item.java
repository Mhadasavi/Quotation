package com.uc.Model;

import javax.persistence.*;

@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String size;
    public String unitType;
    public Double unitPrice;
}
