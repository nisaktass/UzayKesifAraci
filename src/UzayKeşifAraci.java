
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public class UzayKeşifAraci {
  private int yakıtSeviyesi;
  private int depolamaKapasitesi;
  private String durum;
  private List<Kaynak> kaynaklar;

    public UzayKeşifAraci(int yakıtSeviyesi, int depolamaKapasitesi, String durum, List<Kaynak> kaynaklar) {
        this.yakıtSeviyesi = yakıtSeviyesi;
        this.depolamaKapasitesi = depolamaKapasitesi;
        this.durum = "Seyehat";
        this.kaynaklar = kaynaklar;
    }

    public void setYakıtSeviyesi(int yakıtSeviyesi) {
        this.yakıtSeviyesi = yakıtSeviyesi;
    }

   

    public int getYakıtSeviyesi() {
        return yakıtSeviyesi;
    }

    public int getDepolamaKapasitesi() {
        return depolamaKapasitesi;
    }

    public String getDurum() {
        return durum;
    }

   
    public void gezegeneGit(Gezegen gezegen){
        int yakitTuketimi=gezegen.inşKalkişMaaliyeti();
        if(yakıtSeviyesi>=yakitTuketimi){
            yakıtSeviyesi-=yakitTuketimi;
            System.out.println();
            System.out.println("Yakıt tuketımı:"+yakitTuketimi+"birim.");
            System.out.println("Yeni yakıt sevıyesı"+yakıtSeviyesi + "birim");
            
        }else{
            System.out.println("Yeterli yakıt yok.");
        }
    }
public void kaynakTopla(Gezegen gezegen){
    if(depolamaKapasitesi>=gezegen.getKaynakMiktarı()){
        Kaynak kaynak=new Kaynak(gezegen.getIsim(),gezegen.getKaynakMiktarı());
        kaynaklar.add(kaynak);
        System.out.println("toplanan kaynak:"+kaynak.getIsim()+"-Miktar:"+kaynak.getMiktar());
    }else{
        System.out.print("Kapasite yetersiz, kaynak toplanamadı.");
    }
        


    
}   
}