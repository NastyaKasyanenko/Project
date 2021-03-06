package ru.ssau.tk.PracticeTask5_1;

public class Location {
    private int id;
    private String name;
    private double latitude;
    private double longitude;
    public Location(){

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public static class SettlementType {
        public static final SettlementType VILLAGE = new SettlementType();
    }
}
