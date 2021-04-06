package com.company;

import java.util.Arrays;
import java.util.List;

public class Grup {
    private List<Student> students;
    private String name;
    private Boolean haveMesta;
    private Integer mesto;

    public Integer getMesto() {
        return mesto;
    }

    public void setMesto(Integer mesto) {
        this.mesto = mesto;
    }

    public Boolean getHaveMesta() {
        return haveMesta;
    }

    public void setHaveMesta(Boolean haveMesta) {
        this.haveMesta = haveMesta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String resault = "Группа : " +name + "\n";
        if(students!=null) {
            for (Student st : students) {
                resault += st.toString();
            }
        }
        return resault;

    }

    public Grup (List<Student> mas, String name,Integer mesto) {
        this.name = name;
        this.students = mas;
        this.mesto = mesto;
        this.haveMesta = true;

    }
    public List<Student> getStident (){
        return this.students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
