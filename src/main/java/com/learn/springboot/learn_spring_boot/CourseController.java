package com.learn.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1, "Java", "Author 1"),
                new Course(2, "JS", "Author 2"),
                new Course(3, "Python", "Author 3"),
                new Course(4, "Ruby", "Author 4"),
                new Course(5, "LISP", "Author 5")
        );
    }
}
