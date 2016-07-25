package com.duquehenry.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

import java.util.ArrayList;

/**
 * Created by hduque on 25/07/2016.
 */
public class RaitingActivity extends AppCompatActivity{

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotasRaiting;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiting);

        //Mi Action Bar
        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBarRaiting);
        setSupportActionBar(miActionBar);

        //RecyclerView
        listaMascotasRaiting = (RecyclerView) findViewById(R.id.recyclerViewMascotasRaiting);

        //Como mostrar el RecyclerView en una lista
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        //El RecyclerView se comportara como un LinearLayoutManager
        listaMascotasRaiting.setLayoutManager(linearLayoutManager);

        //Se llama al metodo inicializarListaMascotas
        inicializarListaDeMascotasRaiting();

        //Se llama al metodo inicializarAdapter
        inicializarAdapter();

        //para que funcione la configuracion que se realizo en android.manifest
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Metodo para llenado de mascotas

    public void inicializarListaDeMascotasRaiting(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Rocky",       "4.5",  R.drawable.puppy_5));
        mascotas.add(new Mascota("Kid",         "4.4",  R.drawable.puppy_9));
        mascotas.add(new Mascota("Ares",        "4.2",  R.drawable.puppy_8));
        mascotas.add(new Mascota("Aaron",       "4",    R.drawable.puppy_2));
        mascotas.add(new Mascota("Tito",        "3.9",  R.drawable.puppy_7));
    }

    //Metodo para inicializar el adaptador

    public void inicializarAdapter(){
        MascotaAdapter mascotaAdapter = new MascotaAdapter(mascotas, this);
        //El RecyclerView contendra al adaptador
        listaMascotasRaiting.setAdapter(mascotaAdapter);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(RaitingActivity.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}
