package com.example.carregaimagensonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para trocar de tela quando apertar o botão
    public void trocarDeTela(View view){
        Intent intent =
                new Intent(this, FotoActivity.class);
        startActivity(intent);
    }
}
