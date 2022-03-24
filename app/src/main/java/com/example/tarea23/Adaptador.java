package com.example.tarea23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends ArrayAdapter<Foto> {

    ArrayList<Foto> listaImagenes = new ArrayList<>();

    public Adaptador(Context context, int textViewResourceId, ArrayList<Foto> objects) {
        super(context, textViewResourceId, objects);
        listaImagenes = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.view_items, null);
        ImageView imageView = (ImageView) v.findViewById(R.id.img);
        imageView.setImageBitmap(listaImagenes.get(position).getImagen());
        TextView textView = (TextView) v.findViewById(R.id.txt);
        textView.setText(listaImagenes.get(position).getDescripcion());
        return v;
    }

}
