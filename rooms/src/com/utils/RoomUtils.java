package com.utils;

import com.rooms.Room;

import java.util.ArrayList;
import java.util.List;


public class RoomUtils {

    private List<Room> roomList;

    public RoomUtils(){
        roomList = new ArrayList<>();
    }


    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
    public void printRoomList(){
        roomList.forEach(System.out::println);
    }
}
