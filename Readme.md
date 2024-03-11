# LIBRERÍA OPERACIONES BÁSICAS

A continuación hemos creado una librería de operaciones, donde podemos realizar
    
1. Suma
2. Resta
3. Multiplicación
4. División

Estas operaciones se eligen a través de un Switch(device)

Devuelve el resultado o null, para que devuelva el resultado debemos trabajar con la clase Float.

Aquí el [JavaDoc](https://ayesa14.github.io/Libreria-Operaciones-Basicas/package-summary.html)

## Pedir datos

Los datos se piden con la librería entrada y salida, que se puede consultar [aquí](https://ayesa14.github.io/Libreria-E-S/com/ayesa/entradasalida/EntradaSalida.html)

## AÑADIDO DEL EXAMEN DE LIBRERÍAS

Creamos una rama nueva, llamada raiz donde vamos a trabajar 

    git branch raiz
    git checkout raiz

Declaramos una constante que se llame RAIZ,  para que sea más legible el codigo, y esta constante será la que nos sirva de opción a elegir cuando queramos seleccionar raiz

    /**
     * Eleccion de operacion raiz
     */
    static final int RAIZ = 5;

### RAICES CUADRADAS Y CÚBICAS

Tras esto en el código añado la opción, y solicito el RADICANDO y el INDICE;

    case RAIZ:
            try{
               float radicando = EntradaSalida.EntradaFloat("De que numero quieres hacer la RAIZ?");
               int indice = EntradaSalida.EntradaInt("Cual es el índice de la raiz?");

            }catch(Exception e){
                System.out.println("Error al hacer la RAIZ");
            }
            break;

Terminamos el código y lo probamos en la Main comprobando que funciona correctamente:

          try{
               float radicando = num2;
               int indice = (int) num1;
               if(indice == 2){
                  resultado=(float) Math.sqrt(radicando);// Math.sqrt y Math.cbrt devuelven un double
               } else if (indice == 3) {
                   resultado=(float) Math.cbrt(radicando);
               }else{
                   System.out.println("Este índice no se contempla");
               }

            }catch(NumberFormatException e){
                System.out.println("Error al realizar la operación RAIZ");
            }

Prueba en la Main:

     Float resultado = OperacionesBasicas.realizar(OperacionesBasicas.RAIZ,3,9);
    System.out.println(resultado);

### RAIZ DE CUALQUIER INDICE    

Para calcular la raíz de cualquier número y no solo de 2 o 3 existe la siguiente fórmula:

    raiz(n, x) = x^(1/n)

Así que borraremos el código anterior y trataremos de aplicar la fórmula:

     try{
               float radicando = num2;
               int indice = (int) num1;
              // raiz(n, x) = x^(1/n)
                resultado= (float)  Math.pow(radicando, 1.0 / indice);

            }catch(NumberFormatException e){
                System.out.println("Error al realizar la operación RAIZ");
            }
            break;

Este sería el nuevo código y lo aplicamos por ejemplo con la raiz cuarta de 16 que debería devolver 2

    Float resultado = OperacionesBasicas.operar(OperacionesBasicas.RAIZ,4,16);
    System.out.println(resultado);
    
    --> Consola: 2.0

Tras esto, hacemos el merge con
    
    git merge --squash

Cambiamos a la Rama Main y hacemos el merge

A continuación hacemos el [JavaDoc]()



