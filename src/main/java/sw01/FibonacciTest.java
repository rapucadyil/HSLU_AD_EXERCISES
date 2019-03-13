package main.java.sw01;
import static org.junit.jupiter.api.Assertions.*;
class FibonacciTest {

    @org.junit.jupiter.api.Test
    void test_fibRec1() {
        assertEquals(3, Fibonacci.fibRec1(4));
        assertEquals(0, Fibonacci.fibRec1(0));
        assertEquals(1, Fibonacci.fibRec1(1));
    }


    @org.junit.jupiter.api.Test
    void test_fibRec2() {

    }

    @org.junit.jupiter.api.Test
    void test_fibIter() {
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(0, Fibonacci.fibIter(0));
        assertEquals(1, Fibonacci.fibIter(1));
    }
}