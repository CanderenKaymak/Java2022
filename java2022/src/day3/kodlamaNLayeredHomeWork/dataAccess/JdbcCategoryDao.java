package day3.kodlamaNLayeredHomeWork.dataAccess;

import day3.kodlamaNLayeredHomeWork.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Category Added to database with JDBC: " + category.getName());
        System.out.println();
    }
}
