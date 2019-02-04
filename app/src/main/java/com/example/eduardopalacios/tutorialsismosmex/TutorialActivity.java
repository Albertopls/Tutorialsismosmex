package com.example.eduardopalacios.tutorialsismosmex;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import com.example.eduardopalacios.tutorialsismosmex.Fragments.FragmentAceptarTerms;
import com.example.eduardopalacios.tutorialsismosmex.Fragments.FragmentAgregarContacto;
import com.example.eduardopalacios.tutorialsismosmex.Fragments.FragmentAlertaSilenciosa;
import com.example.eduardopalacios.tutorialsismosmex.Fragments.FragmentEstoyBien;
import com.example.eduardopalacios.tutorialsismosmex.Fragments.FragmentPermisos;


public class TutorialActivity extends AppCompatActivity {


    public ViewPager activityTutorialVpgContenedor;
    ViewPagerAdapter viewPagerAdapter;
    Context context =this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        setUpViews();
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        activityTutorialVpgContenedor.setAdapter(viewPagerAdapter);
    }

    public void setUpViews(){
        activityTutorialVpgContenedor = findViewById(R.id.activity_tutorial_vpg_contenedor);
    }




    class ViewPagerAdapter extends FragmentPagerAdapter {

        private Fragment[] childFragments;

        ViewPagerAdapter(FragmentManager fm) {
            super(fm);
            childFragments = new Fragment[] {
                    new FragmentAceptarTerms(context),
                    new FragmentAgregarContacto(context),
                    new FragmentEstoyBien(context),
                    new FragmentAlertaSilenciosa(context),
                    new FragmentPermisos()
            };
        }

        @Override
        public Fragment getItem(int position) {
            return childFragments[position];
        }

        @Override
        public int getCount() {
            return childFragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return null;
        }
    }
}
