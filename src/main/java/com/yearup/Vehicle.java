package com.yearup;

import java.util.PrimitiveIterator;

public class Vehicle {

   private long vehiclId;
    private  String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(){
    }

    public Vehicle(long vehiclId , String makeModel, String color, int odometerReading, float price)  {
        this.vehiclId = vehiclId;
        this.makeModel = getMakeModel();
        this.color = getColor();
        this.odometerReading= getOdometerReading();
        this.price= getPrice();


    }


    private long getVehiclId() {
        return vehiclId;
    }

    public void setVehiclId(long vehiclId) {
        this.vehiclId = vehiclId;
    }

    public String getMakeModel() {
        return makeModel;
    }


    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;


    }public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}



