package com.example.fedet.entregablematerialdesign.View.Activites;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fedet.entregablematerialdesign.Model.Restaurante;
import com.example.fedet.entregablematerialdesign.R;
import com.example.fedet.entregablematerialdesign.View.Adapter.AdapterViewPagerRestaurant;

import java.util.ArrayList;
import java.util.List;

public class ActivityRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_activtiy);

        List<Restaurante> listaImangenes = new ArrayList<>();
        listaImangenes.add(new Restaurante(R.drawable.astridygaston, "Restaurant: Astrid y Gaston"));
        listaImangenes.add(new Restaurante(R.drawable.borago, "Restaurant: Boragó"));
        listaImangenes.add(new Restaurante(R.drawable.central, "Restaurant: Central"));
        listaImangenes.add(new Restaurante(R.drawable.dom, "Restaurant: Exclusive"));
        listaImangenes.add(new Restaurante(R.drawable.maido, "Restaurant: Maido"));
        listaImangenes.add(new Restaurante(R.drawable.mani, "Restaurant: Mani Club"));
        listaImangenes.add(new Restaurante(R.drawable.quintonil, "Restaurant: Quin Tonil Rest"));
        listaImangenes.add(new Restaurante(R.drawable.tegui, "Restaurant: Tegui Bar"));

        FragmentManager fragmentManager = getSupportFragmentManager();

        AdapterViewPagerRestaurant adapterViewPagerRestaurant = new AdapterViewPagerRestaurant(fragmentManager, listaImangenes);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPagerId);
        viewPager.setAdapter(adapterViewPagerRestaurant);
    }
}
