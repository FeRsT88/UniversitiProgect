package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniwersitiWorker {
    private Universiti un;

    public UniwersitiWorker(Universiti un) {
        this.un = un;
        Scanner sc = new Scanner(System.in);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        List<Focultet> focultets = this.un.getList();
        for (Focultet fo : focultets) {
            List<Grup> grups = fo.getGrup();
            for (Grup gr : grups) {
                List<Student> st = gr.getStident();
                students.addAll(st);
            }
        }
        return students;
    }

    public List<Student> getStudents(String grupName) {
        List<Student> students = new ArrayList<>();
        List<Focultet> focultets = this.un.getList();
        for (Focultet fo : focultets) {
            List<Grup> grups = fo.getGrup();
            for (Grup gr : grups) {
                if (gr.getName().equals(grupName)) {
                    List<Student> st = gr.getStident();
                    students.addAll(st);
                }

            }
        }
        return students;
    }

    public void plusStudents(String st, String gr, int qc) {
        Student stud = new Student(st, qc);
        List<Focultet> focultets = this.un.getList();
        for (Focultet foc : focultets) {
            List<Grup> grup = foc.getGrup();
            for (Grup gru : grup) {

                if (gru.getName().equals(gr)) {
                    zapisStudent(stud, gru);
                }
            }
        }

    }

    public void deletStudents(String st, String gr) {
        List<Focultet> focultets = this.un.getList();
        for (Focultet foc : focultets) {
            List<Grup> grup = foc.getGrup();
            for (Grup gru : grup) {
                if (gru.getName().equals(gr)) {
                    List<Student> sta = gru.getStident();
                    Student stud = null;
                    for (Student ds : sta) {
                        if (st.equals(ds.getName())) {
                            stud = ds;
                        }

                    }
                    if (stud != null) {
                        System.out.println(stud + " отчислен ");
                        sta.remove(stud);
                    }

                }

            }
        }
    }

    public List<Grup> getGrup(String st) {
        List<Grup> retungGrup = new ArrayList<>();
        List<Focultet> focultets = this.un.getList();
        for (Focultet foc : focultets) {
            List<Grup> grup = foc.getGrup();
            for (Grup gr : grup) {
                List<Student> sta = gr.getStident();
                if (sta != null) {
                    for (Student sa : sta) {
                        if (sa.getName().equals(st)) {
                            if (!retungGrup.isEmpty() && retungGrup.contains(gr)) {
                                break;
                            } else {
                                retungGrup.add(gr);
                            }
                        }
                    }
                }
            }
        }
        return retungGrup;
    }

    public void getDelGrup(String gr) {
        List<Focultet> focultets = this.un.getList();
        {
            for (Focultet foc : focultets) {
                List<Grup> grup = foc.getGrup();
                Grup grupDel = null;
                for (Grup gru : grup) {
                    if (gru.getName().equals(gr)) {
                        grupDel = gru;

                    }
                }
                if (grupDel != null) {
                    System.out.println(" Ваша группа удалена !");
                    grup.remove(grupDel);
                }

            }

        }

    }


    public void studentSort(List<Student> studentList) {
        for (Student stud : studentList) {
            List<Focultet> focultets = this.un.getList();
            for (Focultet foc : focultets) {
                if (stud.getQc()>=foc.getMinQc()&& stud.getQc()<=foc.getMaxQc()) {
                    List<Grup> grup = foc.getGrup();
                    for (Grup gru : grup) {
                        if (gru.getHaveMesta()) {
                            zapisStudent(stud, gru);
                        }

                    }
                }else {
                    if(!stud.getInvite()){
                        System.out.println("Не зачислен "+ stud+  " "+ foc.getName());
                    }

                }

            }

        }

    }

    private void zapisStudent(Student student, Grup grup) {
        List<Student> sta = grup.getStident();
        if (!student.getInvite()) {
            if (sta != null) {
                sta.add(student);
            } else {
                sta = new ArrayList<>();
                sta.add(student);
                grup.setStudents(sta);

            }
            boolean ostMesta = grup.getMesto() >= sta.size();
            grup.setHaveMesta(ostMesta);
            student.setInvite(true);
        }
    }
    public void zdachaZacheta (List<Student> studentList){
        List<Student> stud = new ArrayList<>();
        List<Focultet>focultets = this.un.getList();
        for(Focultet foc:focultets){
            List<Grup>grups =foc.getGrup();

        }
    }
}
