package edu.estatuas.furnace;

public class GasHeater implements Heater {






    @Override
    public void engage(RoomTemperature temperature) {

        temperature.heatRoom(+1);

    }
    @Override
    public void disengage(RoomTemperature temperature){

        temperature.heatRoom(-1);

    }

}
