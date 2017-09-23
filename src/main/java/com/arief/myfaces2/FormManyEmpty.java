package com.arief.myfaces2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="formEmpty",eager = true)
@RequestScoped
public class FormManyEmpty {

    private String names [];

    public void setNames(String names[]){
        this.names=names;
    }
    public String[] getNames(){
        return names;
    }

}
