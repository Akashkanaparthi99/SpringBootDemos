package com.mobile.model;

public enum CameraType {
    FRONT("Front Camera"),
    REAR("Rear Camera");

    CameraType(String type) {
        this.type = type;
    }

    public final String type;

}
