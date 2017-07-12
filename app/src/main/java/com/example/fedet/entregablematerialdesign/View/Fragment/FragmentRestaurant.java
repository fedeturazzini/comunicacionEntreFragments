package com.example.fedet.entregablematerialdesign.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fedet.entregablematerialdesign.R;
import com.example.fedet.entregablematerialdesign.Model.Restaurante;

public class FragmentRestaurant extends Fragment {

    private Integer imagen;
    private String nombreResto;
    public final static String CLAVE_IMAGEN = "clave_imagen";
    public final static String CLAVE_NOMBRE = "clave_nombre";

    public static FragmentRestaurant fabricaDeImagenesRestaurant(Restaurante restaurante) {
        Bundle bundle = new Bundle();
        bundle.putInt(CLAVE_IMAGEN, restaurante.getImagenResource());
        bundle.putString(CLAVE_NOMBRE, restaurante.getNombre());

        FragmentRestaurant fragmentRestaurant = new FragmentRestaurant();
        fragmentRestaurant.setArguments(bundle);
        return fragmentRestaurant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        imagen = bundle.getInt(CLAVE_IMAGEN);
        nombreResto = bundle.getString(CLAVE_NOMBRE);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);

        View root = view.findViewById(R.id.root);
        root.setBackgroundResource(imagen);

        TextView textoNombre = (TextView) view.findViewById(R.id.textViewRestaurant);
        textoNombre.setText(nombreResto);

        return view;
    }

}
