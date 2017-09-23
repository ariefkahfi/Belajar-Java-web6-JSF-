package com.arief.myfaceslist;

import com.arief.model.Person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;

@ManagedBean(name="modelList",eager = true)
@RequestScoped
public class TestArrayList {

    public ArrayList<String> arrList(){
        ArrayList<String> data = new ArrayList<String>();

        data.add("a");
        data.add("b");
        data.add("c");

        return data;
    }


    public ArrayList<Person> personList(){
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person(1,"Arief"));
        persons.add(new Person(2,"Putro"));

        return persons;
    }
}
