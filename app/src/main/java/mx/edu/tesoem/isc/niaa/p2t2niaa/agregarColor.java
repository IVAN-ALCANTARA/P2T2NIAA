package mx.edu.tesoem.isc.niaa.p2t2niaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class agregarColor extends AppCompatActivity {

    Button btnagregar;
    EditText txtcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_color);
        btnagregar=findViewById(R.id.btnagregar);
        txtcolor=findViewById(R.id.txtcolor);
    }

    public void menuprincipal(View v){
        Intent menu = new Intent(this,MainActivity.class);
        startActivity(menu);
        finish();
    }

    public void Guardar(View view) {
        if(txtcolor.getText().equals(null)){
            Toast to1=Toast.makeText(getApplicationContext(), "campo vacio", Toast.LENGTH_SHORT);
            to1.show();
        }else{
            frm4.agregar( txtcolor.getText().toString());
            Toast to1=Toast.makeText(getApplicationContext(), txtcolor.getText().toString(), Toast.LENGTH_SHORT);
            to1.show();
            txtcolor.setText("");
        }
    }
    public void mostrarcolor(View v){
        Intent mc = new Intent(this,mostrarColor.class);
        startActivity(mc);
        finish();
    }
}
