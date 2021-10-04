package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val nome = "Alex"
    val TAG = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "la $TAG è stata Creata")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "la $TAG è in Resume")
        println("Bentornato $nome")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "la $TAG è in Start")
        println("Benvenuto $nome")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "la $TAG è in Pausa")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG, "la $TAG è in Stop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "la $TAG è stata Distrutta")
    }

}