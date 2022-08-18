package com.example.adventurequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameScreen extends AppCompatActivity {

    ImageView image;
    TextView mainTextPlace;
    Button button1, button2, button3;

    Story story = new Story(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        mainTextPlace = (TextView) findViewById(R.id.mainTextPlace);
        button1 = (Button) findViewById(R.id.choiceButton1);
        button2 = (Button) findViewById(R.id.choiceButton2);
        button3 = (Button) findViewById(R.id.choiceButton3);
        image = (ImageView) findViewById(R.id.imageView);

        story.beggining();

    }

    @Override
    public void onBackPressed () {
        Toast.makeText(GameScreen.this, "Disabled", Toast.LENGTH_SHORT).show();
    }

    public void button1(View view){
        story.selectPosition(story.nextPosition1);
    }

    public void button2(View view){
        story.selectPosition(story.nextPosition2);
    }

    public void button3(View view){
        story.selectPosition(story.nextPosition3);
    }



}