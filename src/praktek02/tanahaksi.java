/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author BESTI
 */
public class tanahaksi {
    public static void main(String[] args) {
        
        tanah A1 = new tanah();
        A1.lebar = 90;
        A1.panjang = 80;
        
        A1.cetakInfo();
        System.out.println("luas nya adalah : "+A1.hitungLuas());
        A1.cetakLuasTanah();
        
        tanah A2 = new tanah();
        A2.cetakInfo();
        
        tanah A3 = new tanah(50,90);
        A.cetakInfo();
    }
}
