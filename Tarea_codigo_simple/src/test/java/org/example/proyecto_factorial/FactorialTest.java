package org.example.proyecto_factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {


    Factorial factorial;


    @BeforeEach
    void setUp(){
        factorial = new Factorial();
    }


    // Este test lo pasa ya que los parámetros que se le pasan son 0 o mayor.
    @Test
    void factorial1() throws Exception {
        factorial.factorial((byte) 0);
        factorial.factorial((byte) 1);
    }


    // Este test no lo pasa porque el parámetro que se le pasa es menor que 0.
    @Test
    void factorial2() throws Exception {
        factorial.factorial((byte) -1);
    }



}