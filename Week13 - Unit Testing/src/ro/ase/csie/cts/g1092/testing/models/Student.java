package ro.ase.csie.cts.g1092.testing.models;

import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongGradesException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static final int MIN_AGE = 14;
    public static final int MAX_AGE = 90;
    public static final int MIN_GRADE = 1;
    public static final int MAX_GRADE = 10;
    public static final int MIN_NAME_SIZE = 3;
    public static final int MAX_NAME_SIZE = 255;

    protected String name;
    protected int age;
    protected List<Integer> grades;


    public Student(String name, int age, List<Integer> grades) {
        super();
        this.name = name;
        this.age = age;
        this.grades = grades;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) throws WrongNameException {
        if(name.length() < MIN_NAME_SIZE || name.length() >  MAX_NAME_SIZE) {
            throw new WrongNameException();
        }
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) throws WrongAgeException {
        if(age < MIN_AGE || age > MAX_AGE) {
            throw new WrongAgeException();
        }
        this.age = age;
    }


    public void setGrades(List<Integer> grades) throws WrongGradesException {
        this.grades = grades;
    }


    public int getGrade(int index) {
        return this.grades.get(index);
    }

    public int getNoGrades() {
        return this.grades.size();
    }


    public float getGradesAverage() {
        int sum = 0;
        for(int grade : this.grades) {
            sum += grade;
        }
        return sum/this.grades.size();

    }

    public int getMinGrade() {
        int min = 0;
        if(this.grades.size() > 0) {
            min = this.grades.get(0);
            for(int grade : this.grades) {
                if(min > grade) {
                    min = grade;
                }
            }
        }
        return min;
    }
}

