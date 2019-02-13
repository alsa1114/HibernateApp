package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int course;
    private String role;

    public Student() {
    }

   @OneToMany
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public Student(int id, String name, String email, int course, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.role = role;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers){
        this.teachers = teachers;
    }


    public void addTeacher(Teacher teacher){
        teacher.setStudent(this);
        teachers.add(teacher);

    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
}
