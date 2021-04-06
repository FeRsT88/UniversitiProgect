package com.company;

public class Student {
     private  String name ;
     private  Integer qc;
     private Boolean invite;

    public Boolean getInvite() {
        return invite;
    }

    public void setInvite(Boolean invite) {
        this.invite = invite;
    }

    public Integer getQc() {
        return qc;
    }

    public void setQc(Integer qc) {
        this.qc = qc;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public Student (String name,Integer qc){
        this.qc = qc;
        this.name =name;
        this.invite = false;
     }

    @Override
    public String toString() {
        String resault = "Студент " +
                "Имя : " + name + " ("+qc+")" + "\n" ;
        return resault;
    }
}
