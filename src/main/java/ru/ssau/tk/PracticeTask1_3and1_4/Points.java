package ru.ssau.tk.PracticeTask1_3and1_4;
import ru.ssau.tk.PracticeTask1_3and1_4.Point.*;
    public class Points {
        private Points(){

        }
        public static Point sum(Point A, Point B){
            return new Point(A.x + B.x, A.y + B.y, A.z + B.z);
        }
        public static Point subtract(Point A, Point B){
            return new Point(A.x - B.x, A.y - B.y, A.z - B.z);
        }
        public static Point multiply(Point A, Point B){
            return new Point(A.x * B.x, A.y * B.y, A.z * B.z);
        }
        public static Point divide(Point A, Point B){
            return new Point(A.x / B.x, A.y / B.y, A.z / B.z);
        }
}
