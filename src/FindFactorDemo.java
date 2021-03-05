public class FindFactorDemo {
    public static void main(String[] args) {

        /* finde alle möglichen Teiler einer Zahl
        - aim of the Method: name => findFactors
        - what is required to work: parameters => int number
        what needs the method to return to the caller: return value => void
        */

        findFactors(21);
        findFactors(10);
        findFactors(30);
        findFactors(3981);

    }
    public static void findFactors(int number) {
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter + ", ");
            }
            counter++;
        }
        System.out.println();


    }
}
