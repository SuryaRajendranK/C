package Sorting;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(10, 01));
        list.add(new Student(20, 02));
        list.add(new Student(30, 03));
        Comparator<Student> com = (Student o1, Student o2) -> {
            return o1.age > o2.age ? 1 : -1;
            // if(o1.age < o2.age){
            // return 1;
            // }
            // else{
            // return -1;
            // }

        };
        // using normal sorting
        Collections.sort(list);
        for (Student ss : list) {
            System.out.println(ss);
        }
        // using compaarator sorting
        Collections.sort(list, com);
        System.out.println(list);
    }
}

class Student implements Comparable<Student> {
    int age;
    int r_no;

    @Override
    public String toString() {
        return "Student [age=" + age + ", r_no=" + r_no + "]";
    }

    public Student(int age, int r_no) {
        this.age = age;
        this.r_no = r_no;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
