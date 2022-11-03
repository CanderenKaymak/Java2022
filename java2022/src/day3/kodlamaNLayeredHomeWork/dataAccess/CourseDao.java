package day3.kodlamaNLayeredHomeWork.dataAccess;

import day3.kodlamaNLayeredHomeWork.entities.Course;

public interface CourseDao {
    // Interfaces will provide polymorphism and loose coupling.
    public void add(Course course) throws Exception;
}
