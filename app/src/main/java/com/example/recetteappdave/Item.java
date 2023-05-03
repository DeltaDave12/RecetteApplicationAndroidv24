package com.example.recetteappdave;

public class Item {
    private String itemName;
    private int imgref;

    public Item(String itemName, int imgref) {
        this.itemName = itemName;
        this.imgref = imgref;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getImgref() {
        return imgref;
    }
    public void setImgref(int imgref) {
        this.imgref = imgref;
    }
}
