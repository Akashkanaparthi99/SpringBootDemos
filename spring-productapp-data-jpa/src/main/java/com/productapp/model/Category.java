package com.productapp.model;

public enum Category {
    HOME("HOME APPLIANCES"),
    ELECTRONICS("ELECTRONICS"),
    APPARELS("APPARELS"),
    COSMETICS("COSMETICS"),
    TOYS("TOYS AND GAMES");
    public final String type;

    Category(String type) {
        this.type = type;
    }
}
