package com.example.adventurequest;

import androidx.appcompat.app.AppCompatActivity;

public class Battle {

    //Variables
    Enemy enemy;
    Story story;

    public Battle(GameScreen gameScreen){
        this.story.gameScreen = gameScreen;

    }


    public void attack() {

        //Main text in UI
        story.gameScreen.mainTextPlace.setText("This is the battle");

        // Buttons
        story.gameScreen.button1.setText("-");
        story.gameScreen.button2.setText("-");
        story.gameScreen.button3.setText("-");

        story.gameScreen.image.setImageResource(R.drawable.hilltale);

        // button assign
        story.nextPosition1 = "";
        story.nextPosition2 = "";
        story.nextPosition3 = "";
    }

}
