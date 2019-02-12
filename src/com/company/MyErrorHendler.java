package com.company;

public class MyErrorHendler extends Throwable {
    public void aVoid (){
        int x = 1;
        assert x > 0;
    }
}
