/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan60akatsuki;

/**
 *
 * @author Ilham
 */
public class Akatsuki extends Profile{

    @Override
    public int pilihAnggota() {
        return super.pilihAnggota(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void tampilProfile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n=============Profile Karakter============");
        System.out.println("-----------------------------------------");
        System.out.println("Nama \t\t: " + getNamaLengkap());
        System.out.println("Asal \t\t: " + getAsal());
        System.out.println("Cincin \t\t: " + getCincin());
        System.out.println("Posisi Cincin \t: " + getPosisiCincin());
        System.out.println("Partner \t: " + getPartner());
    }
    
}
