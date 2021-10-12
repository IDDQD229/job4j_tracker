package ru.job4j.oop;

public class Profession {

    private final String name;
    private final String surname;
    private final String education;
    private final double birhday;

    public Profession(String name, String surname, String education, double birhday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birhday = birhday;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getEducation(){
        return education;
    }

    public double getBirhday(){
        return birhday;
    }
}
