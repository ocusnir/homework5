package homework5.geekbrainsoop;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {

//    Scanner scanner = new Scanner(System.in);

     String name;
     String lastName;
     String middleName;
     String position;
     String email;
     int mobile;
     int salary;
     int age;


     public Employee() {
         Employee[] employees = new Employee[5];

         // Почему-то всё выводит как null я не понимаю в чем проблема...
                employees[0] = new Employee("Ivan", "Ivanov", "Ivanov", "Engineer", "ivanov@mailbox.ru", 89231212, 37000, 25);
                employees[1] = new Employee("Maria", "Livenko", "Sergeevna", "Designer", "maria@mailbox.ru", 89231212, 27000, 43);
                employees[2] = new Employee("John", "Johnson", "Liverson", "Cleaner", "john@mailbox.ru", 89231212, 13700, 340);
                employees[3] = new Employee("David", "Martin", "Simon", "CEO of LIFE", "david@mailbox.ru", 89231212, 370000, 40);
                employees[4] = new Employee("Ryan", "Liam", "Manson", "Director", "ryan@mailbox.ru", 89231212, 30000, 50);
            }


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


    public void  displayInfo(){
//        System.out.println(Arrays.toString(employees));
                System.out.printf("Name: %s\tLastName: %s\tMiddleName: %s\tPosition: %s\tEmail: %s\tMobile: %d\tSalary: %d\tAge: %d\n",name, lastName, middleName, position, email, mobile, salary, age );

//        for(int i = 0; i < employees.length; i++){
//            if(age > 40){
//                System.out.printf("Name: %s\tLastName: %s\tMiddleName: %s\tPosition: %s\tEmail: %s\tMobile: %d\tSalary: %d\tAge: %d\n",name, lastName, middleName, position, email, mobile, salary, age );
//                break;
//            }
//        }

    }
}
