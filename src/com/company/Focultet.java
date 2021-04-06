package com.company;

import java.util.Arrays;
import java.util.List;

public class Focultet {
    private List<Grup> grup;
    private Universiti uniwers;
    private String name;

    private Integer minQc;
    private Integer maxQc;

    public void setUniwers(Universiti uniwers) {
        this.uniwers = uniwers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinQc() {
        return minQc;
    }

    public void setMinQc(Integer minQc) {
        this.minQc = minQc;
    }

    public Integer getMaxQc() {
        return maxQc;
    }

    public void setMaxQc(Integer maxQc) {
        this.maxQc = maxQc;
    }

    @Override
    public String toString() {
        String resault = "Фокультет : " + name+ " допускаются студенты от - ("+minQc+") до - ("+maxQc+")" +"\n";
        for(Grup gr:grup) {
            resault +=gr.toString();
        }

        return resault;
    }

    public Focultet (List<Grup> mas, String name,Integer minQc,Integer maxQc) {
        this.name = name;
        this.grup = mas;
        this.maxQc = maxQc;
        this.minQc = minQc;
    }

    public List<Grup> getGrup() {
        return grup;
    }

    public void setGrup(List<Grup> grup) {
        this.grup = grup;
    }

    public Universiti getUniwers() {
         return uniwers;
    }
}
