package com.tangwhdev.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Student {

    @PrimaryKey(autoGenerate = true)
    public int id;


    public String name;

    @ColumnInfo(name = "the_age")
    public int age;

    @ColumnInfo(name = "sex",typeAffinity = ColumnInfo.TEXT )
    public String sex;

    @Ignore
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Ignore
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Ignore
//    public Student(int id, String name, int age, int sex) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
