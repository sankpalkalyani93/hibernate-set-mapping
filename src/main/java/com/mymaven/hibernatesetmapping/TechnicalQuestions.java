package com.mymaven.hibernatesetmapping;

import java.util.Set;

public class TechnicalQuestions {
    int id;
    String qname;
    Set<String> answers;
    
    public String getQname() {
        return qname;
    }
    public void setQname(String qname) {
        this.qname = qname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Set<String> getAnswers() {
        return answers;
    }
    public void setAnswers(Set<String> answers) {
        this.answers = answers;
    }    
}
