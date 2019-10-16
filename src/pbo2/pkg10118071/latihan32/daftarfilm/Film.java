/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan32.daftarfilm;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program untuk menampilkan
*                     daftar film dengan konsep pendekatan objek
* 
*/
public class Film {
    //syarat class = nama class, attribut dan method
    
    //attribut
    public String filmName;
     public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    //method
    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration){
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
    }
    
}
