package com.arief.myfaces2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="formMany",eager = true)
//@RequestScoped
public class FormManyCheckBox {

    private String arr [] = {"A","B"};


    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
