package com.example.fedet.entregablematerialdesign.View.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.fedet.entregablematerialdesign.Model.Restaurante;
import com.example.fedet.entregablematerialdesign.View.Fragment.FragmentRestaurant;

import java.util.ArrayList;
import java.util.List;


public class AdapterViewPagerRestaurant extends FragmentStatePagerAdapter {

    private List <Fragment> listFragments = new ArrayList<>();

    public AdapterViewPagerRestaurant(FragmentManager fm, List<Restaurante> listaDatosImagenes) {
        super(fm);
        for (Restaurante restaurante :  listaDatosImagenes) {
            FragmentRestaurant fragmentRestaurant = FragmentRestaurant.fabricaDeImagenesRestaurant(restaurante);
            listFragments.add(fragmentRestaurant);
        }
    }

    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }
}
