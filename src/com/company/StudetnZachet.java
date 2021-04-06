package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudetnZachet {
    private Boolean zacetRus;
    private List<Integer> matematika = new ArrayList<>();
    private List<Integer> russki = new ArrayList<>();
    private List<Integer> fizika = new ArrayList<>();
    private Boolean zacetMatem;
    private Boolean zacetFiz;

    public List<Integer> getMatematika() {
        return matematika;
    }

    public void setMatematika(List<Integer> matematika) {
        this.matematika = matematika;
    }

    public List<Integer> getRusski() {
        return russki;
    }

    public void setRusski(Integer russki) {
        this.russki.add(russki);
    }

    public List<Integer> getFizika() {
        return fizika;
    }

    public void setFizika(Integer fizika) {
        this.fizika;
    }

    public Boolean getZacetRus() {
        int sum = 0;
        for(Integer i:russki){
            sum+=i;
        }
        if(sum!=0){
            sum = sum/russki.size();
            if(sum >2){
                return  true;
            }else {
                return false;
            }
        }else {
            return true;
        }
        
    }

    public Boolean getZacetMatem() {
        return zacetMatem;
    }

    public Boolean getZacetFiz() {
        return zacetFiz;
    }
}
