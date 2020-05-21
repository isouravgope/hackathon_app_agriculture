package com.shadowos.agrifarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shadowact2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.shadowos.agrifarm.R.layout.activity_shadowact2);
    }

    public void stylelame1(View view){
        Intent intent = new Intent(this,shadowact3.class);
        startActivity(intent);
    }
}
