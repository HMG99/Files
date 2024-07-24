package service;

import model.Student;

public class StudentService {

    public static Student[] convert(String[] lines) {

        Student[] students = new Student[lines.length];

        for(int i = 0; i < lines.length; i++) {
            students[i] = new Student(lines[i]);
        }
        return students;
    }

    public static Student maxStudent(Student[] students) {
        Student max = students[0];
        for(int i = 1; i < students.length; i++) {
            if(students[i].getYear() < max.getYear()) {
                max = students[i];
            }
        }
        return max;
    }

    public static Student minMarkGirl(Student[] students) {
        Student min = null;

        for(int i = 0; i < students.length; i++) {
            if(students[i].getGender() == 'f') {
                if(min == null) {
                    min = students[i];
                }
                else {
                    if(students[i].getYear() > min.getYear()) {
                        min = students[i];
                    }
                }
            }
        }
        return min;
    }

    public static void sortByYear(Student[] students) {

        for(int i = 0; i < students.length; i++) {
            for(int j = 1; j < students.length - i; j++) {
                if(students[j - 1].getYear() < students[j].getYear()) {
                    Student temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }
    }

}