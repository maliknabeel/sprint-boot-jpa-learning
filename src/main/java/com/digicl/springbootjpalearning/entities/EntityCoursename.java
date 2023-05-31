package com.digicl.springbootjpalearning.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "coursename", schema = "students", catalog = "")
public class EntityCoursename {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "course_id")
    private int courseId;
    @Basic
    @Column(name = "course_name")
    private String courseName;
    @OneToMany(mappedBy = "coursenameByStudentCourseId")
    private Collection<EntityStudentsrecords> studentsrecordsByCourseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityCoursename that = (EntityCoursename) o;
        return courseId == that.courseId && Objects.equals(courseName, that.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName);
    }

    public Collection<EntityStudentsrecords> getStudentsrecordsByCourseId() {
        return studentsrecordsByCourseId;
    }

    public void setStudentsrecordsByCourseId(Collection<EntityStudentsrecords> studentsrecordsByCourseId) {
        this.studentsrecordsByCourseId = studentsrecordsByCourseId;
    }
}
