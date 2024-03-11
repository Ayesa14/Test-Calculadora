import com.ayesa.entradasalida.EntradaSalida;

public class Main {
    /**
     * Aquí ponemos a prueba los metodos de la clase operacionesbáscias
     * @param args Argumentos que le pasamos al "Method" main
     */
    public static void main(String[] args) {
            /*EntradaSalida.salida("Hello",EntradaSalida.SALIDA_CONSOLA);
            Float num1 = EntradaSalida.EntradaFloat("Introduce el primer número");
            Float num2 = EntradaSalida.EntradaFloat("Introduce el segundo número");
            float resultado = OperacionesBasicas.operar(OperacionesBasicas.MULTIPLICACION,num1,num2);
            EntradaSalida.salida(String.valueOf(resultado),EntradaSalida.SALIDA_VENTANA);
            if(num1 == null || num2 == null){
                EntradaSalida.salida("Tiene que ser un número, no una letra", EntradaSalida.SALIDA_CONSOLA);
            }
            else {
                resultado =OperacionesBasicas.operar(OperacionesBasicas.MULTIPLICACION, num1, num2);
                if (Float.isNaN(resultado)){
                    EntradaSalida.salida("ERROR",EntradaSalida.SALIDA_CONSOLA);
                } else {
                    EntradaSalida.salida(("El resultado de la operación es " + resultado), EntradaSalida.SALIDA_VENTANA);
                }
            }*/

        Float resultado = OperacionesBasicas.operar(OperacionesBasicas.RAIZ,4,16);
        System.out.println(resultado);
        }
    }
