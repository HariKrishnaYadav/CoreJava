package com.hky.interview;

public record UserCompactConstructor(String name, int age) {
    // Compact Constructor (Notice: no parentheses)
    public UserCompactConstructor {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        
        name = name.trim(); // Reassigning the parameter changes what gets stored
        // Field assignments happen implicitly here!
    }
}
