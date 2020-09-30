package ru.ssau.tk.PracticeTask1_3and1_4;
import ru.ssau.tk.PracticeTask1_3and1_4.Point.*;
    public class Points {
        private Points(){

        }
        public static Point sum(Point per1, Point per2){
            return new Point(per1.x + per2.x, per1.y + per2.y, per1.z + per2.z);
        }
        public static Point subtract(Point per1, Point per2){
            return new Point(per1.x - per2.x, per1.y - per2.y, per1.z - per2.z);
        }
        public static Point multiply(Point per1, Point per2){
            return new Point(per1.x * per2.x, per1.y * per2.y, per1.z * per2.z);
        }
        public static Point divide(Point per1, Point per2){
            return new Point(per1.x / per2.x, per1.y / per2.y, per1.z / per2.z);
        }
        public static Point enlarge(Point peremennaya,double c){
            return new Point(peremennaya.x*c,peremennaya.y*c,peremennaya.z*c);
        }
        static Point opposite(Point peremennaya){
            return new Point(peremennaya.x*-1,peremennaya.y*-1,peremennaya.z*-1);
        }
        static Point inverse(Point peremennaya){
            return new Point(1/peremennaya.x, 1/peremennaya.y, 1/peremennaya.z);
        }
}
