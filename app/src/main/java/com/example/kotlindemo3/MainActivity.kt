package com.example.kotlindemo3

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var fortuneList = arrayListOf("Don’t count on it",
        "Ask again later",
        "You can rely on it",
        "Without a doubt",
        "Outlook is not so good",
        "It's decidedly so",
        "Signs point to yes",
        "Yes, definitely",
        "Yes",
        "My sources say NO")

    private lateinit var fortuneLabel : TextView
    private lateinit var fortuneImageView : ImageView
    private lateinit var fortuneBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fortuneLabel = findViewById(R.id.fortuneText) as TextView
        fortuneImageView = findViewById(R.id.fortunateImage) as ImageView
        fortuneBtn = findViewById(R.id.fortuneButton) as Button

        fortuneBtn.setOnClickListener {
            val index = Random.nextInt(fortuneList.size)
            fortuneLabel.text = fortuneList[index]
        }

       /* fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
    }

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }*/

   /* public fun didTapOnFindFortunAction(){

        val index = Random.nextInt(fortuneList.size)
        fortuneLabel.text = fortuneList[index]

    }*/

}
