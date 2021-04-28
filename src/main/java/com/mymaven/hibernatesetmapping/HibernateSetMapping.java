package com.mymaven.hibernatesetmapping;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSetMapping {
    public static void main(String [] args){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory s = meta.getSessionFactoryBuilder().build();
        Session session = s.openSession();
        Transaction t = session.beginTransaction();
        
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Inheritance");
        set1.add("Polymorphism");
        
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Programming Language");
        set2.add("OOP based language");
        
        TechnicalQuestions tq1 = new TechnicalQuestions();
        tq1.setQname("OOP features?");
        tq1.setAnswers(set1);
        
        TechnicalQuestions tq2 = new TechnicalQuestions();
        tq2.setQname("What is Java?");
        tq2.setAnswers(set2);
        
        session.persist(tq1);
        session.persist(tq2);
        t.commit();
        System.out.println("Records successfully saved...");
        session.close();
    }
}
