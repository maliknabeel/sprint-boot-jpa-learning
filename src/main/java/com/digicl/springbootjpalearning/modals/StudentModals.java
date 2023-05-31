package com.digicl.springbootjpalearning.modals;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class StudentModals {
    private int studentId;
    private String studentName;
    private String studentFatherName;
    private String studentCnicNumber;
    private Integer studentCourseId;
}
