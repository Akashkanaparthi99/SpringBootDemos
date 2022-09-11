package com.tutorapp.model;

public enum Topic {
    HTML5("HTML5"),
    ANGULAR("Angular"),
    PYTHON("Python"),
    DIGITAL("Digital Marketing"),
    NODE("Node JS"),
    REACT("React"),
    DJANGO("Django"),
    SPRING("Spring"),
    JAVA("java"),
    MONGO("Mongo DB"),
    COUCH("Couch DB"),
    CSS("CSS"),
    CONTENT("Content Marketing"),
    PRODUCT("Product Marketing"),
    PAIDAD("Paid Advertising"),
    ;
    public final String topic;

    Topic(String topic) {
        this.topic = topic;
    }
}
