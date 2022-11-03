package day3.kodlamaNLayeredHomeWork.entities;

public class Course {
    private int id;
    private String name;
    private double price;
    private Category category;
    private Instructor instructor;

    public Course(){}

    public Course(int id, String name, double price, Category category, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
