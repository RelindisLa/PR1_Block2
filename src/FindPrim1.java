public class FindPrim1 {
    public static void main(String[] args) {

        System.out.println("ist diese Zahl eine Primzahl? " + isPrim(23));


    }

    public static boolean isPrim (int number) {
        for (int checkValue = 2; checkValue < number /2; checkValue++) {
    if (number % checkValue == 0){
        return false;
    }
        }
        return  true;
    }
}
