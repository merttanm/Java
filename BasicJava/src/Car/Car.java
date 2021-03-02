/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author MERT
 */
 class Car {

    public String marka;
    public String model;
    public String renk;
    public String tipi;
    public int km;
    public int hız;
    public int sıfırla;

    public double go(int newKm) {
        km += newKm;
        double periyot = (double) newKm / hız;
        return periyot;
    }

    public double sıfırla(int newSıfırla) {
        km = 0;
        return km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getHız() {
        return hız;
    }

    public void setHız(int hız) {
        this.hız = hız;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

}
