public class DistanceDemo {
    public static void main(String[] args) {
        System.out.println("Wieviel Meilen sind 23 km? " + kilometerToMiles(23));

        System.out.println("Wieviel km sind 23 km? " + milesToKm(23));


    }

    public static double kilometerToMiles (int kilometer){
        double berechneteMeile = 0;
        berechneteMeile = kilometer * 0.6213;
        return berechneteMeile;
    }

    public static double milesToKm (int miles){
        double berechneteKm = 0;
        berechneteKm = miles * 1.6093;
        return berechneteKm;
    }



}
