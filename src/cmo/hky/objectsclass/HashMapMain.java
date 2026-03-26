package cmo.hky.objectsclass;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Country,String> countryCapitalMap=new HashMap<>();
        Country indiaCountry= new Country("India",10000);
        countryCapitalMap.put(indiaCountry, "Delhi");
        indiaCountry.name="Dummy";
        System.out.println("Capital of India is: "+countryCapitalMap.get(indiaCountry));
    }
}
