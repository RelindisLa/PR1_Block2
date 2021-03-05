import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        
        char c = 'A';
        String demo = "Heute ist Freitag!";

        System.out.println("demo.length () = " + demo.length());
        System.out.println("demo.charAt(0) = " + demo.charAt(0));
        System.out.println("demo.charAt(0) = " + demo.charAt(7));

        System.out.println("demo.contains(\"frei\") = " + demo.contains("frei"));
        System.out.println("demo.contains(\"frei\") = " + demo.contains("Frei"));

        System.out.println("demo = " + demo.toLowerCase());
        System.out.println("demo = " + demo.toUpperCase());


        String demo2 = "Heute ist Freitag!";
    }

    public static boolean containsIngnoreCase (String source, String search){
        String sourceLowerCase = source.toLowerCase();
        String searchLowerCase = search.toLowerCase();
        return sourceLowerCase.contains(searchLowerCase);
    }

}
