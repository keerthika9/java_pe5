package com.stackroute.pe5;

import java.util.*;

public class StudentSorting {
    private int studentId;
    private String studentName;
    private int studentAge;

    public StudentSorting(int studentid, String studentName, int studentAge) {
        this.studentId = studentid;
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public class StudentSorter implements Comparator<StudentSorting> {

        public int compare(StudentSorting student1, StudentSorting student2) {
            if (student1.getStudentAge() == student2.getStudentAge()) {
                if (student1.getStudentName().equals(student2.getStudentName())) {
                    return student2.getStudentId() - student1.getStudentId();
                } else {
                    return student2.getStudentName().compareTo(student1.getStudentName());
                }
            } else {
                return student2.getStudentAge() - student1.getStudentAge();
            }
        }


    }
}
