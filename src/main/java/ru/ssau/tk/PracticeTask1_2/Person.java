package ru.ssau.tk.PracticeTask1_2;

public class Person {

        private String firstName;
        private String lastName;
        private int passportId;

      public Person(){

      }

    public Person(String firstName){
        this.firstName = firstName;
    }

      public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
      }

      public Person(int passportId){
        this.passportId = passportId;
      }

      public Person(String firstName, String lastName, int passportId){
          this.firstName = firstName;
          this.lastName = lastName;
          this.passportId = passportId;
      }

        public String getfirstName () {
            System.out.println(firstName);
            return firstName;
        }

        public void setfirstName (String firstName){
            this.firstName = firstName;
        }

        public String getlastName () {
            return lastName;
        }

        public void setlastName (String lastName){
            this.lastName = lastName;
        }

        public int getpassportId () {
            return passportId;
        }

        public void setpassportId ( int passportId){
            this.passportId = passportId;
        }

    public static void main(String[] args){
        Person person1 = new Person();
        person1.setfirstName("Ivan");
        person1.setlastName("Pelmenikov");
        person1.setpassportId(228);
        Person person2 = new Person();
        person2.setfirstName("Ivan");
        person2.setlastName("Pelmenikov");
        person2.setpassportId(228);

        Person person3 = new Person("Ivan");
        Person person4 = new Person("Pelmenikov");
        Person person5 = new Person(228);


    }
}
