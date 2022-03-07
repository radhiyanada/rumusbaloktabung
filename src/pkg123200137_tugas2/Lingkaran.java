/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123200137_tugas2;

/**
 *
 * @author Nada
 */
public class Lingkaran implements MenghitungBidang{
    float jari;
    float Luas_Lingkaran;
    float Keliling_Lingkaran;

    public Lingkaran(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }
    
    @Override
    public float luas() {
        Luas_Lingkaran = (float) (3.14*jari*jari);
//        System.out.println("Luas Lingkaran : " + Luas_Lingkaran);
        return Luas_Lingkaran;
    }

    @Override
    public float keliling() {
        Keliling_Lingkaran = (float) (2*3.14*jari);
//        System.out.println("Keliling Lingkaran : " + Keliling_Lingkaran);
        return Keliling_Lingkaran;
    }
}

