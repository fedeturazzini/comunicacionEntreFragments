package com.example.fedet.entregablematerialdesign.View.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fedet.entregablematerialdesign.Model.Recetas;
import com.example.fedet.entregablematerialdesign.R;
import com.example.fedet.entregablematerialdesign.View.Adapter.AdapterRecycleViewRecetas;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecetas extends Fragment {

    private NotifyChanges notification;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_recetas, container, false);

        List <Recetas> listReceta = new ArrayList<>();
        listReceta.add(new Recetas("Pañuelitos de jamón y queso", R.drawable.jamonyqueso, "Para tu próxima picada, probá estos pañuelitos que pueden hacerse simplemente con solo tres, o más ingredientes de tu elección."));
        listReceta.add(new Recetas("Capellettis con Pollo, Jamón Cocido y Champignones", R.drawable.capelletisge, "Qué delicia y divina combinación en un plato, queso, pollo, jamón, champignones y pasta!"));
        listReceta.add(new Recetas("Tarta Liviana de Atún", R.drawable.tartalivianae, "Los mariscos tienden a deleitar por doquier, pero esta tarta es digna de ser parte del menú durante la cuaresma u otra ocasión special."));
        listReceta.add(new Recetas("Strudel de Puerros y Hongos", R.drawable.strudele, "Deleitá a tu familia o invitados en cualquier evento con este strudel vegetariano super fácil hacer y sumamente económico."));
        listReceta.add(new Recetas("Ravioles con Rúcula y Tomate Secos", R.drawable.raviolesconrucula, "Hay tantas formas de preparar la pasta rellena y estos ravioles, son la base perfecta para agregarles ingredientes que tengás al alance en la despensa y heladera."));
        listReceta.add(new Recetas("Canastitas de Brócoli", R.drawable.canastitas, "Cuando te pidan contribuir algo para picar para una reunión de amigos, prepará estos bocadillos que son tan económicos como deliciosos."));
        listReceta.add(new Recetas("Triangulitos de Verdeo", R.drawable.triangulitos, "Estos triangulitos hacen un almuerzo vegetariano ligero y los podés modificar agregando atún, pollo o carne picada cocidos para hacerlos más fuertes."));
        listReceta.add(new Recetas("Pinchos de Raviolitos", R.drawable.pinchosraviolitos, "Pinchos de Raviolitos"));
        listReceta.add(new Recetas("Pizzeta de Rúcula y Cubitos de Tomate", R.drawable.pizzetarucula, "Aqui tenés un almuerzo ligero y económico de cinco ingredientes para cuatro personas para un día de semana que puede hacerse en tan solo 20 minutos."));
        listReceta.add(new Recetas("Piquitos de Espárragos al Romero", R.drawable.piquitosromero, "Un almuerzo rápido y rico se logra en un dos por tres con estos piquitos de espárragos que podés modificar al gusto y acompañar con una ensalada mixta."));
        listReceta.add(new Recetas("Triangulitos de Verdeo", R.drawable.triangulitos, "Estos triangulitos hacen un almuerzo vegetariano ligero y los podés modificar agregando atún, pollo o carne picada cocidos para hacerlos más fuertes."));
        listReceta.add(new Recetas("Pinchos de Raviolitos", R.drawable.pinchosraviolitos, "Pinchos de Raviolitos"));
        listReceta.add(new Recetas("Pizzeta de Rúcula y Cubitos de Tomate", R.drawable.pizzetarucula, "Aqui tenés un almuerzo ligero y económico de cinco ingredientes para cuatro personas para un día de semana que puede hacerse en tan solo 20 minutos."));
        listReceta.add(new Recetas("Piquitos de Espárragos al Romero", R.drawable.piquitosromero, "Un almuerzo rápido y rico se logra en un dos por tres con estos piquitos de espárragos que podés modificar al gusto y acompañar con una ensalada mixta."));
        listReceta.add(new Recetas("Triangulitos de Verdeo", R.drawable.triangulitos, "Estos triangulitos hacen un almuerzo vegetariano ligero y los podés modificar agregando atún, pollo o carne picada cocidos para hacerlos más fuertes."));
        listReceta.add(new Recetas("Pinchos de Raviolitos", R.drawable.pinchosraviolitos, "Pinchos de Raviolitos"));
        listReceta.add(new Recetas("Strudel de Puerros y Hongos", R.drawable.strudele, "Deleitá a tu familia o invitados en cualquier evento con este strudel vegetariano super fácil hacer y sumamente económico."));
        listReceta.add(new Recetas("Ravioles con Rúcula y Tomate Secos", R.drawable.raviolesconrucula, "Hay tantas formas de preparar la pasta rellena y estos ravioles, son la base perfecta para agregarles ingredientes que tengás al alance en la despensa y heladera."));
        listReceta.add(new Recetas("Canastitas de Brócoli", R.drawable.canastitas, "Cuando te pidan contribuir algo para picar para una reunión de amigos, prepará estos bocadillos que son tan económicos como deliciosos."));
        listReceta.add(new Recetas("Triangulitos de Verdeo", R.drawable.triangulitos, "Estos triangulitos hacen un almuerzo vegetariano ligero y los podés modificar agregando atún, pollo o carne picada cocidos para hacerlos más fuertes."));
        listReceta.add(new Recetas("Pizzeta de Rúcula y Cubitos de Tomate", R.drawable.pizzetarucula, "Aqui tenés un almuerzo ligero y económico de cinco ingredientes para cuatro personas para un día de semana que puede hacerse en tan solo 20 minutos."));
        listReceta.add(new Recetas("Piquitos de Espárragos al Romero", R.drawable.piquitosromero, "Un almuerzo rápido y rico se logra en un dos por tres con estos piquitos de espárragos que podés modificar al gusto y acompañar con una ensalada mixta."));
        listReceta.add(new Recetas("Triangulitos de Verdeo", R.drawable.triangulitos, "Estos triangulitos hacen un almuerzo vegetariano ligero y los podés modificar agregando atún, pollo o carne picada cocidos para hacerlos más fuertes."));
        listReceta.add(new Recetas("Pinchos de Raviolitos", R.drawable.pinchosraviolitos, "Pinchos de Raviolitos"));
        listReceta.add(new Recetas("Pizzeta de Rúcula y Cubitos de Tomate", R.drawable.pizzetarucula, "Aqui tenés un almuerzo ligero y económico de cinco ingredientes para cuatro personas para un día de semana que puede hacerse en tan solo 20 minutos."));
        listReceta.add(new Recetas("Piquitos de Espárragos al Romero", R.drawable.piquitosromero, "Un almuerzo rápido y rico se logra en un dos por tres con estos piquitos de espárragos que podés modificar al gusto y acompañar con una ensalada mixta."));


        final AdapterRecycleViewRecetas adapterRecycleViewRecetas = new AdapterRecycleViewRecetas(getContext(), listReceta);

        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewId);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterRecycleViewRecetas);

        View.OnClickListener listenerClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer position = recyclerView.getChildAdapterPosition(v);
                Recetas recetas = adapterRecycleViewRecetas.getItem(position);
                notification.enviarReceta(recetas);
            }
        };

        adapterRecycleViewRecetas.setListener(listenerClick);

        return view;
    }

    public interface NotifyChanges{
        void enviarReceta (Recetas recetas);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        notification = (NotifyChanges) context;
    }
}

