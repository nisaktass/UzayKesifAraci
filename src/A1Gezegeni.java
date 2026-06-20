/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public class A1Gezegeni extends Gezegen{

    public A1Gezegeni(String isim, String atmosferDurumu, int yercekimi, int KaynakMiktarı, int x, int y) {
        super(isim, "yasanabılır", yercekimi, 0, x, y);
    }

    int toplamKaynak=100;
    
    @Override
    public int inşKalkişMaaliyeti() {
        return getYercekimi()*5;

    
   

    } 
    

    

   
}
