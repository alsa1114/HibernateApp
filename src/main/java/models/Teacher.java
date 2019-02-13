package models;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int max_kol_students;
    private int hours;
    private String course_of_lections;

    public Teacher() {
    }

    private Student student;
    public Teacher(int id, String name, int max_kol_students, int hours, String course_of_lections) {
        this.id = id;
        this.name = name;
        this.max_kol_students = max_kol_students;
        this.hours = hours;
        this.course_of_lections = course_of_lections;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_kol_students() {
        return max_kol_students;
    }

    public void setMax_kol_students(int max_kol_students) {
        this.max_kol_students = max_kol_students;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getCourse_of_lections() {
        return course_of_lections;
    }

    public void setCourse_of_lections(String course_of_lections) {
        this.course_of_lections = course_of_lections;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}