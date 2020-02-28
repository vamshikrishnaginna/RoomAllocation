package com.company;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Room {
    private String roomNumber;
    private String block;
    private int rows;
    private int benchesInRow;
    private List<String> StundetsOfThisRoom=new ArrayList<String>();

    public List<String> getStundetsOfThisRoom() {
        return StundetsOfThisRoom;
    }

    public void setStundetsOfThisRoom(List<String> stundetsOfThisRoom) {
        StundetsOfThisRoom = stundetsOfThisRoom;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getBenchesInRow() {
        return benchesInRow;
    }

    public void setBenchesInRow(int benchesInRow) {
        this.benchesInRow = benchesInRow;
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", block='" + block + '\'' +
                ", rows=" + rows +
                ", benchesInRow=" + benchesInRow +
                '}';
    }
}
