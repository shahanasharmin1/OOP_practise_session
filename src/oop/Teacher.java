package oop;

public class Teacher {

    String name , gender; // declare
    double age;

    Teacher(){
        System.out.println("This is default");

    }

    Teacher(String n , String g , int a){
        name = n;
        gender = g;
        age = a;

    }

      //default method
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age: "+age);
        System.out.println(" ");

    }

}





