package com.example.cc15.soco;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by chota_bheem on 27/7/16.
 */
public class FragmentBasicInfo extends Fragment {
    EditText firstName;
    EditText lastName;
    EditText dob;
    EditText age;
    Button genderMale;
    Button genderFemale;
    Button genderOther;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                 ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_basic_info, container, false);


        firstName = (EditText) rootView.findViewById(R.id.edittext_firstname);
        firstName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
             //       textViewfirstName.setVisibility(View.INVISIBLE);
                    //SingletonSignUpData.getInstance().setFirstName(firstName.getText().toString());
                }
                else{
               //     textViewfirstName.setVisibility(View.VISIBLE);
                  //  SingletonSignUpData.getInstance().setFirstName(firstName.getText().toString());
                }


            }
        });






        genderMale = (Button) rootView.findViewById(R.id.mle_btn);
        genderMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    genderMale.setBackgroundColor(Color.parseColor("#d166bf"));
                    genderFemale.setBackgroundColor(Color.parseColor("#586264"));
                    genderOther.setBackgroundColor(Color.parseColor("#586264"));

                }
                //     SingletonSignUpData.getInstance().setGender("male");
            }
        });

        genderFemale = (Button) rootView.findViewById(R.id.fmle_btn);
        genderFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genderFemale.setBackgroundColor(Color.parseColor("#d166bf"));
                genderMale.setBackgroundColor(Color.parseColor("#586264"));
                genderOther.setBackgroundColor(Color.parseColor("#586264"));

                //     SingletonSignUpData.getInstance().setGender("female");
            }
        });

        genderOther = (Button) rootView.findViewById(R.id.othr_btn);
        genderOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genderOther.setBackgroundColor(Color.parseColor("#d166bf"));
                genderMale.setBackgroundColor(Color.parseColor("#586264"));
                genderFemale.setBackgroundColor(Color.parseColor("#586264"));

//
//       SingletonSignUpData.getInstance().setFirstName(firstName.getText().toString());
//                Toast.makeText(getActivity().getApplicationContext(), "from edit text "+lastName.getText().toString() , Toast.LENGTH_LONG).show();
//                Toast.makeText(getActivity().getApplicationContext(), "from singleton "+ SingletonSignUpData.getInstance().getFirstName().toString() , Toast.LENGTH_LONG).show();
             //   SingletonSignUpData.getInstance().setGender("other");
            }
        });
       Button interests = (Button)rootView.findViewById(R.id.interest_button);
        interests.setOnClickListener(new View.OnClickListener(){
         @Override
            public void onClick(View v) {
             Intent i = new Intent(getContext() , interest_list.class );
             startActivity(i);
            }
        });


        return rootView;
    }


}
