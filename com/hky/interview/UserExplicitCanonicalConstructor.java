package com.hky.interview;

public record UserExplicitCanonicalConstructor(String name, int age) {
    // Explicit Canonical Constructor
    public UserExplicitCanonicalConstructor(String name, int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        
        this.name = name.trim();
        this.age = age; // Manual assignment required
    }
}
