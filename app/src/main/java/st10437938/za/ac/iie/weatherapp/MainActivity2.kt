package st10437938.za.ac.iie.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val searchButton = findViewById<Button>(searchButton4)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.button2)
        val weekEditText = findViewById<EditText>(R.id.editTextText)
        val resultTextView = findViewById<TextView>(R.id.textView)
        val days = arrayOf<String>(“ Monday”, “Tuesday”, “Wednesday “, ‘Thursday”, “Friday”, “Saturday”, “
        val temperatureArray = arrayOf(12, 15.15, 14, 10, 10, 10,25, 29, 28, 24, 20,18, 16)
        val WeatherCondition = arrayOf<String>(“Sunny”, “Sunny”, “Cloudy”, “Raining”, “Raining”, “Cold”)
        val dates = intent.getStringArrayListExtra("dates") ?: arrayListOf()
        val morningScreenTimes = intent.getIntegerArrayListExtra("morningScreenTimes") ?: arrayListOf()
        val afternoonScreenTimes = intent.getIntegerArrayListExtra("afternoonScreenTimes") ?: arrayListOf()
        val activityNotes = intent.getStringArrayListExtra("activityNotes") ?: arrayListOf()

        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)
        val averageScreenTimeTextView = findViewById<TextView>(R.id.averageScreenTimeTextView)
        val backButton = findViewById<Button>(R.id.backButton)

        var totalScreenTime = 0
        var displayText = ""
        for (i in dates.indices) {
            val dailyScreenTime = morningScreenTimes[i] + afternoonScreenTimes[i]
            totalScreenTime += dailyScreenTime
            displayText += "Date: ${dates[i]}, Morning: ${morningScreenTimes[i]} min, Afternoon: ${afternoonScreenTimes[i]} min, Notes: ${activityNotes[i]}\n\n"
        }
        val averageScreenTime = if (dates.isNotEmpty()) totalScreenTime / dates.size else 0

        detailsTextView.text = displayText
        averageScreenTimeTextView.text = "Average Screen Time: $averageScreenTime minutes/day"

        backButton.setOnClickListener {
            finish()
        }
    }
}




}
}