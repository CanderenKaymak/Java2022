package day3.kodlamaNLayeredHomeWork.businessLogic;

import day3.kodlamaNLayeredHomeWork.core.logging.Logger;
import day3.kodlamaNLayeredHomeWork.dataAccess.CategoryDao;
import day3.kodlamaNLayeredHomeWork.entities.Category;

import java.util.List;

public class CategoryManager {
    //Dependency Injection
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    //business logic, if we want to add a new Category, it can't has same id or name
    public void add(Category category) throws Exception {
        for (Category cat : categories) {
            if (cat.getName().equals(category.getName()) || cat.getId() == category.getId()) {
                throw new Exception("This category already exist. Please choose another name or id for your " +
                        "category!!" + category.getName());
            }
        }

        categoryDao.add(category);
        categories.add(category);

        for(Logger logger:loggers) {
            logger.log(category.getName());
        }
    }
}
