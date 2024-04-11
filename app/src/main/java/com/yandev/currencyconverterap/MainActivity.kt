package com.yandev.currencyconverterap

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var titleTextView: TextView;
    lateinit var resultTextView: TextView;
    lateinit var editText: EditText;
    lateinit var converterButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        titleTextView = findViewById(R.id.title);
        resultTextView = findViewById(R.id.convertedValue);
        editText = findViewById(R.id.editText);
        converterButton = findViewById(R.id.button);


        converterButton.setOnClickListener{

            var enteredUSD:String = editText.text.toString();
            var enteredUSDdouble: Double = enteredUSD.toDouble();


            var reals = convertToReal(enteredUSDdouble);
            "R$ $reals".also { resultTextView.text = it };
        }
    }

    private fun convertToReal(value: Double): Double {
        return value * 5.07;
    }
}