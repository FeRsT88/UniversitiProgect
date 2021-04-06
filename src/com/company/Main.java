package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Universiti un = getUniversiti();
        UniwersitiWorker worc = new UniwersitiWorker(un);
        worc.studentSort(StudentGenerator.getList(125));


        /*worc.plusStudents("Петя", "сц-56", 70);
        worc.plusStudents("Гена", "пг-25", 57);
        worc.plusStudents("Коля", "цр-76", 34);
        worc.plusStudents("Гена", "цр-76", 84);*/

        /*worc.getGrup("Гена");*/
//        List<Student> st = worc.getStudents("nb-55");
//        for(Student stu:st){
//            System.out.println(stu);
//        }
        System.out.println(un);


        /*

         */
    }



    public static Universiti getUniversiti() {


        List<Grup> m1 = new ArrayList<>();
        Grup g1 = new Grup(null, "нк-55",19);
        Grup g2 = new Grup(null, "цр-76",19);
        m1.add(g1);
        m1.add(g2);
        List<Focultet> mm1 = new ArrayList<>();
        Focultet fug1 = new Focultet(m1, "Ядерная физика", 30,80);

        List<Grup> m12 = new ArrayList<>();
        Grup g12 = new Grup(null, "пв-34",19);
        Grup g22 = new Grup(null, "цв-35",19);
        m12.add(g12);
        m12.add(g22);
        List<Focultet> mm11 = new ArrayList<>();
        Focultet fug11 = new Focultet(m12, "Биология ", 50,100);


        List<Grup> m11 = new ArrayList<>();
        Grup g11 = new Grup(null, "пг-25",19);
        Grup g32 = new Grup(null, "сц-56",19);
        m11.add(g11);
        m11.add(g32);
        Focultet fug2 = new Focultet(m11, "Ядерная математика", 80,130);
        mm1.add(fug1);
        mm1.add(fug11);
        mm1.add(fug2);


        Universiti un = new Universiti(mm1, "Машиностроительный");
        return un;
    }


}