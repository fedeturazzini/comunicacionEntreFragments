package com.example.fedet.entregablematerialdesign.View.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fedet.entregablematerialdesign.R;


public class FragmentAboutUs extends Fragment {

    Context context = getContext();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        Button button = (Button) view.findViewById(R.id.botonConctactar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Snackbar snackbar = Snackbar.make(v ,"Mail: fede.turazzini@gmail.com | Telefono: 1541735498", Snackbar.LENGTH_LONG);
                snackbar.setAction("", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });

        return view;
    }
}

