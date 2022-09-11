package com.mobile.model;

public enum Rear {
    DUAL(CameraType.REAR.name()),
    TRIPLE(CameraType.REAR.name()),
    FOUR(CameraType.REAR.name());

    Rear(String type) {
        this.type = type;
    }

    public String type;
}
