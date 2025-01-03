package OOPS;

import java.util.Arrays;

public class ComparableInterface {

    public static class Student implements Comparable<Student>{
        int rollno;
        float marks;

        public Student(int rollno, float marks){
            this.rollno=rollno;
            this.marks=marks;
        }

        @Override
        public int compareTo(Student o) {
            int diff = (int)(this.marks-o.marks);
            return diff;
        }

        @Override
        public String toString() {
//            return "Student{" +
//                    "rollno=" + rollno +
//                    ", marks=" + marks +
//                    '}';
            return marks + " ";
        }
    }

    public static void main(String[] args) {
        Student A = new Student(7,96.5f);
        Student B = new Student(11,98.5f);
        Student C = new Student(15,77.5f);
        Student D = new Student(20,55.8f);

        Student[] s = {A,B,C,D};
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        if(A.compareTo(B)==0){
            System.out.println("A has the same marks as B");
        }
        else if (A.compareTo(B)>0) {
            System.out.println("A has more marks than B");
        }
        else{
            System.out.println("B has more marks than A");
        }
    }
}
