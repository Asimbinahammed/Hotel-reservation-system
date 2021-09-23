/*
@Author:ASIM AHAMMED
 */

package com.bridgelab;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    ArrayList hotelList=new ArrayList();
    public void addHotel(String hotelName, int regularCustomerRate) {
        Hotel hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRegularCustomerCost(regularCustomerRate);
        Hotel.add(hotel);
    }

}
