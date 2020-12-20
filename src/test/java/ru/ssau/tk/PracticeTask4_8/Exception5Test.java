package ru.ssau.tk.PracticeTask4_8;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.PracticeTask4_8.Exception5.throwCheckedException;

public class Exception5Test {

    @Test
    public void test() {
        try {
            throwCheckedException();
        } catch (Exception5 e) {
            e.getCause();
        }
    }
}