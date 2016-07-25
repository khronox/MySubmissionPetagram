package com.duquehenry.petagram;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by hduque on 24/07/2016.
 */
public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder>{
    ArrayList<Mascota>      mascotas;
    Activity                activity;

    //Constructor
    public MascotaAdapter(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Infla el Layout y pasara por el ViewHolder para que obtenga los datos que vienen
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet, parent, false);
        return new MascotaViewHolder(view);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);

        mascotaViewHolder.imageViewFotoMascotaCardView.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.textViewNombreMascotaCardView.setText(mascota.getNombreMascota());
        mascotaViewHolder.textViewRaitingCardView.setText(mascota.getRaitingMascota());

        mascotaViewHolder.imagenButtonRaitingCardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Te gusta " + mascota.getNombreMascota(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Cantidad de elementos que contiene mi lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    //Clase estatica MascotaViewHolder
    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView       imageViewFotoMascotaCardView;
        private ImageButton     imagenButtonRaitingCardView;
        private TextView        textViewNombreMascotaCardView;
        private TextView        textViewRaitingCardView;

        public MascotaViewHolder(View itemView){
            super(itemView);
            imageViewFotoMascotaCardView        = (ImageView)       itemView.findViewById(R.id.imageViewFotoMascotaCardView);
            imagenButtonRaitingCardView         = (ImageButton)     itemView.findViewById(R.id.imagenButtonRaitingCardView);
            textViewNombreMascotaCardView       = (TextView)        itemView.findViewById(R.id.textViewNombreMascotaCardView);
            textViewRaitingCardView             = (TextView)        itemView.findViewById(R.id.textViewRaitingCardView);
        }
    }
}
