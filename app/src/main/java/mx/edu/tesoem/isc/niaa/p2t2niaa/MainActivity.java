package mx.edu.tesoem.isc.niaa.p2t2niaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void agregarcolor(View v){
        Intent ac = new Intent(this,agregarColor.class);
        startActivity(ac);
        finish();
    }

    public void mostrarcolor(View v){
        Intent mc = new Intent(this,mostrarColor.class);
        startActivity(mc);
        finish();
    }
}
