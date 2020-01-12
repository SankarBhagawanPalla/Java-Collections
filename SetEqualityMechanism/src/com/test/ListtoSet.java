package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListtoSet {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId("1");
        s1.setName("Shankar");
        Student s2 = new Student();
        s2.setId("2");
        s2.setName("Raghu");
        Student s3 = new Student();
        s3.setId("3");
        s3.setName("Vamsi");
        Student s4 = new Student();
        s4.setId("3");
        s4.setName("Vamsi");

        List<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i).getId() + li.get(i).getName());

        }
        System.out.println("Hashcodes of list elements");
        for (Student s : li) {
            System.out.println(s.hashCode());
        }

        Set<Student> se = new HashSet<Student>(li);

        System.out.println("Set values are:");
        for (Student tem : se) {
            System.out.println(tem.getId() + tem.getName());
        }
        System.out.println("Hashcodes of set elements");
        for (Student s : se) {
            System.out.println(s.hashCode());
        }

        String a1 = "shankar";
        String a2 = "shankar";
        System.out.println(a1.hashCode() + " " + a2.hashCode());


    }

}
