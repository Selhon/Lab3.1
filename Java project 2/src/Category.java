public enum Category {
    FOOD("food"), PRINT("print"), DRESS("dress"), GENERAL("general");
    private String category;
    Category(){}
    Category(String category)
    {
        this.category=category;
    }
    public String print()
    {
        return category;
    }
}
