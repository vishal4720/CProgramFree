package com.vkdevlops.cprogramfree;

import java.util.List;

public class QuizzesModal {

    private String name,key;
    private List<String> sets;

    public QuizzesModal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getSets() {
        return sets;
    }

    public void setSets(List<String> sets) {
        this.sets = sets;
    }

    public QuizzesModal(String name,List<String> sets, String key) {
        this.name = name;
        this.key = key;
        this.sets = sets;
    }
}
