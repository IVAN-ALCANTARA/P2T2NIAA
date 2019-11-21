package mx.edu.tesoem.isc.niaa.p2t2niaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class frm4 {
    public static ArrayList<String> listaColores=new ArrayList<String>();
    public static void agregar(String name){
        listaColores.add(name);
    }
    public static ArrayList<String>mostrar(){
        return listaColores;
    }
}

