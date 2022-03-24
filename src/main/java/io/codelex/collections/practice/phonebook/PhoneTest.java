package io.codelex.collections.practice.phonebook;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("John", "25645456");
        phoneDirectory.putNumber("Jihn", "284785612");
        phoneDirectory.putNumber("Jehn", "47845653");
        phoneDirectory.putNumber("Jehn", "54154565");
        System.out.println(phoneDirectory.getNumber("Jehn"));
    }
}
