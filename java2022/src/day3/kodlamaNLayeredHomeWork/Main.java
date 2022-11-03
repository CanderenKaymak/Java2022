package day3.kodlamaNLayeredHomeWork;

import day3.kodlamaNLayeredHomeWork.businessLogic.CategoryManager;
import day3.kodlamaNLayeredHomeWork.businessLogic.CourseManager;
import day3.kodlamaNLayeredHomeWork.businessLogic.InstructorManager;
import day3.kodlamaNLayeredHomeWork.core.logging.DBLogger;
import day3.kodlamaNLayeredHomeWork.core.logging.FileLogger;
import day3.kodlamaNLayeredHomeWork.core.logging.Logger;
import day3.kodlamaNLayeredHomeWork.core.logging.MailLogger;
import day3.kodlamaNLayeredHomeWork.dataAccess.*;
import day3.kodlamaNLayeredHomeWork.entities.Category;
import day3.kodlamaNLayeredHomeWork.entities.Course;
import day3.kodlamaNLayeredHomeWork.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Category> categories = new ArrayList<>(); // simulate database for Category
        Category category1 = new Category(1,"Programming");
        Category category2 = new Category(2,"Music");

        Instructor instructor = new Instructor(1,"Canderen","Kaymak");

        List<Course> courses = new ArrayList<>(); // simulate database for Course
        Course course = new Course(1,"Java",200,category1,instructor);
        Course course2 = new Course(2,"Guitar",100,category2,instructor);
        Course course3 = new Course(3,"Python",150, category1,instructor);

        Logger[] loggers = {
                new DBLogger(),
                new MailLogger(),
                new FileLogger()
        };

        // our managers will validate and process the given datas if they're acceptible through the system
        //(logic and rules).
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers,courses);

        categoryManager.add(category1);
        categoryManager.add(category2);

        instructorManager.add(instructor);

        courseManager.add(course);
        courseManager.add(course2);
        courseManager.add(course3);

        categoryManager.add(new Category(2,"Jazz")); // program will throw an Exception related to id
    }
}
