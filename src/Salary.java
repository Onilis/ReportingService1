public class Salary {
    private EmployBook employBook;

    public Salary(EmployBook employBook) {
        this.employBook = employBook;
    }

    private double calculateTotalSalary() {
        double total = 0;
        for (int i = 0; i < employBook.count; i++) {
            total += employBook.employees[i].getSalary();
        }
        return total;
    }

    private Employee findEmployeeWithMinSalary() {
        if (employBook.count == 0) return null;
        Employee minSalaryEmployee = employBook.employees[0];
        for (int i = 1; i < employBook.count; i++) {
            if (employBook.employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employBook.employees[i];
            }
        }
        return minSalaryEmployee;
    }

    private Employee findEmployeeWithMaxSalary() {
        if (employBook.count == 0) return null;
        Employee maxSalaryEmployee = employBook.employees[0];
        for (int i = 1; i < employBook.count; i++) {
            if (employBook.employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employBook.employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    private double calculateAverageSalary() {
        if (employBook.count == 0) return 0;
        double total = calculateTotalSalary();
        return total / employBook.count;
    }

    public void printSalaryStatistics() {
        System.out.println("Общая зарплата: " + calculateTotalSalary());
        Employee minSalaryEmployee = findEmployeeWithMinSalary();
        if (minSalaryEmployee != null) {
            System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
        }
        Employee maxSalaryEmployee = findEmployeeWithMaxSalary();
        if (maxSalaryEmployee != null) {
            System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
        }
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
    }
}