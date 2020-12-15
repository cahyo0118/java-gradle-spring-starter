package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

    public Role() {
    }

    public Role(String name, String display_name, String description) {
        this.name = name;
        this.display_name = display_name;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;
    public String display_name;
    public String description;

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', display_name='%s', description='%s']",
                id, name, display_name, description
        );
    }


}
