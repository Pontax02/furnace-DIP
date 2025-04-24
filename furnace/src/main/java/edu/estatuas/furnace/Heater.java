package edu.estatuas.furnace;

public interface Heater {
    void engage(RoomTemperature temperature);
    void disengage(RoomTemperature temperature);


}
