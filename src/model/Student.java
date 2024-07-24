package model;

public class Student {
    private String name;
    private String surname;
    private int year;
    private double mark;
    private char gender;

    public Student(String name, String surname, char gender, int year, double mark) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.year = year;
        this.mark = mark;
    }

    public Student(String data) {
        String[] split = data.split(",");
        setName(split[0]);
        setSurname(split[1]);
        setGender(split[2].charAt(0));
        setYear(Integer.parseInt(split[3]));
        setMark(Double.parseDouble(split[4]));
    }


    @Override
    public String toString() {
        return name + " " + surname + " " + year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}