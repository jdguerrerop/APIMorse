package com.bootcamp.apimorse.model;

import java.util.StringTokenizer;

public class TraductorMorse {

    private String morse;

    private String salida;

    public TraductorMorse(String morse) {

        this.morse = morse;

        this.salida = "";

        traducir();

    }

    private void traducir(){

        DiccionarioMorse dm = new DiccionarioMorse();

        StringTokenizer st = new StringTokenizer(this.morse," ");

        while (st.hasMoreTokens()){

            String palabra = st.nextToken();

            salida = salida + dm.getTraduccion(palabra);

        }

    }

    public String getSalida() {
        return salida;
    }
}
