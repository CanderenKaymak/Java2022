package day3.kodlamaNLayeredHomeWork.dataAccess;

import day3.kodlamaNLayeredHomeWork.entities.Instructor;

public interface InstructorDao {
    // Interfaces will provide polymorphism and loose coupling.
    public void add(Instructor instructor);
}
