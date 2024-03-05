package com.example.store.model;

import java.io.Serializable;

public class SanPham implements Serializable{
    private int hinh;
    private String tensp;
    private int soluong;
    private double donggia;
    public SanPham(int hinh, String tensp, int soluong, double donggia) {
        this.hinh = hinh;
        this.tensp = tensp;
        this.soluong = soluong;
        this.donggia = donggia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDonggia() {
        return donggia;
    }

    public void setDonggia(double donggia) {
        this.donggia = donggia;
    }

    public SanPham() {
    }
}
