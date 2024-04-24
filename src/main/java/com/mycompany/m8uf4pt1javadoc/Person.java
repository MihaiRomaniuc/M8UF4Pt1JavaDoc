/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

/**
 * Base class representing a person related to the hotel.
 * Includes common attributes for all types of people involved.
 * 
 * @author Mihai Romaniuc
 */
public class Person {
    public String name; // Name of the person
    public String identifier; // Unique identifier (e.g., DNI or passport number)

    /**
     * Constructor for the Person class.
     * @param name Name of the person.
     * @param identifier Unique identifier of the person.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Gets the name of the person.
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the unique identifier of the person.
     * @return The unique identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the unique identifier of the person.
     * @param identifier The new unique identifier of the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
