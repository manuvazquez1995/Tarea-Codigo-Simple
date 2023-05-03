package org.example.buscarcaracter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesArraysTest {


    OperacionsArrays operacionsArrays;


    @BeforeEach
    void setUp(){
        operacionsArrays = new OperacionsArrays();

    }


    @Test
    void busca(){
        char[] c1;
        c1 = new char[]{'a', 'b', 'c', 'd'};
        operacionsArrays.busca('a', c1);
    }



}