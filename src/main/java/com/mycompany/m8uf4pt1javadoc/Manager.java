/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

import java.time.LocalDate;

/**
 * Class representing a hotel manager, inheriting from the Person class.
 * Includes specific attributes and methods for a manager.
 * 
 * @author Mihai Romaniuc
 */
public class Manager extends Person {
    public LocalDate startDate; // Start date of management
    public int experience; // Years of experience

    /**
     * Constructor for the Manager class.
     * @param name Name of the manager.
     * @param identifier Unique identifier of the manager.
     * @param startDate Start date of the manager's employment.
     */
    public Manager(String name, String identifier, LocalDate startDate) {
        super(name, identifier);
        this.startDate = startDate;
        this.experience = calculateExperience();
    }

    /**
     * Calculates the manager's years of experience.
     * @return Number of years of experience.
     */
    private int calculateExperience() {
        return LocalDate.now().getYear() - startDate.getYear();
    }

    /**
     * Gets the start date of management.
     * @return The start date of management.
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of management.
     * @param startDate The new start date of management.
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the years of experience of the manager.
     * @return The years of experience of the manager.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the years of experience of the manager.
     * @param experience The new years of experience of the manager.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
