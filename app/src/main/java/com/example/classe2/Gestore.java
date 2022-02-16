package com.example.classe2;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Gestore {

    public String leggiFile(String nomefile, Context c){

        try {
            BufferedReader fileDaLeggere =
                    new BufferedReader(
                            new InputStreamReader(c.openFileInput(nomefile)));
            String testoDaRestituire;
            StringBuilder sb = new StringBuilder();
            while((testoDaRestituire = fileDaLeggere.readLine())!=null)
            {
                sb.append(testoDaRestituire + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.e("Gestore","Errore nel apertura del file");
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("Gestore", "impossibile leggere il file");
        }
        return sb.toString();
    }

    public String scriviFile(String nomefile, Context c)
    {
        String esito;
        FileOutputStream file0;
        String testodascrivere = "Questo e il testo che voglio scrivere";
        try {
            file0 = c.openFileOutput(nomefile, Context.MODE_PRIVATE);
            file0.write(testodascrivere.getBytes());

            file0.close();
            esito = "File scritto corettamente";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            esito = "File non trovato!!";
        } catch (IOException e) {
            e.printStackTrace();
            esito = "Impossibile scrivere il file";
        }

        return "";
    }

}
