package com.example.carregaimagensonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
    }

    //Método para fechar a tela
    public void voltar(View view){
        finish();
    }

    //Método para carregar imagem no imageView
    public void carregarImagem(View view){
        ImageView imageView =
                (ImageView) findViewById(R.id.imageView);
        EditText editText =
                (EditText) findViewById(R.id.editText);
        Picasso.get()
                .load(editText.getText().toString())
                .into(imageView);
    }
}
