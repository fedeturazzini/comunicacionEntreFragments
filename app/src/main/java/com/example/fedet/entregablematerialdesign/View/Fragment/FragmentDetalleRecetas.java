package com.example.fedet.entregablematerialdesign.View.Fragment;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.graphics.Palette;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.fedet.entregablematerialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleRecetas extends Fragment {

    public static final String CLAVE_IMAGEN = "clave_imagen";
    public static final String CLAVE_TEXTO = "clave_texto";
    public static final String CLAVE_DESC = "clave_desc";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detalle_recetas, container, false);

        Bundle bundle = getArguments();

        Integer imagenDetalle = bundle.getInt(CLAVE_IMAGEN);
        String texto = bundle.getString(CLAVE_TEXTO);
        String descripcion = bundle.getString(CLAVE_DESC);

        TextView textoNombreReceta = (TextView) view.findViewById(R.id.textoNombreRecetaDetalle);
        textoNombreReceta.setText(texto);

        ImageView imagenReceta = (ImageView) view.findViewById(R.id.imagenRecetaDetalle);
        imagenReceta.setImageResource(imagenDetalle);

        TextView textoDescrReceta = (TextView) view.findViewById(R.id.textoDescRecetaDetalle);
        textoDescrReceta.setText(descripcion);


        // Cambiar la foto segun el color de la imagen
        //Guardo en un bitmap la imagen que está en el imageView, con ese bitmap voy a generar una paleta de colores
        Bitmap bitmap = ((BitmapDrawable)imagenReceta.getDrawable()).getBitmap();
        //Genero una paleta de colores del bitmap
        Palette palette = Palette.from(bitmap).generate();
        //Consigo un swatch(color) vibrante de la paleta que generé
        Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();
        //Puedo pedir diferentes colores de la paleta dependiendo lo que necesite
        //Seteo ese color como background del textview
        textoNombreReceta.setBackgroundColor(vibrantSwatch.getRgb());
        RelativeLayout frameLayout = (RelativeLayout) view.findViewById(R.id.frameFragment);
        //Seteo otro de los colores de la paleta como background del frame
        Palette.Swatch lightVibrantSwatch = palette.getLightVibrantSwatch();
        frameLayout.setBackgroundColor(vibrantSwatch.getRgb());

        Button button = (Button) view.findViewById(R.id.buttonReceta);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v ,"Se te envio un mail con la receta completa", Snackbar.LENGTH_SHORT);
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
