package day3.kodlamaNLayeredHomeWork.dataAccess;

import day3.kodlamaNLayeredHomeWork.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Course Added to database with Hibernate: " + course.getName());
        System.out.println();
    }
}
