package ro.ase.csie.cts.course3.entities;

public class Student {

    //boolean noScholarship
    boolean hasScholarship;
    boolean isEnrolled;
    int age;
    int enrollmentYear;

    void payTuition() {}  // depends on Accounting Department
    void takeOOPExam() {} // depends on the professor
    void saveToDB() {}    // depends on the DB Admin

    void incrementAge() {
        if(this.age < 20) {
            this.age += 1;
        } else  {
            this.age += 2;
        }

        this.age = (this.age < 20) ? (this.age += 1) : (this.age += 2);
    }

    String getInfo() {

        String message;

        if(this.hasScholarship) {
            return "The student has a scholarship";
        } else {
            return "No scholarship";
        }
    }

}
