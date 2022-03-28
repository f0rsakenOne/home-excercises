package io.codelex.polymorphism.practice.exercise3;

public class MainTest {
    public static void main(String[] args) {
        Student student = new Student("John", "Arbuckle", "Your mom XD", 333666, 2.6);
        Employee employee = new Employee("Will", "Smith", "Idk Hollywood", 147258, "Actor");
        student.display();
        employee.display();
    }
}
