package com.bridgelabz;

import java.util.ArrayList;

class House {
    ArrayList<House> houseList = new ArrayList<House>();
    public int houseNo;
    public String houseColor;
    public int housePrice;

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;

    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public void setHouse(int houseNo, String houseColor, int housePrice) {
        House houseObj = new House();
        houseObj.setHouseNo(houseNo);
        houseObj.setHouseColor(houseColor);
        houseObj.setHousePrice(housePrice);
        houseList.add(houseObj);
    }

    public void findLowest() {
        House min = houseList.get(0);
        int size = houseList.size();

        for (int i = 1; i < size; i++) {
            if (min.getHousePrice() > houseList.get(i).getHousePrice()) {
                if(houseList.get(i).getHouseColor()=="red")
                {
                    min = houseList.get(i);
                }
            }
        }
        System.out.println("----Lowest Price House----");
        System.out.println("House No : " + min.getHouseNo() );
        System.out.println("House Color  : " + min.getHouseColor() );
        System.out.println("House Price : " + min.getHousePrice() );
    }

    public void displayHouse() {

        for (House house : houseList) {
            System.out.println("House Details -");
            System.out.println("House No.   = " +house.getHouseNo());
            System.out.println("House Color = " + house.getHouseColor());
            System.out.println("House Price = " + house.getHousePrice());
            System.out.println("--------------------------");
        }
        }

    }



public class Houses {
    public static void main(String[] args) {
        House h1=new House();
        h1.setHouse(101,"red",500000);
        h1.setHouse(102,"red",200000);
        h1.setHouse(103,"red",100000);
        h1.setHouse(104,"blue",400000);
        h1.setHouse(105,"green",100000);
        h1.setHouse(106,"purple",800000);
        h1.findLowest();

    }
}
