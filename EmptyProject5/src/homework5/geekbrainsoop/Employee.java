package homework5.geekbrainsoop;


public class Employee {

    String name;
    String lastName;
    String middleName;
    String position;
    String email;
    int mobile;
    int salary;
    int age;


    public Employee(String name, String lastName, String middleName, String position, String email, int mobile, int salary, int age) {

        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {

            System.out.format("Name: %s\tLastName: %s\tMiddleName: %s\tPosition: %s\tEmail: %s\tMobile: %d\tSalary: %d\tAge: %d\n", name, lastName, middleName, position, email, mobile, salary, age);
    }

}
