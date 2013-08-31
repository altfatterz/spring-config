package com.za.spring.fun.model;

import javax.persistence.Entity;

/**
 * Represents a property of an item.
 *
 * @author Zoltan Altfatter
 */
@Entity
public class PropertyDefinition extends AbstractEntity {

    private final String name;
    private final String value;

    /**
     * Create a PropertyDefinition instance.
     *
     * @param name the name of the property
     * @param value the value of the property
     */
    public PropertyDefinition(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

}
