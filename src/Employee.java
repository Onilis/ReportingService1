class Employee {
    private String name;
    private int id;
    private double salary; // Поле для хранения зарплаты

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary; // Метод для получения зарплаты
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Зарплата: " + salary;
    }
}