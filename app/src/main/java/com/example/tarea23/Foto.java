package com.example.tarea23;

import android.graphics.Bitmap;

public class Foto {
    Bitmap imagen;
    String descripcion;

    public Foto(Bitmap imagen, String descripcion)
    {
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public Bitmap getImagen()
    {
        return imagen;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

}