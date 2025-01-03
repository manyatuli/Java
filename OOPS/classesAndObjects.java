package OOPS;

import java.util.Arrays;

class Student{

//    Student(){
//        this.rollno=rollno;
//        this.name=name;
//        this.marks=marks;
//    }

    Student(int rno, String n,float m){
        this.rollno=rno;
        this.name=n;
        this.marks=m;
    }

    // constructor initializing values from another object

    Student(Student st){
        this.rollno=st.rollno;
        this.name=st.name;
        this.marks=st.marks;
    }

    // calling a constructor inside another constructor

    Student(){
        this(10,"Keira",101);
    }

    int rollno;
    String name;
    float marks;
}

public class classesAndObjects {
    public static void main(String[] args){
        Student[] s = new Student[3];
        System.out.println(Arrays.toString(s));

        // constructor overloading
        Student st1 = new Student();
        st1.rollno= 7;
        st1.name = "Manya";
        st1.marks = 99;
        System.out.println(st1.rollno+" "+st1.name+" "+st1.marks);

        Student st2=new Student(11,"Shaurya",100);
        System.out.println(st2.rollno+" "+st2.name+" "+st2.marks);

        // create an object and pass values of another obj -- creating an obj replicas
        Student st3=new Student(st2);
        System.out.println(st3.rollno+" "+st3.name+" "+st3.marks);

        // constructor inside another cons
        Student st4=new Student();
        System.out.println(st4.rollno+" "+st4.name+" "+st4.marks);

        // Two ref var pointing to the same obj
        Student st5=new Student();
        Student st6=st5;
        st5.name="Aarav";
        System.out.println(st6.name);

    }
}
