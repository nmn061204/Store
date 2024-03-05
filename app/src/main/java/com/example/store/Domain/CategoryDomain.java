package com.example.store.Domain;

public class CategoryDomain {
    private String title;
    private  String pc;

    public CategoryDomain(String title, String pc) {
        this.title = title;
        this.pc = pc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }
}
