package com.bootcamp.apimorse.model;

import java.util.Locale;
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

        String[] words = morse.split("   ");

        DiccionarioMorse dm = new DiccionarioMorse();

        for(String s: words) {
            StringTokenizer st = new StringTokenizer(s, " ");
            while (st.hasMoreTokens()) {

                String palabra = st.nextToken();

                salida = salida + dm.getTraduccion(palabra);

            }
            salida += " ";
        }
        salida = salida.toUpperCase();
    }

    public String getSalida() {
        return salida;
    }
}
