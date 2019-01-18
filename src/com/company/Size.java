package com.company;

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abb;

    private Size(String abbr){
        this.abb = abbr;
    }
    public String getAbb(){
        return abb;
    }
}
