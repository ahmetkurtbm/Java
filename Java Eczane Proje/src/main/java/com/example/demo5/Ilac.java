package com.example.demo5;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ilac {
    String name;
    int kutuSayisi=4;
    int hapSayisi=kutuSayisi*10;
    int gunSuresi=hapSayisi/2;
    Ilac(){}
    Ilac(String name){
        this.name=name;
    }
}
