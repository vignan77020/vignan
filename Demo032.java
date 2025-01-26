import java.util.HashSet;

public class Demo032 {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("India");
        countries.add("Australia");
        System.out.println("Countries in the HashSet: " + countries);
    }
}

