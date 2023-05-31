package com.digicl.springbootjpalearning.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "studentsrecords", schema = "students", catalog = "")
public class EntityStudentsrecords {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "student_id")
    private int studentId;
    @Basic
    @Column(name = "student_name")
    private String studentName;
    @Basic
    @Column(name = "student_father_name")
    private String studentFatherName;
    @Basic
    @Column(name = "student_cnic_number")
    private String studentCnicNumber;
    @Basic
    @Column(name = "student_course_id")
    private Integer studentCourseId;
    @ManyToOne
    @JoinColumn(name = "student_course_id", referencedColumnName = "course_id", insertable = false, updatable = false)
    private EntityCoursename coursenameByStudentCourseId;

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

    public String getStudentFatherName() {
        return studentFatherName;
    }

    public void setStudentFatherName(String studentFatherName) {
        this.studentFatherName = studentFatherName;
    }

    public String getStudentCnicNumber() {
        return studentCnicNumber;
    }

    public void setStudentCnicNumber(String studentCnicNumber) {
        this.studentCnicNumber = studentCnicNumber;
    }

    public Integer getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(Integer studentCourseId) {
        this.studentCourseId = studentCourseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityStudentsrecords that = (EntityStudentsrecords) o;
        return studentId == that.studentId && Objects.equals(studentName, that.studentName) && Objects.equals(studentFatherName, that.studentFatherName) && Objects.equals(studentCnicNumber, that.studentCnicNumber) && Objects.equals(studentCourseId, that.studentCourseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentFatherName, studentCnicNumber, studentCourseId);
    }

    public EntityCoursename getCoursenameByStudentCourseId() {
        return coursenameByStudentCourseId;
    }

    public void setCoursenameByStudentCourseId(EntityCoursename coursenameByStudentCourseId) {
        this.coursenameByStudentCourseId = coursenameByStudentCourseId;
    }
}
