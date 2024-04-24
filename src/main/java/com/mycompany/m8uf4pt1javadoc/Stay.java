/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

import java.time.LocalDateTime;

/**
 * Class representing the stay of guests in a hotel.
 *
 * @author Mihai Romaniuc
 */
public class Stay {
    public LocalDateTime startDate; // Start date of the stay
    public LocalDateTime endDate; // End date of the stay
    public Guest[] guests; // Guests staying

    /**
     * Constructor for the Stay class.
     * @param startDate Start date of the stay.
     * @param endDate End date of the stay.
     * @param guests Array of guests staying.
     */
    public Stay(LocalDateTime startDate, LocalDateTime endDate, Guest[] guests) {
        // Ensure that startDate is before endDate and the number of guests is correct for the type of room.
        this.startDate = startDate;
        this.endDate = endDate;
        this.guests = guests;
    }

    /**
     * Get the start date of the stay.
     * @return The start date of the stay.
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /**
     * Set the start date of the stay.
     * @param startDate The new start date of the stay.
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * Get the end date of the stay.
     * @return The end date of the stay.
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /**
     * Set the end date of the stay.
     * @param endDate The new end date of the stay.
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * Get the guests staying.
     * @return The guests staying.
     */
    public Guest[] getGuests() {
        return guests;
    }

    /**
     * Set the guests staying.
     * @param guests The new guests staying.
     */
    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }
}
