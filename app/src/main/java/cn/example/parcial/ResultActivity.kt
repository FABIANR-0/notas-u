package cn.example.parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var nombreMat : TextView = findViewById(R.id.nombremat)
        var horasTeo : TextView = findViewById(R.id.horasteoricas)
        var horasPrac : TextView = findViewById(R.id.horaspract)
        var numeroCredito : TextView = findViewById(R.id.numeroCredito)
        var trabajoInd : TextView = findViewById(R.id.trabajoInde)


        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.result)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left,systemBars.top,systemBars.right,systemBars.bottom)
            insets
        }

        var nombreMate : String = intent.extras?.getString("nombreMat").orEmpty()
        var horasTeor : String = intent.extras?.getString("horaTeo").orEmpty()
        var horasPract : String = intent.extras?.getString("horaPrac").orEmpty()
        var numeroCreditos : String = intent.extras?.getString("numeroCreditos").orEmpty()
        var trabajoIndp : String = intent.extras?.getString("trabajoInd").orEmpty()

        nombreMat.text = nombreMate
        horasTeo.text = horasTeor
        horasPrac.text = horasPract
        numeroCredito.text = numeroCreditos
        trabajoInd.text = trabajoIndp

    }
}