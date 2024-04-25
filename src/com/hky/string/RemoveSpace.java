package com.hky.string;

import java.util.stream.Collectors;

public class RemoveSpace {
    public static void main(String[] args) {
        String stringWithSpaces = "This is a string with spaces";
        String stringWithoutSpaces = stringWithSpaces.replaceAll("\\s+", "");
        System.out.println(stringWithoutSpaces);

        String stringWithoutSpaces1 = stringWithSpaces.replace(" ", "")
                .replace("\t", "")
                .replace("\n", "")
                .replace("\r", "");
        System.out.println(stringWithoutSpaces1);




        String stringWithoutSpaces2 = stringWithSpaces.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        System.out.println(stringWithoutSpaces2);


    }
}
