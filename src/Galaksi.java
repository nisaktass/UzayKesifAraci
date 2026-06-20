
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public class Galaksi {
   private List<Gezegen> gezegenler;//gezegenlerı tutmak ıcın lıste 
   private List<Karadelik> karadelikler;//karadelıklerı tutmak ıcın lıste 

        public Galaksi() {
            this.gezegenler = new ArrayList<>();
            this.karadelikler = new ArrayList<>();
        }
 public void gezegenleriOlustur(int gezegenSayisi){
     //gezegen konum olusturma 
     int x=0;
     int y=0;
        for (int i = 0; i < gezegenSayisi; i++) {
            //eger konum doluysa atama yapılamasın. 
            do{
             x = (int) (Math.random() * 10);
             y = (int) (Math.random() * 10);
            } while(koordinatDolu(x,y));
            
            String isim = "G" + (i + 1);
            int gezegenTur = (int) (Math.random() * 3);
            int yercekimi = (int) (Math.random() * 20);
            //olusturulan gezegenlerı rastegele gezegen turlerıne atama
            switch (gezegenTur) {
                case 0:
                    gezegenler.add(new A1Gezegeni(isim, "Yasanabılır", yercekimi, 0, x, y));
                    break;
                case 1:
                    gezegenler.add(new B1Gezegeni(isim, "Yoğun", yercekimi, 0, x, y));
                    break;
                case 2:
                    gezegenler.add(new C1Gezegeni(isim, "Zehirli", yercekimi, 0, x, y));

            }
        }

    }
 public void karadelikleriOlustur(int karadelikSayisi){
     //karadelık konum olusturma 
        int x=0;
        int y=0;
        for(int i=0;i<karadelikSayisi;i++){
            //konum doluysa atama yapma 
            do{
                x=(int)(Math.random()*10);
                y=(int)(Math.random()*10);
            }while(koordinatDolu(x,y));
       
        karadelikler.add(new Karadelik("K",x,y));
        //karadelıkler lsıtesıne "K" ısımlı x ve y koordınatlı yenı olusturulan kartadelık nesnesını ekler (karadelık.add)
        //new karadelık(..,..,..) karadelık sınıfında yenı nesne olusturma.
    }
   

 }
 
private boolean koordinatDolu(int x,int y){
    //gezegenlerın ıcını dön konum dolulugu kontrol 
    for(Gezegen gezegen:gezegenler){
    if(gezegen.x==x && gezegen.y==y){
        return true;
    }
    }
    //karadelıklerın ıcını dön konum dolu mu kontrol 
    for(Karadelik karadelik:karadelikler){
        if(karadelik.x==x&&karadelik.y==y){
            return true;
        }
            
    }
    return false;
}
    public void haritayıYazdır() {
        //galaksı harıtasında oncelıkle butun konumları "." yazdırdık
        System.out.println("Galaksı harıtası");
        String[][] harita = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                harita[i][j] = ".";
            }
        }
    //rastgele olusturulan konumları ve ısımı ındekse atadık
for(Gezegen gezegen: gezegenler){
   int x=gezegen.x;
   int y=gezegen.y;
  String gezegenIsim=gezegen.getIsim();
  
  harita[x][y]=gezegenIsim;

           
}
//rastegel olusturulan konumları ındekse atadık 
for (Karadelik karadelik:karadelikler){
    int x=karadelik.x;
    int y=karadelik.y;
  
    harita[x][y]="K";
}
//harıtayı yazdırdık
   for(int i=0;i<10; i++){
       for(int j=0;j<10;j++){
           System.out.print(harita[i][j]+" ");
       }
       System.out.println();
       
   } 
}
   
   

}


