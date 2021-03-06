package com.example.fuerm.primeracouchbaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    //Definimos unas cuantas constantes que nos servirán como etiquetas en los mensajes mostrados por consola.

    final String TAG = "CouchbaseEvents";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couch_base_event);
        Log.d(TAG, "Comienzo de la App Couchbase Events");
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), CouchbaseEventsActivity.class);
        startActivity(intent);
        Log.d(TAG, "Final de la App Couchbase Events");
    }
}
