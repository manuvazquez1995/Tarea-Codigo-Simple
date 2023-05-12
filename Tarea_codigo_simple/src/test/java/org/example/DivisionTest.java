package org.example;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {


    @Test
    @DisplayName("Dividendo y divisor -> valor mínimo")
    public void testC1() throws Exception {
        float resultado = Utilidades.calcularDivision(Float.MIN_VALUE, Float.MIN_VALUE);
        assertEquals(1F, resultado);
    }

    @Test
    @DisplayName("Dividendo y divisor -> valor máximo")
    public void testC2() throws Exception {
        float resultado = Utilidades.calcularDivision(Float.MAX_VALUE, Float.MAX_VALUE);
        assertEquals(1F, resultado);
    }

    @Test
    @DisplayName("Dividendo y divisor -> valor mínimo y máximo")
    public void testC3() throws Exception {
        float resultado = Utilidades.calcularDivision(Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE/ Float.MAX_VALUE);
        assertEquals(4.1181E-84, resultado, 1E-83);
        // https://es.stackoverflow.com/a/510839/310736
    }

    @Test
    @DisplayName("Dividendo y divisor -> valor máximo y mínimo")
    @Disabled("Revisar valores máximos y mínimos de especificaciones")
    public void testC4() throws Exception {
        float resultado = Utilidades.calcularDivision(Float.MAX_VALUE, Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE/ Float.MIN_VALUE);
        assertEquals(2.4283E+83, resultado);
        // TODO: Deberíamos cuestionarnos los varlores máximos y mínimos de nuestras especificaciones
    }

    @Test
    @DisplayName("Dividendo y divisor -> valor 1 y 3 (resultado periódico)")
    public void testC5() throws Exception {
        float resultado = Utilidades.calcularDivision(1F, 3F);
        assertEquals(0.333333, resultado, 1E-6);  // Cambiar delta a 1E-6 y ver que falla
        // Podríamos modificar la división para incluir el redondeo
    }

    @Test
    @DisplayName("Dividendo y divisor -> valor 0 y mínimo")
    public void testC6() throws Exception {
        float resultado = Utilidades.calcularDivision(0F, Float.MIN_VALUE);
        assertEquals(0, resultado);
    }


    @DisplayName("Divisor 0")
    @Test
    public void testException() {
        Exception e = Assertions.assertThrows(Exception.class, () -> {
            Utilidades.calcularDivision(1, 0);
        });
        Assertions.assertEquals("Error. El divisor no puede ser 0.", e.getMessage());
    }

    @Test
    public void testDivisionImplicita() {
        Assertions.assertThrows(Exception.class, () -> {
            float i = 1 / 0;
        });
        Assertions.assertThrows(ArithmeticException.class, () -> {
            float i = 1 / 0;
        });
/*        Assertions.assertThrows(NumberFormatException.class, () -> {
            float i = 1 / 0;
        });*/

    }

    @Test
    void testExpectedException() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }




}