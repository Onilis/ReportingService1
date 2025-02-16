public class EmployBook {
    Employee[] employees;
    int count;

    public EmployBook() {
        this.employees = new Employee[150];
        this.count = 0;
    }

    private void addEmployee(Employee employee) {
        if (count < 150) {
            employees[count] = employee;
            count++;
            System.out.println("Сотрудник " + employee.getName() + " добавлен.");
        } else {
            System.out.println("Достигнут лимит в 150 сотрудников.");
        }
    }

    public void addNewEmployee(String name, int id, double salary) {
        Employee employee = new Employee(name, id, salary);
        addEmployee(employee);
    }

    public void listEmployees() {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Сотрудник с ID " + id + " удален.");
                return;
            }
        }
        System.out.println("Сотрудник с ID " + id + " не найден.");
    }

    public Employee searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }
}