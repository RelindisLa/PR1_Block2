public class RechnerDreiFS {
    public static void main(String[] args) {

        //write a loop between 1 and 100, which could be divided by 3, 5, or 7

        int counter = 0;
        while (counter < 25) {
            counter ++;
            if (counter % 3 == 0) {
                System.out.println(counter + ": :3");
            }
            else if (counter % 5 == 0) {
                System.out.println(counter + ": :5");
            }
            else if (counter % 7 == 0) {
                System.out.println(counter + ": :7");
            }
        }

        int counter1 = 0;
        while (counter1 < 30) {
            counter1 ++;
            if (counter1 % 3 == 0 || counter1 % 5 == 0 || counter1 % 7 == 0)
                System.out.println(counter1 + ": durch 3, 5 oder 7 div");
        }

        // wenn der Zähler zu gross ist, wird die Schleife nicht begonnen
        int counter3 = 30;
        while (counter3 < 20) {
            System.out.println("counter < 30");
        }


        //do while wird immer mind 1x durchgelaufen!
        do {
            System.out.println("counter < 30");
        }
            while (counter3 < 20);

    }
}
