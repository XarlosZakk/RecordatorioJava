public class ConversionesJava {
    public static void main(String[] args) {
        //* conversiones en Java
        //todo: ensanchamiento de la funcion
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //todo: Reduccion de la longitud de la cola
        myDouble = 9.78d;
        myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
