package com.java.exercises.objects;

public class Human {
    String name;
    Integer age;
    Float weight;
    Integer height;
    String gender;

    public Human(String name, Integer age, Float weight, Integer height, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Float getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean isMale() {
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
