public class FindPrim {
    public static void main(String[] args) {
        /* Find Prim numbers
        1. write a program and a methode "IsPrim", which checks a number,
           if a given numer is a prim ro not (boolean), and gives this result to the caller
        2. Alle Primzahlen, zwischen 2 u 1234 ausgeben.
         */
        System.out.println("ist Prime? " + isPrime1(19));

        System.out.println("Start:");
        System.out.print("Ist Pime: " + isPrime(42));
        System.out.print("Ist Pime: " + isPrime(99961));
        System.out.print("Ist Pime: " + isPrime(906847));
        System.out.print("Ist Pime: " + isPrime(999983));
        System.out.print("Ist Pime: " + isPrime(1991999993));

        int checkNumbers = 2;

        while (checkNumbers <= 1234) {
            if (isPrime(checkNumbers)) {
                System.out.print(checkNumbers + ", ");
            }
            checkNumbers++;
        }

        int counter = 1;            //Initialisierung, Startwert festlegen
        while (counter < 1000) {    // Abbruchbedingung
            //some code
            counter ++;             //increment, Erhöhung des Zählers
        }

        for (int index = 0; index < 10; index++){
            //Startwert, Abbruchbedingung, zählererhöhung
            //some code
        }

    }

    public static boolean isPrime(int number) {
        int checkValue = 2;
        boolean checkIsPrime = true;

        while (checkValue < number) {
            if (number % checkValue == 0) {
             checkIsPrime = false;
             break;
            }
            checkValue++;
        }
        return checkIsPrime;
    }

    public static boolean isPrime1 (int number1) {
        for (int checkValue1 = 2; checkValue1 < 2; checkValue1++ ) {
                if (number1 % checkValue1 == 0) {
                    return false;
                }
            }
        return true;
    }

}
