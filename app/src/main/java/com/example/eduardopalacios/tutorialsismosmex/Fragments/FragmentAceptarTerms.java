package com.example.eduardopalacios.tutorialsismosmex.Fragments;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.example.eduardopalacios.tutorialsismosmex.R;
import com.example.eduardopalacios.tutorialsismosmex.TutorialActivity;

public class FragmentAceptarTerms extends Fragment implements View.OnClickListener {


    CheckBox fragmentAcceptTermsChbAceptar;

    View view;
    Context context;
    public FragmentAceptarTerms() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public FragmentAceptarTerms(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_fragment_accept_terms, container, false);
        setUpViews();
        return view;
    }

    private void setUpViews(){
        fragmentAcceptTermsChbAceptar =view.findViewById(R.id.fragment_accept_terms_chb_aceptar);
        fragmentAcceptTermsChbAceptar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.fragment_accept_terms_chb_aceptar:
                if (fragmentAcceptTermsChbAceptar.isChecked()){

                    ((TutorialActivity)context).
                            activityTutorialVpgContenedor.setCurrentItem(getItem(1),true);
                }
                break;
        }


    }



    private int getItem(int i) {
        return ((TutorialActivity)context).
                activityTutorialVpgContenedor.getCurrentItem() + i;
    }
}
