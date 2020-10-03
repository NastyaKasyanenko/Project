package ru.ssau.tk._Anastasia_._PROJECT_;
public class Trialcode2 {
    public int i;
    public void print() {
        System.out.println("Trialcode2.i = " + i);
    }
}

 class D extends Trialcode2 {
    public String i;

    public D(String a, int b) {
        i = a;
        super.i = b;
    }

    public void print() {
        System.out.println("D.i = " + i);
        super.print();
    }
}


 class UseSuper {
    public static void main(String[] args) {
        D d = new D("someString", 2);
        d.print();
        System.out.println(d.i);
    }
}
