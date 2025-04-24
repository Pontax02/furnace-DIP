package edu.estatuas.furnace;

public class RemoteCommandSensor implements Thermometer {




     //Obtenemos la temperatura de la habitaión
     @Override
    public double read(RoomTemperature temperature){
        return temperature.getTemperature();
    }
}
