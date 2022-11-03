package day3.kodlamaNLayeredHomeWork.dataAccess;

import day3.kodlamaNLayeredHomeWork.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor Added to database with Hibernate: " + instructor.getfirstName());
        System.out.println();
    }
}
