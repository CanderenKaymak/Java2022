package day3.kodlamaNLayeredHomeWork.businessLogic;

import day3.kodlamaNLayeredHomeWork.core.logging.Logger;
import day3.kodlamaNLayeredHomeWork.dataAccess.InstructorDao;
import day3.kodlamaNLayeredHomeWork.dataAccess.JdbcInstructorDao;
import day3.kodlamaNLayeredHomeWork.entities.Instructor;

import java.util.List;

public class InstructorManager  implements InstructorDao {
    private InstructorDao instructorDao;
    private Logger[] loggers;


    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (Logger logger : loggers){
            logger.log(instructor.getfirstName() + " " + instructor.getLastName());
        }
    }
}
