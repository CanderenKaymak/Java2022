package day3.kodlamaNLayeredHomeWork.core.logging;

public interface Logger {
    // Interfaces will provide polymorphism and loose coupling . same with CategoryDao, CoursesDao, InstructorDao
    void log(String data);
}
