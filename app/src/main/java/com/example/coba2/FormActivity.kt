package com.example.coba2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var maleRadioButton: RadioButton
    private lateinit var femaleRadioButton: RadioButton
    private lateinit var subscribeCheckBox: CheckBox
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        // Initialize views
        nameEditText = findViewById(R.id.nameEditText)
        ageEditText = findViewById(R.id.ageEditText)
        maleRadioButton = findViewById(R.id.maleRadioButton)
        femaleRadioButton = findViewById(R.id.femaleRadioButton)
        subscribeCheckBox = findViewById(R.id.subscribeCheckBox)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString()
            val gender = if (maleRadioButton.isChecked) "Laki-laki" else "Perempuan"
            val subscribe = subscribeCheckBox.isChecked

            // Check if name and age are not empty
            if (name.isNotEmpty() && age.isNotEmpty()) {
                val intent = Intent(this, DisplayActivity::class.java)
                intent.putExtra("NAME", name)
                intent.putExtra("AGE", age)
                intent.putExtra("GENDER", gender)
                intent.putExtra("SUBSCRIBE", subscribe)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Tolong Isi Semua Data!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
