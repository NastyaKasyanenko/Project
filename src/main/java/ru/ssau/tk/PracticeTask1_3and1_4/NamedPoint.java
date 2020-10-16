package ru.ssau.tk.PracticeTask1_3and1_4;

public class NamedPoint extends Point {
    private String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }
    public NamedPoint(double x,double y,double z,String Name){
        super(x,y,z);
        this.name=Name;
    }
    public NamedPoint(){
        this(0,0,0,"Origin");
    }

    public String getName() {
        return name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

}