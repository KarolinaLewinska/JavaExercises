package com.java.exercises.objects;

public class Human {
    String name;
    int age;
    float weight;
    int height;
    String gender;

    public Human(String name, int age, float weight, int height, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public boolean isMale() {
        if (gender.equals("Man")) {
            System.out.println("Gender is man");
            return true;
        }
        System.out.println("Gender is woman");
        return false;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
    }
}
