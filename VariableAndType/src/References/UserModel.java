/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package References;

/**
 *
 * @author MERT
 */
public class UserModel {

    public String adi;
    public String soyadi;
    public Integer no;

    public String bilgileri(){
    String bilgileri="Adi:"+adi+ "   " +"Soyadı:" + soyadi+ "   "+ "No:" + no;
    return bilgileri;
    }
    
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

}
