/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m8uf4pt1javadoc;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Mihai Romaniuc
 */
public class Main {

    public static void main(String[] args) {
        // Crear el gerent de l'hotel
        LocalDate startDateManager = LocalDate.of(2013, 7, 1);
        Manager hotelManager = new Manager("Clara Farré", "12345678A", startDateManager);

        // Crear l'hotel
        Hotel hotelAiguaclara = new Hotel(
            "Aiguaclara",
            "Carrer Montserrat 34, Begur, Girona",
            "www.aiguaclara.com",
            HotelCategory.FOUR_STARS,
            hotelManager
        );

        // Crear les persones que es quedaran a l'hotel
        Guest guest1 = new Guest("Sophie Dómine", "43210987B", "Francesa");
        Guest guest2 = new Guest("Logan Rousseau", "98237645C", "Francesa");

        // Crear una habitació doble
        Room doubleRoom = new Room(110, RoomType.DOUBLE);

        // Estableix les dates d'estada
        LocalDateTime startDate = LocalDateTime.of(2024, 7, 13, 14, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 7, 20, 12, 0);

        // Crear l'estada
        Stay stay = new Stay(startDate, endDate, new Guest[]{guest1, guest2});

        // Informació per mostrar
        System.out.println("Informació de l'hotel Aiguaclara:");
        System.out.println("Nom: " + hotelAiguaclara.getName());
        System.out.println("Adreça: " + hotelAiguaclara.getAddress());
        System.out.println("Web: " + hotelAiguaclara.getWeb());
        System.out.println("Categoria: " + hotelAiguaclara.getCategory());

        System.out.println("\nGerent:");
        System.out.println("Nom: " + hotelManager.getName());
        System.out.println("Identificador: " + hotelManager.getIdentifier());
        System.out.println("Data d'inici: " + hotelManager.getStartDate());
        System.out.println("Experiència: " + hotelManager.getExperience() + " anys");

        System.out.println("\nEstada:");
        System.out.println("Data d'inici: " + stay.getStartDate());
        System.out.println("Data de fi: " + stay.getEndDate());
        System.out.println("Habitació: " + doubleRoom.getNumber());
        System.out.println("Tipus d'habitació: " + doubleRoom.getType());
        System.out.println("Hostes:");
        for (Guest guest : stay.getGuests()) {
            System.out.println(" - " + guest.getName() + " (" + guest.getIdentifier() + ", " + guest.getNationality() + ")");
        }
    }
}

/**
 * Enumeration for hotel categories based on the number of stars.
 */
enum HotelCategory {
    ONE_STAR, TWO_STARS, THREE_STARS, FOUR_STARS, FIVE_STARS
}

/**
 * Enumeration for types of rooms available at a hotel.
 */
enum RoomType {
    INDIVIDUAL, DOUBLE, SUITE
}