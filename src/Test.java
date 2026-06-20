
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisaaktas
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Baslangıc ozellıkleriniz:");
        System.out.println("Yakıt:100 birim");
        System.out.println("Kargo Kapasitesi:50 birim");
        Galaksi galaksi = new Galaksi();
        galaksi.gezegenleriOlustur(5);
        galaksi.karadelikleriOlustur(3);
        galaksi.haritayıYazdır();
 
        
        }
    }
