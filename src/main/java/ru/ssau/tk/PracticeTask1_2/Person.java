package ru.ssau.tk.PracticeTask1_2;

import ru.ssau.tk.PracticeTask1_17.*;
public class Person {

    private String firstName;
    private String lastName;
    private int passportId;
    private Gender gender;

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public void setpassportId(int passportId) {
        this.passportId = passportId;
    }
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public int getpassportId() {
        return passportId;
    }

    public Person(){
        firstName = "Ivan";
        lastName = "Pelmenikov";
        passportId = 228;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person(int passportId){
        this.passportId = passportId;
    }
    public Person(String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }
    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }
    public static void main(String[] args){
        Person firstPerson = new Person();
        Person secondPerson = new Person("Svetlana", "Ivanova");
        Person thirdPerson = new Person("Kate", "Petrova", 345673);
        Person fourthPerson = new Person(678544);
        System.out.println(firstPerson.getpassportId());
        System.out.println(secondPerson.getfirstName());
        System.out.println(thirdPerson.getpassportId());
        System.out.println(fourthPerson.getlastName());
    }
    public Person (String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }
}
