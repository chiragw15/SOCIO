package com.example.cc15.soco;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cc15.soco.DataModels.SingletonIssuesList;
import com.greenfrvr.hashtagview.HashtagView;

import java.util.ArrayList;
import java.util.List;

import co.lujun.androidtagview.TagContainerLayout;
import co.lujun.androidtagview.TagView;

/**
 * Created by cc15 on 30/9/16.
 */
public class FragmentUpload2 extends Fragment {
    ArrayList<String> issuesList = new ArrayList<String>();

    ArrayList<String> selectedIssues = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        issuesList.add("Discrimination");
        issuesList.add("Sanitation");
        issuesList.add("Corruption");
        issuesList.add("Harrasment");
        issuesList.add("Domestic violence");
        issuesList.add("Stray Animals");
        issuesList.add("Pollution");
        issuesList.add("Education");
        issuesList.add("Fraud");
        issuesList.add("Communalism");
        issuesList.add("Unsafe Construction");



        SingletonIssuesList.Instance().setshabd(issuesList);

        View view = inflater.inflate(R.layout.fragment_upload_2, container, false);

        final EditText editText_Issues = (EditText) view.findViewById(R.id.edit_text_issues);

        final TagContainerLayout mTagContainerLayout = (TagContainerLayout) view.findViewById(R.id.tagcontainerLayout);
        mTagContainerLayout.setTags(issuesList);

        final TagContainerLayout mTagContainerLayout2 = (TagContainerLayout) view.findViewById(R.id.tagcontainerLayout2);

        mTagContainerLayout.setOnTagClickListener(new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(int position, String text) {
                // ...

                mTagContainerLayout.removeTag(position);
                mTagContainerLayout2.addTag(text);

            }
            @Override
            public void onTagLongClick(final int position, String text) {
                // ...
                selectedIssues.add(text);
//                mTagContainerLayout.setTagBackgroundColor(Color.TRANSPARENT);
            }

        });

        Button btnAddTag = (Button) view.findViewById(R.id.btn_add_tag);
        btnAddTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTagContainerLayout2.addTag(editText_Issues.getText().toString());
                // Add tag in the specified position
//                mTagContainerLayout1.addTag(text.getText().toString(), 4);
            }
        });
        ImageView next = (ImageView) view.findViewById(R.id.iv_next2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentUpload3();
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
