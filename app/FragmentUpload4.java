package com.example.cc15.soco;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import co.lujun.androidtagview.TagContainerLayout;

/**
 * Created by chota_bheem on 1/10/16.
 */
public class FragmentUpload4 extends Fragment {
    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add("image");
        items.add("image");
        items.add("image");
        items.add("image");
        return items;
    }

    ArrayList<String> issuesList = new ArrayList<String>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upload_4, container, false);

        issuesList.add("Discrimination");
        issuesList.add("Sanitation");
        issuesList.add("Corruption");
        issuesList.add("Harrasment");
        issuesList.add("Domestic violence");

        final TagContainerLayout mTagContainerLayout = (TagContainerLayout) view.findViewById(R.id.tagcontainerLayout);
        mTagContainerLayout.setTags(issuesList);

        return view;
    }
}
