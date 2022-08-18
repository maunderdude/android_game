package com.example.adventurequest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
    Back button override
    @Override
    public void onBackPressed(){
        Toast.makeText(MainActivity.this, "Text here", Toast.LENGTH_SHORT).show();
    }

     */

    public void startGame(View view){
        Intent intent = new Intent(this, GameScreen.class);
        startActivity(intent);
    }
}