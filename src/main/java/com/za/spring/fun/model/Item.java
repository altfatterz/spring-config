package com.za.spring.fun.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.google.common.base.Preconditions;

/**
 * Represents an item.
 *
 * @author Zoltan Altfatter
 */
@Entity
public class Item extends AbstractEntity {

    private String name;

    @OneToMany
    private final List<PropertyDefinition> propertyDefinitions;

    /**
     * Create an Item instance.
     */
    public Item() {
        propertyDefinitions = new ArrayList<PropertyDefinition>();
    }

    /**
     * Add a {@link PropertyDefinition} instance.
     *
     * @param propertyDefinition a {@link PropertyDefinition} instance
     */
    public void addPropertyDefinition(PropertyDefinition propertyDefinition) {
        Preconditions.checkNotNull(propertyDefinition);
        propertyDefinitions.add(propertyDefinition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PropertyDefinition> getPropertyDefinitions() {
        return propertyDefinitions;
    }

}
