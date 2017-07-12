package com.example.fedet.entregablematerialdesign.View.Adapter;

import com.example.fedet.entregablematerialdesign.Model.Recetas;
import com.example.fedet.entregablematerialdesign.R;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecycleViewRecetas extends RecyclerView.Adapter implements View.OnClickListener {

    private Context context;
    private List <Recetas> listaRecetas;
    private View.OnClickListener onClickListener;

    public AdapterRecycleViewRecetas(Context context, List<Recetas> listaRecetas) {
        this.context = context;
        this.listaRecetas = listaRecetas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.recycleview_detalle_listarecetas, parent, false);

        view.setOnClickListener(this);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Recetas recetas = listaRecetas.get(position);
        ViewHolder myViewHolder = (ViewHolder) holder;

        myViewHolder.cargarDatos(recetas);
    }

    @Override
    public int getItemCount() {
        return listaRecetas.size();
    }

    public Recetas getItem (Integer position){
        return listaRecetas.get(position);
    }

    @Override
    public void onClick(View v) {

        if(onClickListener != null) {
            onClickListener.onClick(v);
        }
    }

    public void setListener (View.OnClickListener listener){
        onClickListener = listener;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagenReceta;
        private TextView textoReceta;

        public ViewHolder(View itemView) {
            super(itemView);
            textoReceta = (TextView) itemView.findViewById(R.id.textoReceta);
            imagenReceta = (ImageView) itemView.findViewById(R.id.imagenReceta);
        }

        public void cargarDatos (Recetas unaReceta){
            imagenReceta.setImageResource(unaReceta.getImagenRecetas());
            textoReceta.setText(unaReceta.getRecetas());
        }

    }
}
