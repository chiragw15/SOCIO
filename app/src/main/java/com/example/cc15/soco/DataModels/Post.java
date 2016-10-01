package com.example.cc15.soco.DataModels;

import java.util.ArrayList;

/**
 * Created by chota_bheem on 1/10/16.
 */
public class Post {

    private String mName;

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    private String mDescription;

    public Post(String name, String mDescription) {
        mName = name;
        this.mDescription = mDescription;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) { this.mDescription = description; }



    private static int lastPostId = 0;
    public static ArrayList<Post> createContactsList(int numContacts) {
        ArrayList<Post> contacts = new ArrayList<Post>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Post("Person " + ++lastPostId,"HELLO"));
        }

        return contacts;
    }

}
