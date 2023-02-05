package class19.HW;

public class Employee {
    //Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!


    String name;
    int experience;
    int point;

    Employee(String name, int experience, int point){
        this.name=name;
        this.experience=experience;
        this.point=point;
    }

    void works(){
        System.out.println(name+ " works "+experience+" years here ");
    }
    void earns(){
        System.out.println(name+ " will earn "+point+" points after webinars");
    }
    }

    class FullTime extends Employee{

    String ID;
    int workTime;
    FullTime(String name, int experience, int point, String ID, int workTime) {
        super(name, experience, point);
        this.ID = ID;
        this.workTime = workTime;
    }
        void have(){
            System.out.println(super.name+"'s ID number is "+ID+", and works "+workTime+" hours per day");
        }
        }

        class PartTime extends Employee{
    int workTime;
    PartTime(String name, int experience, int point, int workTime){
        super(name, experience, point);
        this.workTime=workTime;
    }
    void have1(){
        System.out.println(super.name+ " works "+workTime+" hours per day");
    }
        }