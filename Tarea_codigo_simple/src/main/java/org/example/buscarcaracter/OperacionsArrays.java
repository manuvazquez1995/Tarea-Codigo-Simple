package org.example.buscarcaracter;

public class OperacionsArrays {

    /**
     * @param c Este parámetro recibe el carácter a buscar en el array de caracteres.
     * @param v Este parámetro recibe un array de caracteres donde buscar c.
     * @return Devuelve true si encontró en carácter en el array, si no, devuelve false.
     */
    public boolean busca(char c, char[] v) {

        int a, z, m;

        a = 0;

        z = v.length - 1;

        boolean resultado=false;

        while (a <= z && resultado==false) {

            m = (a + z) / 2;

            if (v[m] == c) {

                resultado=true;

            }

            else

            {

                if (v[m] < c) {

                    a = m + 1;

                }

                else{

                    z = m - 1;

                }

            }

        }

        return resultado;

    }

}