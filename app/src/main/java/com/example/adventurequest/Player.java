package com.example.adventurequest;

public class Player {

    // Variables
    int playerHealth;
    int playerAttack;
    int potionCapacity;
    int potionAmount;


    // Constructor
    public Player(int playerHealth, int playerAttack, int potionCapacity, int potionAmount) {
        this.playerHealth = playerHealth;
        this.playerAttack = playerAttack;
        this.potionCapacity = potionCapacity;
        this.potionAmount = potionAmount;
    }

    // Empty constructor
    public Player() {

    }

    // Getters & setters
    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }

    public int getPotionCapacity() {
        return potionCapacity;
    }

    public void setPotionCapacity(int potionCapacity) {
        this.potionCapacity = potionCapacity;
    }

    public int getPotionAmount() {
        return potionAmount;
    }

    public void setPotionAmount(int potionAmount) {
        this.potionAmount = potionAmount;
    }
}
