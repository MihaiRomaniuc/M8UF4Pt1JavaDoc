/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

/**
 * Class representing a room within a hotel.
 *
 * @author Mihai Romaniuc
 */
public class Room {
    public int number; // Room number
    public RoomType type; // Type of room

    /**
     * Constructor for the Room class.
     * @param number Room number.
     * @param type Type of room.
     */
    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
    }

    /**
     * Get the room number.
     * @return The room number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the room number.
     * @param number The new room number.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Get the type of room.
     * @return The type of room.
     */
    public RoomType getType() {
        return type;
    }

    /**
     * Set the type of room.
     * @param type The new type of room.
     */
    public void setType(RoomType type) {
        this.type = type;
    }
}
