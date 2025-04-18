package com.pluralsight;

public class Person {


    private String fullName;
    private int age;
    private String profession;

    public Person(String fullName, int age, String profession) {
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
    }

   public String getFullName() {
        return this.fullName;
   }

   public void setAge(String newFullName) {
        this.fullName = fullName;
   }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.fullName = fullName;
    }
    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String newProfession) {
        this.profession = profession;
    }
}
