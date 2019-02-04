package com.example.eduardopalacios.tutorialsismosmex.Fragments;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.eduardopalacios.tutorialsismosmex.R;
import com.example.eduardopalacios.tutorialsismosmex.TutorialActivity;


public class FragmentAlertaSilenciosa extends Fragment implements View.OnClickListener {


    View view;
    Context context;
    ImageView fragmentAlertaSilenciosaImgFlechaIzq;
    ImageView fragmentAlertaSilenciosaImgFlechaDer;

    public FragmentAlertaSilenciosa() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public FragmentAlertaSilenciosa(Context context) {
        this.context = context;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_fragment_alerta_silenciosa, container, false);
        setUpViews();
        return view;
    }
    public void setUpViews(){
        fragmentAlertaSilenciosaImgFlechaIzq = view.findViewById(R.id.fragment_alerta_silenciosa_img_flecha_izq);
        fragmentAlertaSilenciosaImgFlechaIzq.setOnClickListener(this);

        fragmentAlertaSilenciosaImgFlechaDer = view.findViewById(R.id.fragment_alerta_silenciosa_img_flecha_der);
        fragmentAlertaSilenciosaImgFlechaDer.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.fragment_alerta_silenciosa_img_flecha_izq:
                ((TutorialActivity)context).
                        activityTutorialVpgContenedor.setCurrentItem(getItem(-1),true);
                break;

            case R.id.fragment_alerta_silenciosa_img_flecha_der:
                ((TutorialActivity)context).
                        activityTutorialVpgContenedor.setCurrentItem(getItem(+1),true);

                break;

        }

    }

    private int getItem(int i) {
        return ((TutorialActivity)context).
                activityTutorialVpgContenedor.getCurrentItem() + i;
    }

}
