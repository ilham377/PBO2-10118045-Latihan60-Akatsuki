/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan60akatsuki;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : Akatsuki
 */
public class PBO10118045Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bertarung akatsuki = new Bertarung();
        akatsuki.tampilProfile();
        int pilihSenjata = akatsuki.tampilSenjata();
        int pilihJurus = akatsuki.tampilJurus();
        akatsuki.keluarakanSenjata(pilihSenjata);
        akatsuki.keluarkanJurus(pilihJurus);
    }
    
}
