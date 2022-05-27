package com.example;

import com.example.classes.Authenticate;
import com.example.classes.Course;
import com.example.classes.CourseUtils;

public class InvokeKotlinFromJava {
    public static void main(String[] args) {
        var course = new Course(
                1,
                "Webflux Course",
                "Hippo"
        );
        System.out.println("course : " + course);

        CourseUtils.print();
        Course.Companion.printInCompanion("test");
        Course.printInCompanion("ha ha ha");

        course.noOfCourses = 99;
        System.out.println("number of courses : " + course.noOfCourses);

        Authenticate.INSTANCE.authenticate("test", "test");
        Authenticate.authenticate("test", "test");
    }
}
