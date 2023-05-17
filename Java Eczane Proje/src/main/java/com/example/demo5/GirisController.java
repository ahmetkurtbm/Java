package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

public class GirisController{
    @FXML
    TextField a;
    @FXML
    TextField b;
    @FXML
    TextField c;
    @FXML
    Label d;
    public void KayitOl(){
        boolean kayitolma=true;
        try {
            for(int f=0;f<a.getText().length();f++){
                if (!Character.isLetter(a.getText().charAt(f))){
                    kayitolma=false;
                }
            }
            for(int f=0;f<b.getText().length();f++){
                if (!Character.isLetter(b.getText().charAt(f))){
                    kayitolma=false;
                }
            }
            for(int f=0;f<c.getText().length();f++){
                if (!Character.isDigit(c.getText().charAt(f))){
                    kayitolma=false;
                }
            }
            for(int f=0;f<a.getText().length();f++){
                if (Character.isLetter(a.getText().charAt(f))){
                }
                else{
                    kayitolma=false;
                }
            }
            for(int i=0;i<11;i++){
                if(c.getText().length()!=11){
                    d.setText("TC numaranızı yanlış girdiniz");
                    kayitolma=false;
                    break;
                }
            }
            if(kayitolma==true){
                Hasta h1= new Hasta();
                h1.name=a.getText();
                h1.surName=b.getText();
                h1.TC= Float.valueOf(c.getText());
                Diziler.hastalar.add(h1);
                d.setText("kayıt olundu");
            }
            else{
                d.setText("geçerli değerler giriniz");
            }
        }
        catch (Exception e ){
            d.setText("giriş bilgileriniz yanlış");
        }
    }
    public void GirisYap() throws IOException {
        boolean buldu=false;
        for(Hasta h:Diziler.hastalar){
            if(Objects.equals(a.getText(), h.name) && Objects.equals(b.getText(), h.surName) && Objects.equals(Float.valueOf(c.getText()), h.TC)){
                Object node = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home.fxml")));
                Main.setCenter((Node) node);
                buldu = true;
            }
        }
        if(buldu==false){
            d.setText("giriş yapılamadı");
        }
    }
}
