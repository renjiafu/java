package com.rjf.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){
        Student s=new Student("xiaoming",99);
        Map<String,Student> map=new HashMap<>();
        map.put("xiaoming",s);

        System.out.println(map.get("xiaoming"));


        for (String str:map.keySet() ) {
            System.out.println(str);
        }
        for (Student stu:map.values()) {
            System.out.println(stu);
        }
        for (Map.Entry<String, Student> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}

class Student{
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
