package cmo.hky.statics;

import java.util.ArrayList;
import java.util.List;

public class CountryCache {

    public static List<String> countries = new ArrayList<>();

    static {
        countries.add("India");
        countries.add("USA");
        countries.add("UK");

    }

    public static void main(String[] args) {
        List<String> list = CountryCache.countries;
        for (String country : list) {
            System.out.println(country);
        }

    }
}
