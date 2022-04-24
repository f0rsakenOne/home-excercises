package io.codelex.oop.persons;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "John",
                "Doe",
                "123",
                20,
                "CEO",
                LocalDate.of(1998, 9, 15));
        System.out.println(employee.getInfo());

        Customer customer = new Customer(
                "Michael",
                "Arbuckle",
                "124",
                98,
                "CID1234",
                11);
        System.out.println(customer.getInfo());
        customer.setPurchaseCount(12);
        System.out.println(customer.getInfo());
    }
}
