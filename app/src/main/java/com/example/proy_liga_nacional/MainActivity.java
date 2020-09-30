package com.example.proy_liga_nacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.icon_registro:{
                Intent intent=new Intent(this,upeRegistro.class);
                startActivity(intent);
                break;
            }
            case R.id.icon_resultado:{
                Intent intent=new Intent(this,upeResultados.class);
                startActivity(intent);
                break;
            }
            case R.id.icon_equipo:{
                Intent intent=new Intent(this,upeEquipo.class);
                startActivity(intent);
                break;
            }
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}