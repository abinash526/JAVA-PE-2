/*
* Create a class named Member with Name, age, Salary as its variable, write an other
class named Member Variable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.
Output:
Members Name: Harry Potter
Members Age: 30
Members Salary: 2500.3*/
package com.stackroute.pe2;

class Member {
    String name;
    int age;
    double salary;

}

public class MemberVariable{
    Member obj=new Member();
    String outp="";
    public String set(String name,int age,double salary)//Return the assigned member variables
    {
        obj.name=name;
        obj.age=age;
        obj.salary=salary;
        outp=outp+"Members Name: "+obj.name+"\n";
        outp=outp+"Members Age: "+obj.age+"\n";
        outp=outp+"Members Salary: "+obj.salary+"\n";
        System.out.println(outp);
        return outp;
    }

}