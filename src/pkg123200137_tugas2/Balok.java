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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    float tinggi;
    float volume_balok;
    float luaspermukaan_balok;

    public Balok(float tinggi, float lebar, float panjang) {
        super(lebar, panjang);
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float volume() {
//        this.panjang = panjang;
//        this.lebar = lebar;
//        this.tinggi = tinggi;
        volume_balok = super.luas()*tinggi;
        return volume_balok;
    }

    @Override
    public float luaspermukaan() {
//        this.panjang = panjang;
//        this.lebar = lebar;
//        this.tinggi = tinggi;
        luaspermukaan_balok = 2*((super.luas()) + (super.getLebar()*tinggi) + (super.getPanjang()*tinggi));
//        System.out.println("Luas Permukaan Balok : " + luaspermukaan_balok);
        return luaspermukaan_balok;
    }
}
