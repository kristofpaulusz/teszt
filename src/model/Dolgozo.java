/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author g
 */
public class Dolgozo {
    private String nev;
    private int kor;
    private String nem;
    private int hanyEve;
    
    public Dolgozo(String nev, int kor, String nem) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
    }

    public int getHanyEve() {
        return hanyEve;
    }

    public Dolgozo(String nev, int kor, String nem, int hanyEve) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.hanyEve = hanyEve;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNem() {
        return nem;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }
}
