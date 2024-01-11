package io.learnCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Unit1Java7 {
    public static void main(String[] args){
        List <Person> people = Arrays.asList(
                new Person("Aravind","avatar",25),
                new Person("Manda","badar",26),
                new Person("Pedro","cusu",60),
                new Person("Pavada","diicku",30));


        Collections.sort(people, Comparator.comparing(Person::getLastName));

        printAll(people,p1 -> true,obj -> System.out.println(obj));

        //  lastname which starts with C
        printAll(people, p1 -> {return p1.getLastName().startsWith("a");},obj -> System.out.println(obj.getLastName()));
    }

    // takes people, condition, and behaviour.
    private static void printAll(List<Person> people, Predicate <Person> predicate, Consumer <Person> consumer) {
        for(Person p:people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }


}

