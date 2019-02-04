package com.example.eduardopalacios.tutorialsismosmex.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.eduardopalacios.tutorialsismosmex.R;
import com.example.eduardopalacios.tutorialsismosmex.TutorialActivity;


public class FragmentAgregarContacto extends Fragment implements View.OnClickListener {


    View view;
    Context context;
    ImageView fragmentAgregarContactosImgFlechaIzq;
    ImageView fragmentAgregarContactosImgFlechaDer;

    public FragmentAgregarContacto() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public FragmentAgregarContacto(Context context) {
        this.context = context;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_agregar_contacto, container, false);
        setUpViews();
        return view;
    }

    public void setUpViews(){
        fragmentAgregarContactosImgFlechaIzq = view.findViewById(R.id.fragment_agregar_contactos_img_flecha_izq);
        fragmentAgregarContactosImgFlechaIzq.setOnClickListener(this);

        fragmentAgregarContactosImgFlechaDer = view.findViewById(R.id.fragment_agregar_contactos_img_flecha_der);
        fragmentAgregarContactosImgFlechaDer.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.fragment_agregar_contactos_img_flecha_izq:
                ((TutorialActivity)context).
                        activityTutorialVpgContenedor.setCurrentItem(getItem(-1),true);
                break;

            case R.id.fragment_agregar_contactos_img_flecha_der:
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
