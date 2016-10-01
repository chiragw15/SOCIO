package com.example.cc15.soco;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cc15 on 30/9/16.
 */
public class FragmentUpload1 extends Fragment {
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.upload_fragment, container, false);
        TextView next = (TextView) view.findViewById(R.id.next_button1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentUpload2();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        ImageView cameraButton =(ImageView)view.findViewById(R.id.camera);
        cameraButton.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA)
                                != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(getActivity(),
                                    new String[]{Manifest.permission.CAMERA},REQUEST_IMAGE_CAPTURE);
                        } else {
                            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivity(intent);
                        }
                    }
                }
        );
        ImageView videoButton =(ImageView)view.findViewById(R.id.video);
        videoButton.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA)
                                != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(getActivity(),
                                    new String[]{Manifest.permission.CAMERA},REQUEST_IMAGE_CAPTURE);
                        } else {
                            Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                            startActivity(intent);
                        }
                    }
                }
        );

        return view;
    }
    /////////////////////////////////////////

}