/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2.lecture;

/**
 *
 * @author User
 */
public class Course {//강좌 객체 강좌 정보를 저장
    private String courseNum;
    private String courseName;
    private String professer;
    private String department;
    private String grade;
    private String course_content;
    private String max;
    private String min;
    private boolean open;

    public Course(String courseNum, String courseName, String professer, String department, String grade, String course_content, String max, String min, boolean open) {
        this.courseNum = courseNum;
        this.courseName = courseName;
        this.professer = professer;
        this.department = department;
        this.grade = grade;
        this.course_content = course_content;
        this.max = max;
        this.min = min;
        this.open = open;
    }
    
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
    
    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfesser() {
        return professer;
    }

    public void setProfesser(String professer) {
        this.professer = professer;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourse_content() {
        return course_content;
    }

    public void setCourse_content(String course_content) {
        this.course_content = course_content;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    
}
