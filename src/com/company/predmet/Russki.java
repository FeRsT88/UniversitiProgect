package com.company.predmet;

import com.company.Student;

import java.util.List;
import java.util.Random;

public class Russki implements Predmet {
    @Override
    public void poluchenieOcenki(Student student) {
        Random run = new Random();
        Boolean otvet = run.nextBoolean();
        if(otvet){
         int i = run.nextInt(5);
            List<Integer> russki = student.getZachetka().getRusski();
            russki.add(i);
        }
    }
}
