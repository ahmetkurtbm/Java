package com.example.demo5;
import javafx.fxml.FXML;

import java.util.ArrayList;

public class Hasta extends Insan{
    Float TC;
    Hasta(Float Tc, String isim, String soyisim){
        this.name=isim;
        this.surName=soyisim;
        this.TC=Tc;
    }
    Hasta(){
    }
    //override işlemini yapabilmek için yaptım
    @Override
    public void hastaOlma(){
        String a="Hastasın";
        System.out.println(a);
    };
}
