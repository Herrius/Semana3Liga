package com.example.proy_liga_nacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
ImageView logo;
TextView textoLogo;
Animation animacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textoLogo=findViewById(R.id.txtLogo);
        logo=findViewById(R.id.logo);
        animacion= AnimationUtils.loadAnimation(this,R.anim.animacion_splash);
        logo.startAnimation(animacion);
        textoLogo.startAnimation(animacion);
        //animacion
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent tran=new Intent(splash.this,MainActivity.class);
                tran.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(tran);
            }
        },4000);
    }
}