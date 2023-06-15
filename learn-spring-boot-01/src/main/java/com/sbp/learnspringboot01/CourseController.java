package com.sbp.learnspringboot01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Sbp"),
                new Course(2, "Learn Spring", "Sbp"),
                new Course(3, "Learn SpringBoot", "Sbp")
        );
    }
}
