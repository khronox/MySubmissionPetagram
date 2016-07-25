package com.duquehenry.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mi Action Bar
        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBarMain);
        setSupportActionBar(miActionBar);

        //RecyclerView
        listaMascotas = (RecyclerView) findViewById(R.id.recyclerViewMascotas);

        //Como mostrar el RecyclerView en una lista
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        //El RecyclerView se comportara como un LinearLayoutManager
        listaMascotas.setLayoutManager(linearLayoutManager);

        //Se llama al metodo inicializarListaMascotas
        inicializarListaDeMascotas();

        //Se llama al metodo inicializarAdapter
        inicializarAdapter();
    }

    //Metodo para llenado de mascotas

    public void inicializarListaDeMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Khronox",     "3",    R.drawable.puppy_1));
        mascotas.add(new Mascota("Aaron",       "4",    R.drawable.puppy_2));
        mascotas.add(new Mascota("Hades",       "3.5",  R.drawable.puppy_3));
        mascotas.add(new Mascota("Cookie",      "3.7",  R.drawable.puppy_4));
        mascotas.add(new Mascota("Rocky",       "4.5",  R.drawable.puppy_5));
        mascotas.add(new Mascota("Amanda",      "3.1",  R.drawable.puppy_6));
        mascotas.add(new Mascota("Tito",        "3.9",  R.drawable.puppy_7));
        mascotas.add(new Mascota("Ares",        "4.2",  R.drawable.puppy_8));
        mascotas.add(new Mascota("Kid",         "4.4",  R.drawable.puppy_9));
        mascotas.add(new Mascota("Susie",       "3.6",  R.drawable.puppy_10));

    }

    //Metodo para inicializar el adaptador

    public void inicializarAdapter(){
        MascotaAdapter mascotaAdapter = new MascotaAdapter(mascotas, this);
        //El RecyclerView contendra al adaptador
        listaMascotas.setAdapter(mascotaAdapter);
    }

    //Para ir a la activity de Raiting
    public void irRaitingMascotas(View view){
        Intent intent = new Intent(this, RaitingActivity.class);
        startActivity(intent);
    }
}
