package ru.ssau.tk.PracticeTask5_2;

import ru.ssau.tk.PracticeTask5_1.Location;
import ru.ssau.tk.PracticeTask5_1.WaypointType;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public Settlement getSettlement() {
        return settlement;
    }

    public WaypointType getType() {
        return type;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }
}
