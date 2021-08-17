package sg.edu.rp.c347.id19023980.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {
            // For Loop
            for(i in 1..5){
                Log.d("MainActivity",i.toString())
            }
            // While Loop
            var x = 1
            while (x<6){
                Log.d("MainActivity",x.toString())
                x++
            }

        }
        btnLetter.setOnClickListener {
            val word = etWord.text.toString()
            for(letter in word){
                Log.d("MainActivity","$letter")
            }
        }
        
    }
}