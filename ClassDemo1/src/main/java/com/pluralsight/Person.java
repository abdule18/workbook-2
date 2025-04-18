package com.pluralsight;

public class Person {
    private String fullName;
    private int age;
    private String profession;

    public Person(String fullName, int age, String profession){
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getProfession(){
        return this.profession;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public int getAge(){
        return this.age;
    }

    public void setFullName(int age){
        this.age = age;
    }
}
