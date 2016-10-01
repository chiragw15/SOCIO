package com.example.cc15.soco;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;



/**
 * Created by chota_bheem on 1/10/16.
 */
public class FragmentPostImage extends Fragment {
    ArrayList<String> words=new ArrayList<String>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        words.add("Bye");
        words.add("Sayonara");
        words.add("Namaste");
        words.add("Namaskar");
        words.add("Well Done");
        words.add("Well Done Anando");
        words.add("I am still better than you :P");
        return inflater.inflate(R.layout.fragment_post_image, parent, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ListView lv = (ListView) view.findViewById(R.id.lvComments);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,words);
        lv.setAdapter(adapter);
    }

}

