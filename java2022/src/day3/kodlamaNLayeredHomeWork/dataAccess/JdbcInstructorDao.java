package day3.kodlamaNLayeredHomeWork.dataAccess;

import day3.kodlamaNLayeredHomeWork.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor Added to database with JDBC: " + instructor.getfirstName());
        System.out.println();
    }
}
