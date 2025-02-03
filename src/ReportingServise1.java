public class ReportingServise1 {
    public static void main(String[] args) {
        EmployBook employBook = new EmployBook();
        employBook.addNewEmployee("Иванов Иван Константинович", 1, 56500);
        employBook.addNewEmployee("Петров Петр Викторович", 2, 63300);
        employBook.addNewEmployee("Солонар Елена Михайловна", 3, 73500);
        employBook.addNewEmployee("Солонар Вячеслав Вячеславович",4, 98400);

        System.out.println("Вывод списка сотрудников.");
        employBook.listEmployees();
        System.out.println();

        System.out.println("Группа для управления зарплатами.");
        Salary salaryManager = new Salary(employBook);
        System.out.println();
        salaryManager.printSalaryStatistics();

        System.out.println("Удаление сотрудника.");
        employBook.removeEmployee(1);
        System.out.println();

        System.out.println("Вывод обновленного списка сотрудников.");
        employBook.listEmployees();
        System.out.println();

        System.out.println("Поиск по ID");
        Employee foundEmployee = employBook.searchById(2);
        if (foundEmployee != null) {
            System.out.println("Найден сотрудник: " + foundEmployee);
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }
}