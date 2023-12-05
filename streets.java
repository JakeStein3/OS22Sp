package Oswego;
import java.util.ArrayList;

public class streets {
    public static void main(String[] args) {
        ArrayList<String> street = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        street.add("Iberville");
        street.add("Decatur");
        street.add("Toulouse");
        street.add("Bourbon");
        street.add("Dauphine");
        street.add("Royal");
        street.add("St ann");
        street.add("St peter");
        street.add("Conti");
        street.add("Exchange");
        street.add("Bienville");
        street.add("Dumaine");

        System.out.println("Size of street list" + street.size());
        System.out.println("First Street" + street.get(0));
        System.out.println("last street" + street.get(11));
        System.out.println("last street" + street.get(street.size()-1));

        System.out.println("\nThe initial list");
        for(String streetss: street){
            System.out.println(streetss);
        }

        int streett = primes.get(0);
        street.set(0,street.get(11));
        street.set(streett, street.get(11));
        System.out.println(streett);


    }




}