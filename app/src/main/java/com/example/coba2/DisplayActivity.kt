package com.example.coba2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Retrieve data from intent
        val name = intent.getStringExtra("NAME")
        val age = intent.getStringExtra("AGE")
        val gender = intent.getStringExtra("GENDER")
        val subscribe = intent.getBooleanExtra("SUBSCRIBE", false)

        // Initialize views
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val ageTextView: TextView = findViewById(R.id.ageTextView)
        val genderTextView: TextView = findViewById(R.id.genderTextView)
        val subscribeTextView: TextView = findViewById(R.id.subscribeTextView)

        // Set data to views
        nameTextView.text = getString(R.string.name_label, name)
        ageTextView.text = getString(R.string.age_label, age)
        genderTextView.text = getString(R.string.gender_label, gender)
        subscribeTextView.text = getString(R.string.subscribe_label, if (subscribe) "Ya" else "Tidak")
    }
}
