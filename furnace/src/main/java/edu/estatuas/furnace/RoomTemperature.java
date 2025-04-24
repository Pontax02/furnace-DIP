package edu.estatuas.furnace;

public class RoomTemperature {

    public double temperature;

    private static RoomTemperature instance = null;

    private RoomTemperature(){}

   public static RoomTemperature getInstance() {
        if (instance == null) {
            instance = new RoomTemperature();
        }
        return instance;


    }
    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void heatRoom(double heat){
        this.temperature = heat;
    }

}
