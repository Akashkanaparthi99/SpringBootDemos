package com.mobile.model;

public enum Memory {
    GB4("4 GB"),
    GB8("8 GB"),
    GB12("12 GB"),
    GB16("16 GB");

    public final String type;

    Memory(String type) {
        this.type = type;
    }
}
