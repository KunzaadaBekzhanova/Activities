package kg.tutorialapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }

}