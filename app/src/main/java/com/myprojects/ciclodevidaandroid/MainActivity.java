package com.myprojects.ciclodevidaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtresult = findViewById(R.id.txtresult);
    }

    public void btnCheck(View view){

        if (Settings.Global.getInt(this.getContentResolver(),Settings.Global.AIRPLANE_MODE_ON, 0) != 0){
            txtresult.setText("MODO AVION ACTIVADO");
            Toast.makeText(MainActivity.this,"Modo Avion Activado",Toast.LENGTH_LONG).show();
        } else {
            txtresult.setText("MODO AVION DESACTIVADO");
            Toast.makeText(MainActivity.this,"Modo Avion Off", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mainActivity","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mainActivity","onDestroy");
    }
}