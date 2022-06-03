package homework5.geekbrainsoop;

public class MainActivity {
    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivan", "Ivanov", "Ivanov", "Engineer", "ivanov@mailbox.ru", 89231212, 37000, 25);
        employee[1] = new Employee("Maria", "Livenko", "Sergeevna", "Designer", "maria@mailbox.ru", 89231212, 27000, 43);
        employee[2] = new Employee("John", "Johnson", "Liverson", "Cleaner", "john@mailbox.ru", 89231212, 13700, 45);
        employee[3] = new Employee("David", "Martin", "Simon", "CEO of LIFE", "david@mailbox.ru", 89231212, 370000, 40);
        employee[4] = new Employee("Ryan", "Liam", "Manson", "Director", "ryan@mailbox.ru", 89231212, 30000, 50);

        for (int i=0; i < employee.length; i++) {
            if (employee[i].age > 40) employee[i].displayInfo();
        }
    }
}
