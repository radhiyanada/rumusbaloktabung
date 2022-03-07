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
public class Tabung extends Lingkaran implements MenghitungRuang{
    private float tinggi;
    float volume_tabung;
    float luaspermukaan_tabung;

    public Tabung(float tinggi, float jari) {
        super(jari);
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
        volume_tabung = (float) (3.14*(super.getJari()*super.getJari())*tinggi);
//        System.out.println("Volume Tabung : " + volume_tabung);
        return volume_tabung;
    }

    @Override
    public float luaspermukaan() {
        luaspermukaan_tabung = (float) ((tinggi + super.getJari())*2*3.14*super.getJari());
//        System.out.println("Luas Permukaan Tabung : " + luaspermukaan_tabung);
        return luaspermukaan_tabung;
    }

}
