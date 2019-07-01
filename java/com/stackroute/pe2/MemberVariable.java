package com.stackroute.pe2;

class Member {
    String name;
    int age;
    double salary;

}

public class MemberVariable{
    Member obj=new Member();
    String outp="";
    public String set(String name,int age,double salary)
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