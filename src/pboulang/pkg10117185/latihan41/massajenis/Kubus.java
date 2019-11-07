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
public class Kubus {
  //Atribute
  int sisi;
  int massa;
  
 
  //Function
  int getSisi (){ 
     return sisi;
  }
  void setSisi (int parSisi){
     sisi = parSisi;
  }
  int getMassa (){
      
     return massa;
  }
  void setMassa (int parMassa){
     massa = parMassa;
  }
  int hitungVolume (int parSisi){
     return sisi*sisi*sisi;
  }
  int hitungMassaJenis (int parMassa, int volume){
     return massa/volume ;
  }
 
 }