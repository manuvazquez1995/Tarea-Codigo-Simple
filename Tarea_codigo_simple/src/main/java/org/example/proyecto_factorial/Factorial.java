package org.example.proyecto_factorial;

public class Factorial {

    /**
     * @param n Recibe un número de tipo byte.
     * @return Devuelve el factorial de tipo float del parámetro n.
     * @throws Exception Lanza una excepción en el caso de que sea negativo.
     */
    public float factorial(byte n) throws Exception {

        if (n < 0) {

            throw new Exception("Error. El número tiene que ser >=0");

        }

        float resultado = 1;

        for (int i = 2; i <= n; i++) {

            resultado *= i;

        }

        return resultado;

    }

}