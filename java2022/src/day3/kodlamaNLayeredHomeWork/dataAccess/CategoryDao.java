package day3.kodlamaNLayeredHomeWork.dataAccess;


import day3.kodlamaNLayeredHomeWork.entities.Category;

public interface CategoryDao {
    // Interfaces will provide polymorphism and loose coupling.
    void add(Category category);
}
