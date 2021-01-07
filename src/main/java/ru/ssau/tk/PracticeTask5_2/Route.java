package ru.ssau.tk.PracticeTask5_2;

import ru.ssau.tk.PracticeTask5_1.Location;

import java.util.ArrayList;

public class Route {
    private ArrayList<Location> locations = new ArrayList<>();

    public ArrayList<Location> getLocation() {
        return locations;
    }

    public void addLocation(Location location){
        this.locations.add(location);
    }

    public void addIndexLocation(int index,Location location){
        this.locations.add(index,location);
    }

    public void deleteLocation(int index){
        this.locations.remove(index);
    }
}
