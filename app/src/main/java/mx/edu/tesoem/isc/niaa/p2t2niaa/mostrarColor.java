package mx.edu.tesoem.isc.niaa.p2t2niaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.BatchUpdateException;
import java.util.ArrayList;

public class mostrarColor extends AppCompatActivity {


    Spinner s1;
    ArrayAdapter<String> colores ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_color);

        s1=findViewById(R.id.spinnerColor);

        colores= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,  frm4.mostrar());
        s1.setAdapter(colores);
    }

    public void onClick(View view) {
        Intent inte=new Intent(this,MainActivity.class);
        startActivity(inte);
        this.finish();
    }
    public void bToast(View view) {
        Toast to1=Toast.makeText(getApplicationContext(), s1.getSelectedItem().toString(), Toast.LENGTH_SHORT);
        to1.show();
    }

    public void menuprincipal(View v){
        Intent menu = new Intent(this,MainActivity.class);
        startActivity(menu);
        finish();
    }
}
