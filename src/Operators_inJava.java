public class Operators_inJava {
    public static void main(String[] args) {
        //todo: operadores en Java
        /*
        todo: Java divide los operadores en los siguientes grupos:
         Operadores aritméticos
         Operadores de asignación
         Operadores de comparación
         Operadores lógicos
         Operadores bit a bit
        */
        //! operadores Aridmeticos
        int numeroUno = 5;
        int numeroDos = 10;

        //? suma
        int resultadoSuma = numeroUno + numeroDos;
        System.out.println(resultadoSuma);//* imprime el numero R: 15
        //? resta
        int resultadoResta = numeroUno - numeroDos;
        System.out.println(resultadoResta);//* imprime el numero R: 10
        //? Multiplicacion
        int resultadoMulti = numeroUno * numeroDos;
        System.out.println(resultadoMulti);//* imprime el numero R: 50
        //? Division
        int resultadoDiv = numeroUno / numeroDos;
        System.out.println(resultadoDiv);//* imprime el numero R: 0
        //? Modulo
        int resultadoMod = numeroUno % numeroDos;
        System.out.println(resultadoMod);//* imprime el numero R: 5
        //! incremento
        int valorIncremento = 6;
        int respuesta = ++valorIncremento;
        System.out.println(respuesta);
        //! decremento
        int respuestadecremento = --valorIncremento;
        System.out.println(respuestadecremento);

        //todo: Operadores de asignacion
        int number1 = 100;//? le asigno el valor de 10 mediante el simbolo ==> '='
        System.out.println(number1);

        //! operador de asignacion SUMAR ==> '+='
        number1 += 10;// le sumo 10 al valor de 100
        System.out.println(number1);// lo muestro por consola

        //! operador de asignacion RESTAR ==> '+='
        int valorRestar = 10;
        valorRestar -= 1;// le resto 1 al valor de 10
        System.out.println(valorRestar);// lo imprimo

        //! operador de asignacion MULTIPLICAR ==> '+='
        int valorMultiplicar = 5;
        valorMultiplicar *= 2;
        System.out.println(valorMultiplicar);//* devuelve 10 ==> (5 * 2 = 10)

        //! operador de Division ==> '/='
        int valDivision = 25;
        valDivision /= 5;
        System.out.println(valDivision);// * devuelve 5

        //! existen mas operadores de asignacion, pero estos son los mas usados

        //todo: operadores de Comparacion
        /*todo:
           ("==", "!=", ">", "<", ">=", "<=")
           //mas adelante los usaremos
        */

        //todo: operadores logicos
        //? and ==> &&
        //!Devuelve verdadero si ambas afirmaciones son verdaderas

        //? or  ==> ||
        //!Devuelve verdadero si una de las afirmaciones es verdadera

        //? not ==> !
        //!Invierte el resultado, devuelve falso si el resultado es verdadero

        //* hasta aqui la seccion de los operadores de java, mas adelante los usaremos casi todos en su mayoria
    }
}
