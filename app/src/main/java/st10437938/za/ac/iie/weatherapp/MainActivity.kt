package st10437938.za.ac.iie.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private fun <T> Array<T>.average(): Any {

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(searchButton4)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.button2)
        val weekEditText = findViewById<EditText>(R.id.editTextText)
        val resultTextView = findViewById<TextView>(R.id.textView)
        val days = arrayOf<String>(“ Monday”, “Tuesday”, “Wednesday “, ‘Thursday”, “Friday”, “Saturday”, “Sunday)
        val temperatureArray = arrayOf(12, 15.15, 14, 10, 10, 10,25, 29, 28, 24, 20,18, 16)
        val WeatherCondition = arrayOf<String>(“Sunny”, “Sunny”, “Cloudy”, “Raining”, “Raining”, “Cold”)

        val averageTemperature = temperatureArray .average()

        val searchButton.setOnClick
        val exitButton.setOnClickListener(
            averageTemperature.clear()



        )



