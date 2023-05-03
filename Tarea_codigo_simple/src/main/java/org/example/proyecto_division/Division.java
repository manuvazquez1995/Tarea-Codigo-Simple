package org.example.proyecto_division;

public class Division {

    /**
     * @param dividendo Recibe un parámetro de tipo float.
     * @param divisor Recibe un parámetro de tipo float.
     * @return Devuelve un resultado de tipo float siempre que el divisor no sea 0.
     * @throws Exception Se generará en el caso de que el divisor sea 0.
     */
    public float calcularDivision(float dividendo, float divisor) throws Exception {

        if (divisor == 0) {

            throw (new Exception("Error. El divisor no puede ser 0."));

        }

        float resultado = dividendo / divisor;

        return resultado;

    }

}