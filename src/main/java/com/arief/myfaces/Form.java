package com.arief.myfaces;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="form",eager = true)
public class Form {


    private String nama;

    private boolean loginStatus;


    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }

    public void setLoginStatus(boolean loginStatus){this.loginStatus=loginStatus;}
    public boolean isLoginStatus(){return loginStatus;}

    public String cekValidasi(){
        if(isLoginStatus()){
          return "Has Login";
        }else{
          return "Not Login";
        }
    }


    public String goPage1(){
       return "pages/page1";
    }
}
