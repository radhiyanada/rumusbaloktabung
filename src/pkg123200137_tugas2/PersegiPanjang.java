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
public class PersegiPanjang implements MenghitungBidang{
    private float lebar;
    private float panjang;
    float luas_persegipanjang;
    float keliling_PersegiPanjang;

    public PersegiPanjang(float lebar, float panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    
    @Override
    public float luas() {
        luas_persegipanjang = panjang*lebar;
//        System.out.println("Luas Persegi Panjang : " + luas_persegipanjang);
        return  luas_persegipanjang;
    }

    @Override
    public float keliling() {
        keliling_PersegiPanjang = 2*(panjang + lebar);
//        System.out.println("Keliling Persegi Panjang : " + keliling_PersegiPanjang);
        return keliling_PersegiPanjang;
    }
}

