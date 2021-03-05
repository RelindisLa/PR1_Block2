public class Zinsrechner {
    public static void main(String[] args) {


        float kontostand = 100;
        double zinsWert = 2.25;
        System.out.println("Wie viel Zinsen bekommt man bei " + zinsWert +
                " wenn der Kontostand " + kontostand + " ist?" + zinsenErhalt(20));


    }

    public static double zinsenErhalt (int zinsen){
        double result = zinsen * 2.25;
        return result;
    }

}
