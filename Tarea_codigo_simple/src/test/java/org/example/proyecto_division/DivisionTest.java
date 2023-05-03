package org.example.proyecto_division;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisionTest {


    Division division;


    // Antes de testear, tenemos que crear una instancia de la clase división.
    @BeforeEach
    void setUp(){
        division = new Division();
    }


    /* Hacemos dos pruebas con el método, el primero no divide entre 0 y no da error.
    El segundo da error porque le pasamos 0 como divisor. */
    @Test
    void calcularDivision1 () throws Exception {
        division.calcularDivision(4,2);
    }

    @Test
    void calcularDivision2 () throws Exception {
        division.calcularDivision(4,0);
    }



}