/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

/**
 * Class representing a hotel guest, inheriting from the Person class.
 * 
 * @author Mihai Romaniuc
 */
public class Guest extends Person {
    public String nationality; // Nationality of the guest

    /**
     * Constructor for the Guest class.
     * @param name Name of the guest.
     * @param identifier Unique identifier of the guest.
     * @param nationality Nationality of the guest.
     */
    public Guest(String name, String identifier, String nationality) {
        super(name, identifier);
        this.nationality = nationality;
    }

    /**
     * Gets the nationality of the guest.
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality of the guest.
     * @param nationality The new nationality of the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
