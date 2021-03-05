public class DemoCalcDigit {
    public static void main(String[] args) {

        System.out.println("calcDigitSum(54321) = " + calcDigitSum(54321));
        System.out.println("calcDigitSum(54321) = " + calcDigitSum(9876543));
        System.out.println("calcDigitSum(54321) = " + calcDigitSum(12));
    }

    public static int calcDigitSum(int value) {
        int ziffernsumme = 0;
        while (value > 0) {
            ziffernsumme = ziffernsumme + (value % 10);
            value = value / 10;
        }
        return ziffernsumme;
    }
}
