package src.oops_21st_jan;

import java.util.Comparator;

class Asc implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }

}
class Des implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o2.getAge(),o1.getAge());
    }

}
class sort implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

public class student implements Comparable<student> {
    int age;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(student o) {
        return 0;
    }

//    @Override
//    public int compareTo(student student2) {
//        return Integer.compare(this.age,student2.age);
//    }


//    @Override
//    public int compareTo(student o) {
//        return CharSequence.compare(this.name,o.name);
//    }

}
