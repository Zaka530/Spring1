package uz.kamron.springcource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void domyDestroy(){
        System.out.println("Doing my destroy ");
    }


    @Override
    public String getSong() {
        return "Chief keef";
    }
}
