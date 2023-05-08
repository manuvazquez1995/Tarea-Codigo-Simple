package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {


    @Test
    @DisplayName("Dividendo y divisor -> Valor mínimo")
    public void testC1() throws Exception{
        float resultado = Utilidades.calcularDivision(Float.MIN_VALUE, Float.MIN_VALUE);
        assertEquals(1F, resultado);
    }


    @Test
    @DisplayName("Dividendo y divisor -> valor máximo")
    public void testC2() throws Exception {
        float resultado = Utilidades.calcularDivision(Float.MAX_VALUE, Float.MAX_VALUE);
        assertEquals(1F, resultado);
    }




}