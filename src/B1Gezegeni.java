/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public class B1Gezegeni extends Gezegen {

    public B1Gezegeni(String isim, String atmosferDurumu, int yercekimi, int KaynakMiktarı, int x, int y) {
        super(isim, "yoğun", yercekimi, KaynakMiktarı, x, y);
    }

    @Override
    public int inşKalkişMaaliyeti() {
         return getYercekimi()*10;
   
    }
    

    
   
    
}
