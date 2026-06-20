/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public abstract class Gezegen extends Cisim {
   private String isim;
    private String atmosferDurumu;
    private int yercekimi;
    private int KaynakMiktarı;

        public Gezegen(String isim, String atmosferDurumu, int yerCekimi, int KaynakMiktarı, int x, int y) {
            super(x, y);
            this.isim = isim;
            this.atmosferDurumu = atmosferDurumu;
            this.yercekimi = yerCekimi;
            this.KaynakMiktarı = KaynakMiktarı;
        }

    public String getIsim() {
        return isim;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getKaynakMiktarı() {
        return KaynakMiktarı;
    }
        

   


@Override     
   public String toString(){
       return "Gezegen"+isim+"Konum"+getX()+"Kaynak"+KaynakMiktarı+"Atmosfer"+atmosferDurumu+"Yercekimi"+yercekimi;
}

    public int getYercekimi() {
        return yercekimi;
    }

   public abstract int inşKalkişMaaliyeti();
}  
 
   
    