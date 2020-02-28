package com.company;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
   ;

    public static void main(String[] args) {
        String studentArray[] = new String[225];//fetch student list from Firebase
        int TotalRoomCapacity=0;
        int numberOfRooms=7;

	    Room roomsArray[] = new Room[numberOfRooms];
        int start=0,end=0;
	    //Creating mock student data and storing in studentArray
	    for(int i=0 ; i<225;i++)
        {
            studentArray[i]="16911A000_"+i;

        }
        //Creating mock Rooms data and storing in roomsArray
          for(int i=0 ; i<numberOfRooms;i++)
        {
           Room roomObj=new Room();
           roomObj.setRoomNumber("N00"+(i+1));
           roomObj.setBlock("N");
           roomObj.setBenchesInRow(6);
           roomObj.setRows(3);

           roomsArray[i]=roomObj;

        }
        System.out.println("STUDENTS LIST");
          for (int i=0;i<studentArray.length;i++)
          {
              System.out.println(studentArray[i]);
          }
        System.out.println("ROOMS LIST");
        for (int i=0;i<roomsArray.length;i++)
        {
            System.out.println(roomsArray[i]);
        }

        //Actual Processing starts from here

        //First calculate the total seating capacity
        for(int i=0;i<roomsArray.length;i++)
        {
            try{
                int singleRoomCapacity=2*((roomsArray[i].getRows())*(roomsArray[i].getBenchesInRow()));
                TotalRoomCapacity+=singleRoomCapacity;
            }
            catch (Exception e)
            {
                System.out.println("Exception caught"+e);
            }


        }
     if(studentArray.length>TotalRoomCapacity)
     {
         System.out.println("\nNumber of seating not sufficient to allocate all the students");


     }

     else
      {
          for(int i=0;i<roomsArray.length;i++)
          {
              Room currentRoom=roomsArray[i];
              int roomCapacity=2*(currentRoom.getRows()*currentRoom.getBenchesInRow()); //36
              end+=roomCapacity;//0+36
              String studentsOfThisRoom[]=fetchStudents(studentArray,start,end);
              start=end+1;
              List<String> list = Arrays.asList(studentsOfThisRoom);
              roomsArray[i].setStundetsOfThisRoom(list);


          }

          for(int i=0;i<roomsArray.length;i++)
          {
              System.out.println("ROOM NUMBER: "+roomsArray[i].getRoomNumber());
              System.out.println(roomsArray[i].getStundetsOfThisRoom());
          }

     }






    }

    private static String[] fetchStudents(String studentArray[],int start, int end) {
        return Arrays.copyOfRange(studentArray,start,end+1);
    }
}
