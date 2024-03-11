/**
 * A continuación creamos una librería para hacer operaciones básicas
 * (Suma,Resta,Multiplicación,División) con control de errores
 * @author ayesa
 * @version 1.0
 */
public class OperacionesBasicas {
    /**
     * creamos las diferentes opciones a elegir  + el resultado
     */
    private static Float resultado = null;
    /**
     * Eleccion de operacion sumar
     */
    static final int SUMA = 1;
    /**
     * Eleccion de operacion restar
     */
    static final int RESTA = 2;
    /**
     * Eleccion de operacion multiplicar
     */
    static  final int MULTIPLICACION = 3;
    /**
     * Eleccion de operacion dividir
     */
    static  final  int DIVISION = 4;
    /**
     * Eleccion de operacion raiz
     */
    static final int RAIZ = 5;

    /**
     * Constructor por defecto en privado ya que no queremos crear un objeto de esta librería
     */
    private OperacionesBasicas(){}


    /**
     *
     * @param device Elección de operacion que se quiere realizar
     * @param num1 primer número de la operación
     * @param num2 segundo número de la operación
     * @return Float resultado una variable estatica que nos dá el resultado de la operación.
     */
    public static Float operar(int device, float num1,float num2){ //retornamos FLOAT para poder devolver null
        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;

                }catch (Exception e){
                    System.out.println("ERROR EN LA SUMA");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;

                }catch (Exception e){
                    System.out.println("ERROR EN LA RESTA");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1 * num2;

                }catch (Exception e){
                    System.out.println("ERROR EN LA MULTIPLICACIÓN");
                }
                break;
            case DIVISION:
                try{
                    resultado =num1 / num2;
                }catch (Exception e){
                    System.out.println("ERROR EN LA DIVISIÓN");
                }
                break;
            case RAIZ:
                try{
                    float radicando = num2;
                    int indice = (int) num1;
                    // raiz(n, x) = x^(1/n)
                    resultado= (float)  Math.pow(radicando, 1.0 / indice);

                }catch(NumberFormatException e){
                    System.out.println("Error al realizar la operación RAIZ");
                }
                break;
            default:
                System.out.println("NO HA SELECCIONADO LA OPCIÓN CORRECTA");
                break;
        }
        return resultado;

    }
}
