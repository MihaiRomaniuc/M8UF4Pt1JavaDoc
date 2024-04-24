/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

/**
 * Class representing a hotel within the hotel chain.
 *
 * @author Mihai Romaniuc
 */
public class Hotel {
    public String name; // Name of the hotel
    public String address; // Address of the hotel
    public String web; // Website of the hotel
    public HotelCategory category; // Category of the hotel based on stars
    public Manager manager; // Current manager of the hotel

    /**
     * Constructor for the Hotel class.
     * @param name Name of the hotel.
     * @param address Address of the hotel.
     * @param web Website of the hotel.
     * @param category Category of the hotel.
     * @param manager Manager of the hotel.
     */
    public Hotel(String name, String address, String web, HotelCategory category, Manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.category = category;
        this.manager = manager;
    }

    /**
     * Get the name of the hotel.
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the hotel.
     * @param name The new name of the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address of the hotel.
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the hotel.
     * @param address The new address of the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the website of the hotel.
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Set the website of the hotel.
     * @param web The new website of the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Get the category of the hotel.
     * @return The category of the hotel.
     */
    public HotelCategory getCategory() {
        return category;
    }

    /**
     * Set the category of the hotel.
     * @param category The new category of the hotel.
     */
    public void setCategory(HotelCategory category) {
        this.category = category;
    }

    /**
     * Get the manager of the hotel.
     * @return The manager of the hotel.
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Set the manager of the hotel.
     * @param manager The new manager of the hotel.
     */
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
