public class DistanceDemo {
    public static void main(String[] args) {

        int kmValue = 12;
        System.out.println("Wieviel Meilen sind " + kmValue + " km? " + kilometerToMiles(kmValue) + " meilen.");

        int milesValue = 40;
        System.out.println("Wieviel km sind " + milesValue + " km? " + milesToKm(milesValue) + " km.");

        double fahrenheitValue = 0;
        System.out.println("Wieviel Grad Fahrenheit sind " + fahrenheitValue + "° in Grad Celsius? "
                + celsiusToFahrenheit(fahrenheitValue) + ".");

        double celsiusValue = 4.6;
        System.out.println("Wieviel Grad Celsius sind " + celsiusValue + "° in Grad Fahrenheit? "
                + fahrenheitToCelsius(celsiusValue) + "°F.");





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

    public static double celsiusToFahrenheit (double celsius){
        double result = (celsius * 8/5) -32;
        return result;
    }

    public static double fahrenheitToCelsius (double fahrenheit){
        return (fahrenheit * 1.8) + 32;
    }

}
