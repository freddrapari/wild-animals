/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.animals;

/**
 *
 * @author hp
 */
public class Animals {

    // Fields
    private String name;
    private int age;

    // Constructor
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods for name and age
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    // Overloaded method to make sound multiple times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // Method to eat
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Overloaded method to eat a specific type of food
    public void eat(String foodType) {
        System.out.println(name + " is eating " + foodType + ".");
    }

    // Main method for testing
    public static void main(String[] args) {
        Animals dog = new Animals("Buddy", 5);
        dog.makeSound();
        dog.makeSound(3);
        dog.eat();
        dog.eat("bone");
    }
}

    
    
