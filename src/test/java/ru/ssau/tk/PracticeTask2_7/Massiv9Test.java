package ru.ssau.tk.PracticeTask2_7;

        import org.testng.annotations.Test;

        import static org.testng.Assert.*;

public class Massiv9Test {
    double DELTA = 0.0001;

    @Test
    public void _2test() throws Exception {
        double[] _2Eqution = Massiv9.number(0, 2, -4);
        assertEquals(_2Eqution[0], 2, DELTA);
    }

    @Test
    public void _1test() throws Exception {
        double[] _1SEqution = Massiv9.number(1, 1, -2);
        assertEquals(_1SEqution[0], 1, DELTA);
        assertEquals(_1SEqution[1], -2, DELTA);
    }

    @Test
    public void testNuN() throws Exception {
        try {
            double[] DoesNotExist = Massiv9.number(0, 0, 8);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решений нет");
        }

        try {
            double[] emptyEqution = Massiv9.number(0, 0, 0);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение - комлпексное число");
        }

        try {
            double[] ComplexNumbers = Massiv9.number(1, 3, 7);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение - вещественное число");
        }
    }
}