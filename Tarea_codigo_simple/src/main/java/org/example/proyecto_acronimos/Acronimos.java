package org.example.proyecto_acronimos;

public class Acronimos {


    /**
     * @param cadena Recibe un String.
     * @return Devuelve otra cadena con el acrónimo, que será la primera letra de cada palabra separado
     * de un punto cuando el carácter es diferente de espacio en blanco.
     */
    public String obtenerAcronimo(String cadena){

        String resultado="";

        char caracter;

        int n=cadena.length();

        for(int i=0;i<n;i++){

            caracter=cadena.charAt(i);

            if(caracter!=' '){

                if (i==0){

                    resultado=resultado+caracter+'.';

                }

                else{

                    if(cadena.charAt(i-1)==' '){

                        resultado=resultado+caracter+'.';

                    }

                }

            }

        }

        return resultado;

    }

}