/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan55;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Android","Android","Grand",3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " +android.getKeyStore()+ "\n");
        
        BlackBerry bb = new BlackBerry("BlackB","RIM","Curve",2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("Pin BB : " +bb.getPinBB()+ "\n");
        
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("WP Key Store : " +wp.getWpKeyStore());
    }
    
}
