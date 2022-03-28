package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String firstName, String lastName, String address, int id, String jobTitle) {
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    void display() {
        System.out.println("Name : " + getFirstName() + "\n" +
                "Last name : " + getLastName() + "\n" +
                "Address : " + getAddress() + "\n" +
                "Id : " + getId() + "\n" +
                "Job Title : " + getJobTitle() + "\n");
    }
}
