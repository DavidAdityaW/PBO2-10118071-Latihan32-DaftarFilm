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
public class PBO210118071Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instansiasi objek
        Film objFilm = new Film();
        System.out.println("=====Daftar Film Sedang Tanyang=====");
        objFilm.filmName = "Venom";
        objFilm.filmGenre = "Action, Horror, Scifi";
        objFilm.filmRating = 8.5;
        objFilm.filmDuration = 120;
        
        objFilm.nowPlaying(objFilm.filmName,objFilm.filmGenre,objFilm.filmRating,objFilm.filmDuration);
        
        System.out.println();
        objFilm.filmName = "Small Foot";
        objFilm.filmGenre = "Animation";
        objFilm.filmRating = 9.0;
        objFilm.filmDuration = 96;
        
        objFilm.nowPlaying(objFilm.filmName,objFilm.filmGenre,objFilm.filmRating,objFilm.filmDuration);
        
        System.out.println();
        objFilm.filmName = "Crazy Rich Asian";
        objFilm.filmGenre = "Comedy";
        objFilm.filmRating = 7.8;
        objFilm.filmDuration = 119;
        
        objFilm.nowPlaying(objFilm.filmName,objFilm.filmGenre,objFilm.filmRating,objFilm.filmDuration);
        
        System.out.println();
        objFilm.filmName = "Asih";
        objFilm.filmGenre = "Horror";
        objFilm.filmRating = 6.0;
        objFilm.filmDuration = 100;
        
        objFilm.nowPlaying(objFilm.filmName,objFilm.filmGenre,objFilm.filmRating,objFilm.filmDuration);
        
    }
    
}
