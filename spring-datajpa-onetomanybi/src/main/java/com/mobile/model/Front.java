package com.mobile.model;

public enum Front {
    MP5("5 Megapixels",CameraType.FRONT.name()),
    MP8("8 Megapixels",CameraType.FRONT.name()),
    MP16("16 Megapixels",CameraType.FRONT.name()),
    MP32("32 Megapixels",CameraType.FRONT.name()),
    MP64("64 Megapixels",CameraType.FRONT.name()),
    MP50("50 Megapixels",CameraType.FRONT.name());

    public final String pixels;
    public final String type;

    Front(String pixels, String type) {
        this.pixels = pixels;
        this.type = type;
    }
}
