package com.example.adventurequest;

public class Story {

    GameScreen gameScreen;
    String nextPosition1, nextPosition2, nextPosition3;
    Battle battle;
    Enemy enemy;



    public Story(GameScreen gameScreen){
        this.gameScreen = gameScreen;
    }

    public void selectPosition(String position){
        switch(position){
            case "beggining":
                beggining();
                break;
            case "mainStory2":
                mainStory2();
                break;
            case "mainStory3":
                mainStory3();
                break;
            case "mainStory4":
                mainStory4();
                break;
            case "mainStory5":
                mainStory5();
                break;
            case "mainStory5Continue":
                mainStory5Continue();
                break;
            case "mainStory5Push":
                mainStory5Push();
                break;
            case "mainStory5Left":
                mainStory5Left();
                break;
            case "wolfBattle":
                wolfBattle();
                break;
            case "mainStory6":
                mainStory6();
                break;
        }
    }

    public void beggining(){
        gameScreen.mainTextPlace.setText("This tale begins in the region of Zanarkand, in your home village, Hill Tale.\n\n" +
                "The world around you is slowly decaying, friends become ill, vegetation dying and food rotting but nobody seems to know why.\n\n" +
                "One night while asleep you are awoken by the screams of the villagers.\n\n" +
                "You quickly get dressed, grab your sword and rush out the door to see what's going on.");

        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Continue");
        gameScreen.button3.setText("-");

        gameScreen.image.setImageResource(R.drawable.hilltale);


        nextPosition1 = "";
        nextPosition2 = "mainStory2";
        nextPosition3 = "";
    }

    public void mainStory2() {
        //Main text in gameScreen
        gameScreen.mainTextPlace.setText("Outside is chaos." +
                "\n\nPeople are running and screaming and houses are ablaze." +
                "\n\nThe smell of fire and blood engulf the air." +
                "\n\nBefore you can figure out what is happening you feel a heavy thud to your head." +
                "\n\n You are unconscious.");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Continue");
        gameScreen.button3.setText("Back");

        gameScreen.image.setImageResource(R.drawable.fire);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "mainStory3";
        nextPosition3 = "beggining";
    }

    public void mainStory3() {

        //Main text in gameScreen
        gameScreen.mainTextPlace.setText("...");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Awaken");
        gameScreen.button3.setText("Back");

        gameScreen.image.setImageResource(R.drawable.sleep);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "mainStory4";
        nextPosition3 = "mainStory2";
    }

    public void mainStory4() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("You slowly awaken..." +
                "\n\nYour sword still clutched in your hand." +
                "\n\nA surge of pain rushes to the back of your head" +
                "\n\n'Uhhhh my head'" +
                "\n\nSilence falls upon the village..." +
                "\n\nThe once piercing screams have gone." +
                "\n\nThe whole village is burning.");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Continue");
        gameScreen.button3.setText("Back");

        gameScreen.image.setImageResource(R.drawable.smoke);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "mainStory5";
        nextPosition3 = "mainStory3";
    }

    public void mainStory5() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("Confused and with the village burning you decide to leave quickly." +
                "\n\nYou follow the dirt path out of the village." +
                        "\n\nYou walk for a while until you come across a path veering off to the left." +
                        "\n\nWhich way will you go?");

        // Buttons
        gameScreen.button1.setText("Left");
        gameScreen.button2.setText("Forward");
        gameScreen.button3.setText("Back");

        gameScreen.image.setImageResource(R.drawable.dirtpath);

        // button assign
        nextPosition1 = "mainStory5Left";
        nextPosition2 = "mainStory5Continue";
        nextPosition3 = "mainStory4";
    }

    public void mainStory5Continue() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("You continue on for some time until the path narrows.\n\n" +
                        "The trees and shrubs have overgrown making it awkward to get through.");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Forward");
        gameScreen.button3.setText("Back");

        gameScreen.image.setImageResource(R.drawable.bush);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "mainStory5Push";
        nextPosition3 = "mainStory5";
    }

    public void mainStory5Push() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("You force your way through the overgrown shrubs...\n\n" +
                "You get a few scratches and scrapes as you reach the opening at the other end.\n\n" +
                "You lose 2 health.");


        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Continue");
        gameScreen.button3.setText("-");

        gameScreen.image.setImageResource(R.drawable.thorns);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "mainStory6";
        nextPosition3 = "";
    }

    public void mainStory5Left() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("You change direction and take the path going left.\n\n" +
                "Up ahead you see a pack of wolves roaming along the path. They notice you and freeze, staring at you...\n\n" +
                "One of them runs straight towards you.\n\n" +
                "The others scarper into the woods.\n\n" +
                "It leaps towards you and bites your arm!\n\n" +
                "You lose 1 health.");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Fight");
        gameScreen.button3.setText("-");

        gameScreen.image.setImageResource(R.drawable.wolf);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "wolfBattle";
        nextPosition3 = "";
    }


    public void wolfBattle() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("Wolf battle");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("Attack");
        gameScreen.button3.setText("Potion");

        gameScreen.image.setImageResource(R.drawable.wolf);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void mainStory6() {

        //Main text in UI
        gameScreen.mainTextPlace.setText("6");

        // Buttons
        gameScreen.button1.setText("-");
        gameScreen.button2.setText("-");
        gameScreen.button3.setText("-");

        gameScreen.image.setImageResource(R.drawable.hilltale);

        // button assign
        nextPosition1 = "";
        nextPosition2 = "";
        nextPosition3 = "";
    }



}
