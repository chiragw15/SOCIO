package com.example.cc15.soco.DataModels;

import java.util.ArrayList;

/**
 * Created by chota_bheem on 1/10/16.
 */
public class Post {

    private String mName;

    public Post(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }



    private static int lastPostId = 0;
    public static ArrayList<Post> createContactsList(int numContacts) {
        ArrayList<Post> contacts = new ArrayList<Post>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Post("Person " + ++lastPostId));
        }

        return contacts;
    }

}
