package day3.kodlamaNLayeredHomeWork.businessLogic;

import day3.kodlamaNLayeredHomeWork.core.logging.Logger;
import day3.kodlamaNLayeredHomeWork.dataAccess.CourseDao;
import day3.kodlamaNLayeredHomeWork.entities.Course;

import java.util.List;

public class CourseManager  implements CourseDao{
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void add(Course course) throws Exception {
        if (course.getPrice() < 0 ){
            throw new Exception("Course price cannot be less than Zero !! Related Course --> " + course.getName());
        }

        for (Course crs : courses){
            if (crs.getName().equals(course.getName()) || crs.getId() == course.getId()){
                throw new Exception("Course is already exist.Please choose another name or id for your course!!");
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers){
            logger.log(course.getName());
        }
    }
}
