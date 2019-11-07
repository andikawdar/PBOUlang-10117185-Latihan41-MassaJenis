/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan41.massajenis;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Menghitung Massa Jenis
 */
public class PBOUlang10117185Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sisi = 5;
        int massa = 250;
    
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        int a = kubus.getMassa();
        
        System.out.println(a);
        
        
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : "+ sisi);
        System.out.println("Massa : "+ massa);
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kubus.hitungVolume(0));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(0)));

    }
    
}
