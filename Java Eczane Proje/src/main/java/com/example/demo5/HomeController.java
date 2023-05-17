package com.example.demo5;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Random;

public class HomeController{
    String[] tumIlaclarIsimleri= new String[]{"Aferin","Aseket","Parol","Zespira","Dolarex","Alvares","Enfexia","Lupatek","Clorethyl","Etotio","Tanflex","İburamin","Ceftiniz","Singulair","Dodex","Asist","Nexium","Turcovac","Feamara","Vaxigrip","Fenodo","Ecopirin","Aspirin","Augmentin"};

    //HASTA İÇİN
    @FXML Label isim;
    @FXML Label soyisim;
    @FXML Label tc;
    public void atama2(){
        isim.setText(Diziler.hastalar.get(0).name);
        soyisim.setText(Diziler.hastalar.get(0).surName);
        tc.setText(String.valueOf(Diziler.hastalar.get(0).TC));
    }
    @FXML
    TextField ilackullantext;
    @FXML
    Label hastageridonus;
    public HomeController(){}
    public void IlacKullan(){
        try{
            boolean b=false;
            for(int h=0;h<Diziler.hastaninkiler.size();h++){
                if(Objects.equals(Diziler.hastaninkiler.get(h).name, ilackullantext.getText())){
                    Diziler.hastaninkiler.get(h).hapSayisi-=2;
                    b=true;
                    hastageridonus.setText("ilaç kullanıldı");
                    if(Diziler.hastaninkiler.get(h).hapSayisi==0){
                        Diziler.hastaninkiler.remove(h);
                        hastageridonus.setText("ilacınız bitti");
                    }
                }
            }
            if(b==false){
                hastageridonus.setText("öyle bir ilacınız yok kullanamazsınız");
            }
        }
        catch (Exception e){
            hastageridonus.setText(String.valueOf(e));
        }

    }
    boolean receteYazilabilir=true;
    public void GunGecir(){
        for(int h=0;h<Diziler.hastaninkiler.size();h++){
            if(Diziler.hastaninkiler.get(h).gunSuresi==0){
                break;
            }
            Diziler.hastaninkiler.get(h).gunSuresi-=1;
        }
        for(Ilac i: Diziler.hastaninkiler){
            i.gunSuresi-=1;
            if(i.gunSuresi==0){
                hastageridonus.setText("ilacınızın günü bitti tekrar alabilirsiniz");
            }
        }
        hastageridonus.setText("gün geçirildi");
        receteYazilabilir= true;

    }
    @FXML Label ilacismi1;@FXML Label ilacismi2;@FXML Label ilacismi3;@FXML Label ilacismi4;@FXML Label ilacismi5;@FXML Label ilacismi6;
    @FXML Label ilachapsayisi1;@FXML Label ilachapsayisi2;@FXML Label ilachapsayisi3;@FXML Label ilachapsayisi4;@FXML Label ilachapsayisi5;@FXML Label ilachapsayisi6;
    @FXML Label ilacgunsayisi1;@FXML Label ilacgunsayisi2;@FXML Label ilacgunsayisi3;@FXML Label ilacgunsayisi4;@FXML Label ilacgunsayisi5;@FXML Label ilacgunsayisi6;
    public void atama3(){
        for(int i=0;i<Diziler.hastaninkiler.size();i++){
            ilacismi1.setText("");
            ilachapsayisi1.setText("");
            ilacgunsayisi1.setText("");
            ilacismi2.setText("");
            ilachapsayisi2.setText("");
            ilacgunsayisi2.setText("");
            ilacismi3.setText("");
            ilachapsayisi3.setText("");
            ilacgunsayisi3.setText("");
            ilacismi4.setText("");
            ilachapsayisi4.setText("");
            ilacgunsayisi4.setText("");
            ilacismi5.setText("");
            ilachapsayisi5.setText("");
            ilacgunsayisi5.setText("");
            ilacismi6.setText("");
            ilachapsayisi6.setText("");
            ilacgunsayisi6.setText("");
            if(i==0){
                ilacismi1.setText(Diziler.hastaninkiler.get(0).name);
                ilachapsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).hapSayisi));
                ilacgunsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).gunSuresi));
            }
            if(i==1){
                ilacismi1.setText(Diziler.hastaninkiler.get(0).name);
                ilachapsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).hapSayisi));
                ilacgunsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).gunSuresi));
                ilacismi2.setText(Diziler.hastaninkiler.get(1).name);
                ilachapsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).hapSayisi));
                ilacgunsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).gunSuresi));
            }
            if(i==2){
                ilacismi1.setText(Diziler.hastaninkiler.get(0).name);
                ilachapsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).hapSayisi));
                ilacgunsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).gunSuresi));
                ilacismi2.setText(Diziler.hastaninkiler.get(1).name);
                ilachapsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).hapSayisi));
                ilacgunsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).gunSuresi));
                ilacismi3.setText(Diziler.hastaninkiler.get(2).name);
                ilachapsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).hapSayisi));
                ilacgunsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).gunSuresi));
            }
            if(i==3){
                ilacismi1.setText(Diziler.hastaninkiler.get(0).name);
                ilachapsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).hapSayisi));
                ilacgunsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).gunSuresi));
                ilacismi2.setText(Diziler.hastaninkiler.get(1).name);
                ilachapsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).hapSayisi));
                ilacgunsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).gunSuresi));
                ilacismi3.setText(Diziler.hastaninkiler.get(2).name);
                ilachapsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).hapSayisi));
                ilacgunsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).gunSuresi));
                ilacismi4.setText(Diziler.hastaninkiler.get(3).name);
                ilachapsayisi4.setText(String.valueOf(Diziler.hastaninkiler.get(3).hapSayisi));
                ilacgunsayisi4.setText(String.valueOf(Diziler.hastaninkiler.get(3).gunSuresi));
            }
            if(i==4){
                ilacismi1.setText(Diziler.hastaninkiler.get(0).name);
                ilachapsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).hapSayisi));
                ilacgunsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).gunSuresi));
                ilacismi2.setText(Diziler.hastaninkiler.get(1).name);
                ilachapsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).hapSayisi));
                ilacgunsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).gunSuresi));
                ilacismi3.setText(Diziler.hastaninkiler.get(2).name);
                ilachapsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).hapSayisi));
                ilacgunsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).gunSuresi));
                ilacismi4.setText(Diziler.hastaninkiler.get(3).name);
                ilachapsayisi4.setText(String.valueOf(Diziler.hastaninkiler.get(3).hapSayisi));
                ilacgunsayisi4.setText(String.valueOf(Diziler.hastaninkiler.get(3).gunSuresi));
                ilacismi5.setText(Diziler.hastaninkiler.get(4).name);
                ilachapsayisi5.setText(String.valueOf(Diziler.hastaninkiler.get(4).hapSayisi));
                ilacgunsayisi5.setText(String.valueOf(Diziler.hastaninkiler.get(4).gunSuresi));
            }
            if(i==5){
                ilacismi1.setText(Diziler.hastaninkiler.get(0).name);
                ilachapsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).hapSayisi));
                ilacgunsayisi1.setText(String.valueOf(Diziler.hastaninkiler.get(0).gunSuresi));
                ilacismi2.setText(Diziler.hastaninkiler.get(1).name);
                ilachapsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).hapSayisi));
                ilacgunsayisi2.setText(String.valueOf(Diziler.hastaninkiler.get(1).gunSuresi));
                ilacismi3.setText(Diziler.hastaninkiler.get(2).name);
                ilachapsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).hapSayisi));
                ilacgunsayisi3.setText(String.valueOf(Diziler.hastaninkiler.get(2).gunSuresi));
                ilacismi4.setText(Diziler.hastaninkiler.get(3).name);
                ilachapsayisi4.setText(String.valueOf(Diziler.hastaninkiler.get(3).hapSayisi));
                ilacgunsayisi4.setText(String.valueOf(Diziler.hastaninkiler.get(3).gunSuresi));
                ilacismi5.setText(Diziler.hastaninkiler.get(4).name);
                ilachapsayisi5.setText(String.valueOf(Diziler.hastaninkiler.get(4).hapSayisi));
                ilacgunsayisi5.setText(String.valueOf(Diziler.hastaninkiler.get(4).gunSuresi));
                ilacismi6.setText(Diziler.hastaninkiler.get(5).name);
                ilacgunsayisi6.setText(String.valueOf(Diziler.hastaninkiler.get(5).hapSayisi));
                ilacgunsayisi6.setText(String.valueOf(Diziler.hastaninkiler.get(5).gunSuresi));
            }
        }
    }

    //ECZANE İÇİN
    public void atama(){
        for(String s:tumIlaclarIsimleri){
            Ilac d=new Ilac();
            d.name=s;
            Diziler.eczanedekiler.add(d);
        }
    }
    @FXML
    TextField ilacaltext;
    @FXML
    Label ilacalgeridonus;
    public void IlacAl(){
        try{
            String text2=ilacaltext.getText();
            boolean ilacalabilir=true;
            boolean ilacalabilir2=true;
            boolean yanlisisim=false;
            for(Ilac i:Diziler.hastaninkiler){
                if(i.gunSuresi>0){
                    ilacalabilir=false;
                    ilacalabilir2=false;
                }
            }
            for(int f=0;f<text2.length();f++){
                if (Character.isLetter(text2.charAt(f))){
                }
                else{
                    ilacalabilir=false;
                }
            }
            if(ilacalabilir==true){
                for(Ilac i: Diziler.eczanedekiler){
                    if(Objects.equals(i.name, ilacaltext.getText())){
                        if(i.kutuSayisi>0){
                            Diziler.hastaninkiler.add(i);
                            i.kutuSayisi-=2;
                            ilacalgeridonus.setText("ilacınız teslim edildi");
                        }
                        if(i.kutuSayisi==0){
                            ilacalgeridonus.setText("eczanemizde bu ilaçtan kalmadı");
                        }
                        yanlisisim=true;
                    }
                    if(yanlisisim==false){
                        ilacalgeridonus.setText("öyle bir ilacımız bulunmamakta, ilaç alamazsınız");
                        yanlisisim=false;
                    }
                }
            }
            else{
                ilacalgeridonus.setText("ilaç ismi harflerden oluşmalıdır, ilaç alamazsınız");
            }
            if(ilacalabilir2==false){
                ilacalgeridonus.setText("ilacınız var ve günü dolmamış, ilaç alamazsınız");
            }
        }
        catch (Exception e){
            ilacalgeridonus.setText(String.valueOf(e));
        }

    }
    @FXML
    TextField ilacgetirttext;
    public void IlacGetirt(){
        try{
            boolean yanlisisim2=false;
            String text1=ilacgetirttext.getText();
            boolean ilacgetirtilebilir=true;
            for(int f=0;f<text1.length();f++){
                if (Character.isLetter(text1.charAt(f))){
                }
                else{
                    ilacgetirtilebilir=false;
                }
            }
            if(ilacgetirtilebilir==true){
                for(Ilac a:Diziler.eczanedekiler){
                    if(Objects.equals(a.name, ilacgetirttext.getText())){
                        a.kutuSayisi+=4;
                        ilacalgeridonus.setText("eczanemize ilaç getirildi");
                        yanlisisim2=true;
                    }
                    if(yanlisisim2==false){
                        ilacalgeridonus.setText("öyle bir ilacımız bulunmamakta , ilaç getirtemezsiniz");
                        yanlisisim2=true;
                    }
                }
            }
            else{
                ilacalgeridonus.setText("ilaç ismi harflerden oluşmalıdır, ilaç getirtemezsiniz");
            }
        }
        catch (Exception e){
            ilacalgeridonus.setText(String.valueOf(e));
        }
    }
    public void DoktorunYazdigiIlaclariVer(){
        try {
            if (Diziler.recetedekiler.size() == 0) {
                ilacalgeridonus.setText("receteniz yok lütfen doktorunuza başvurun");
            } else if (Diziler.recetedekiler.size() > 0) {
                for (Ilac e : Diziler.recetedekiler) {
                    Diziler.hastaninkiler.add(e);
                    ilacalgeridonus.setText("ilaçlarınız verildi");
                }
                for (int i = 0; i < 3; i++) {
                    Diziler.recetedekiler.remove(0);
                }
            }
        }
        catch (Exception e){
            ilacalgeridonus.setText(String.valueOf(e));
        }
    }

    //DOKTOR İÇİN
    @FXML
    Label ilac1isim;
    @FXML
    Label ilac2isim;
    @FXML
    Label ilac3isim;
    @FXML
    Label ilac1kutusayisi;
    @FXML
    Label ilac2kutusayisi;
    @FXML
    Label ilac3kutusayisi;
    @FXML
    Label recetegeridonus;
    public void ReceteYaz() {
        for(int j=0;j<3;j++) {
            Random rand = new Random();
            int n = rand.nextInt(24);
            Ilac i = new Ilac();
            i.name=tumIlaclarIsimleri[n];
            if(receteYazilabilir==true) {
                Diziler.recetedekiler.add(i);
                recetegeridonus.setText("reçete yazıldı");
            }
            else{
                recetegeridonus.setText("günlük reçete hakkınızı kullandınız");
                //recetegeridonus.setText(Diziler.recetedekiler.get(0).name);
            }
        }
        receteYazilabilir = false;
        for(Ilac i:Diziler.recetedekiler){
            System.out.println(i.name);
        }
        if(Diziler.recetedekiler.size()>0){
            ilac1isim.setText(Diziler.recetedekiler.get(0).name);
            ilac2isim.setText(Diziler.recetedekiler.get(1).name);
            ilac3isim.setText(Diziler.recetedekiler.get(2).name);
            ilac1kutusayisi.setText(String.valueOf(Diziler.recetedekiler.get(0).kutuSayisi));
            ilac2kutusayisi.setText(String.valueOf(Diziler.recetedekiler.get(1).kutuSayisi));
            ilac3kutusayisi.setText(String.valueOf(Diziler.recetedekiler.get(2).kutuSayisi));
        }
    }
}