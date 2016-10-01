package com.example.cc15.soco;

import java.util.ArrayList;

/**
 * Created by ArinjayaKhare1 on 02-10-2016.
 */
public class SingletonSession {

    private static SingletonSession instance;
    private ArrayList<word> mshabd;
    //no outer class can initialize this class's object
    private SingletonSession() {}

    public static SingletonSession Instance()
    {
        //if no instance is initialized yet then create new instance
        //else return stored instance
        if (instance == null)
        {
            instance = new SingletonSession();
        }
        return instance;
    }

    public ArrayList<word> getshabd() {
        return mshabd;
    }

    public void setshabd(ArrayList<word> akshar) {
        this.mshabd=akshar;
    }
}