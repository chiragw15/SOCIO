package com.example.cc15.soco;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by chota_bheem on 27/7/16.
 */
public class FragmentVerificationInfo extends Fragment {

    EditText editTextMobile;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_verification, container, false);
        Log.i("FreagmentVer", "SingletonSignUpData.getInstance().getAge()");
        final TextView textViewMobile = (TextView) rootView.findViewById(R.id.textview_mobile);
        textViewMobile.setVisibility(View.INVISIBLE);

        final TextView textViewEmail = (TextView) rootView.findViewById(R.id.textview_email);
        textViewEmail.setVisibility(View.INVISIBLE);

        final TextView textViewChoosePassword = (TextView) rootView.findViewById(R.id.textview_choose_password);
        textViewChoosePassword.setVisibility(View.INVISIBLE);

        final TextView textViewConfirmPassword = (TextView) rootView.findViewById(R.id.textview_confirm_password);
        textViewConfirmPassword.setVisibility(View.INVISIBLE);


        final EditText editTextMobile= (EditText) rootView.findViewById(R.id.edittext_mobile);
        editTextMobile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    textViewMobile.setVisibility(View.VISIBLE);
                  //  SingletonSignUpData.getInstance().setMobileNo(editTextMobile.getText().toString());
                }
                else {
                    textViewMobile.setVisibility(View.INVISIBLE);
                    //SingletonSignUpData.getInstance().setMobileNo(editTextMobile.getText().toString());
                }
            }
        });


        final EditText editTextEmail= (EditText) rootView.findViewById(R.id.edittext_email);
        editTextEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    textViewEmail.setVisibility(View.VISIBLE);
                 //   SingletonSignUpData.getInstance().setEmailId(editTextEmail.getText().toString());
                }
                else {
                    textViewEmail.setVisibility(View.INVISIBLE);
                   // SingletonSignUpData.getInstance().setEmailId(editTextEmail.getText().toString());
                }
            }
        });

        final EditText editTextPassword= (EditText) rootView.findViewById(R.id.edittext_password);
        editTextPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    textViewChoosePassword.setVisibility(View.VISIBLE);
                 //   SingletonSignUpData.getInstance().setPassword(editTextPassword.getText().toString());
                }
                else {
                    textViewChoosePassword.setVisibility(View.INVISIBLE);
                   // SingletonSignUpData.getInstance().setPassword(editTextPassword.getText().toString());
                }
            }
        });

        EditText editTextConfirmPassword= (EditText) rootView.findViewById(R.id.edittext_confirm_password);
        editTextConfirmPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    textViewConfirmPassword.setVisibility(View.VISIBLE);
                }
                else {
                    textViewConfirmPassword.setVisibility(View.INVISIBLE);
                }
            }
        });

                Button registerButton = (Button) rootView.findViewById(R.id.signupBtn);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.i("FreagmentVer", SingletonSignUpData.getInstance().getAge().toString());
//                Toast.makeText(getActivity().getApplicationContext(), "Test"+ SingletonSignUpData.getInstance().getDob().toString() , Toast.LENGTH_LONG).show();
//                Intent i = new Intent(getActivity(), HomeActivity.class);
//                startActivity(i);
               // new AsyncTaskSignUp(getActivity()).execute();
            }
        });







        return rootView;
    }
}
