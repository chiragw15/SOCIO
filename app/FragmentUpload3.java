package com.example.cc15.soco;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.cc15.soco.Adapters.FeedAdapter;
import com.example.cc15.soco.DataModels.Post;

import java.util.ArrayList;

import co.lujun.androidtagview.TagContainerLayout;

/**
 * Created by chota_bheem on 1/10/16.
 */
public class FragmentUpload3 extends Fragment {
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
        View view = inflater.inflate(R.layout.fragment_upload_3, container, false);
        issuesList.add("Discrimination");
        issuesList.add("Sanitation");
        issuesList.add("Corruption");
        issuesList.add("Harrasment");
        issuesList.add("Domestic violence");


        final RecyclerView rvPeople = (RecyclerView) view.findViewById(R.id.rv_people);
        FeedAdapter adapter = new FeedAdapter(getSampleArrayList());

        rvPeople.setAdapter(adapter);

        rvPeople.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        final TagContainerLayout mTagContainerLayout = (TagContainerLayout) view.findViewById(R.id.tagcontainerLayout);
        mTagContainerLayout.setTags(issuesList);

        ImageView next = (ImageView) view.findViewById(R.id.iv_next3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentUpload4();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}
