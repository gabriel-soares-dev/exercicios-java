package jeps;

// class Employee extends Person {}

public class ExemploJEP409 {
    public static void main(String[] args) {
        Person person = new User();
        String result = person.namePerson();
        System.out.println(result);
    }

    sealed static class Person permits User {

        public String namePerson(){
            return "Gabriel Soares";
        };
    }
    
    static class User extends Person {
    }

    static class Employee extends Person {}
}
