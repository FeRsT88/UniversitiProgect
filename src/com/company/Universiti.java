package com.company;


import java.util.List;

public class Universiti  {
    private List<Focultet> list ;
    private String name;

    public List<Focultet> getList() {
        return list;
    }

    public void setList(List<Focultet> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        String resault = "университет : "+ name + "\n" ;
        for(Focultet fack:list) {
            resault +=fack.toString();
        }
        return resault;
    }

    public Universiti (List <Focultet> mas, String name){
        this.name=name;
        this.list = mas;

    }

}
