package com.vaisshcodes.springboot.business;

import lombok.Data;

import java.util.Date;

@Data
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;
}
