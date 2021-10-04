/*
@Author:ASIM AHAMMED
 */

package com.bridgelab;
public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To  Hotel Reservation System");
    }

    public Hotel addHotel(String hotelName, int weekDayRate) {
        return new Hotel(hotelName, weekDayRate);
    }
}