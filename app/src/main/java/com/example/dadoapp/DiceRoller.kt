package com.example.dadoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private lateinit var rollbutton: Button

class DiceRoller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        rollbutton = findViewById(R.id.button)
    }
    private fun initListeners() {
        rollbutton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(10)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.text)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}