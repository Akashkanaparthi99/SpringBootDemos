package com.mobile.model;

public enum Storage {
    STORAGE32("32GB STORAGE"),
    STORAGE64("64GB STORAGE"),
    STORAGE128("128GB STORAGE"),
    STORAGE256("256GB STORAGE"),
    STORAGE512("512GB STORAGE"),
    STORAGE1T("1TB STORAGE");

    public final String type;

    Storage(String type) {
        this.type = type;
    }
}
