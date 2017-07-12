package com.example.fedet.entregablematerialdesign.View.Activites;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.example.fedet.entregablematerialdesign.Model.Recetas;
import com.example.fedet.entregablematerialdesign.R;
import com.example.fedet.entregablematerialdesign.View.Fragment.FragmentAboutUs;
import com.example.fedet.entregablematerialdesign.View.Fragment.FragmentDetalleRecetas;
import com.example.fedet.entregablematerialdesign.View.Fragment.FragmentRecetas;
import com.example.fedet.entregablematerialdesign.View.Fragment.FragmentRestaurant;

public class ActivityMain extends AppCompatActivity implements FragmentRecetas.NotifyChanges {

    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DrawerLayout
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayoutId);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // Configuracion actionbar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setBackgroundDrawable(new ColorDrawable(getColor(R.color.transparent)));

        // Navigation Drawer
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentRecetas fragmentRecetas = new FragmentRecetas();
                FragmentAboutUs fragmentAboutUs = new FragmentAboutUs();

                switch (item.getItemId()){
                    case R.id.menu_seccion_restaurant:
                       Intent intent = new Intent(ActivityMain.this, ActivityRestaurant.class);
                       startActivity(intent);
                        break;
                    case R.id.menu_seccion_aboutUs:
                        colocarFragment(fragmentAboutUs);
                        break;
                    case R.id.menu_seccion_listaReceta:
                        colocarFragment(fragmentRecetas);
                        break;
                }

                drawerLayout.closeDrawers();
                return false;
            }
        });

    }

    public void colocarFragment (Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorFragment, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    // Metodo para cerrar y abrir el navigationview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void enviarReceta(Recetas recetas) {
        Bundle bundle = new Bundle();

        bundle.putInt(FragmentDetalleRecetas.CLAVE_IMAGEN, recetas.getImagenRecetas());
        bundle.putString(FragmentDetalleRecetas.CLAVE_TEXTO, recetas.getRecetas());
        bundle.putString(FragmentDetalleRecetas.CLAVE_DESC, recetas.getDescripcion());

        FragmentDetalleRecetas fragmentDetalleRecetas = new FragmentDetalleRecetas();
        fragmentDetalleRecetas.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedorFragment, fragmentDetalleRecetas);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
