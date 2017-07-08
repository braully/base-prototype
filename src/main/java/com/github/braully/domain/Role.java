//
// This file was generated by the JPA Modeler
//
package com.github.braully.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Role extends AbstractEntity implements Serializable {

    @Column(unique = true)
    @Basic
    private String name;

    @ManyToMany(targetEntity = Menu.class)
    private List<Menu> menus;

    public Role() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenus() {
        return this.menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}