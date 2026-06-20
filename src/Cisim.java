/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public  class Cisim {
   protected int x; //gezegen ve karadelığın ortak özelliği x,y konumu 
   protected int y; //bu sebeple bunları ozellik olarak yazdırdık.
                       //alt sınıflardan erişilebilsin diye protected tanımladık.
   

        public Cisim(int x, int y) {
            this.x = x;
            this.y = y;
            
        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
        
   
   @Override     //adresi değil nesnenin anlamlı halini versın dıye override ettik
   public String toString(){
   return "konum:("+x+","+y+")";
   }
  
   
   
}
