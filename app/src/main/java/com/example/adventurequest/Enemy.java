package com.example.adventurequest;

public class Enemy {

    // Variables
    String enemyType;
    int enemyHealth;
    int enemyAttack;

    // Constructor
    public Enemy(String enemyType, int enemyHealth) {
        this.enemyType = enemyType;
        this.enemyHealth = enemyHealth;
    }



    // Getters and setters
    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }
}
