public class LoopDemo {
    public static void main(String[] args) {

        /* while (true) {
            System.out.println("Der Pinguin schlug die Zeitung auf, und da stand:");
        }  <<< ist eine endlosschleife!*/

        int counter = 4;
        while (counter > 0) {
            counter --; // = counter -1
            System.out.println(counter + ": Der Pinguin schlug die Zeitung auf, und da stand:");
        }

        int counter1 = 0;
        while (counter1 < 10) {
            counter1 ++;
            if (counter1 % 2 == 1) {
                System.out.println(counter1 + ": ping");
            }
                else {
                System.out.println(counter1 + ": pong");
            }

        }



    }
}
