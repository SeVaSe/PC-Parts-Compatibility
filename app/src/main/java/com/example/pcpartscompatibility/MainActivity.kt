package com.example.pcpartscompatibility

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSelectMotherboard1: Button = findViewById(R.id.buttonSelectMotherboard1)
        val buttonSelectMotherboard2: Button = findViewById(R.id.buttonSelectMotherboard2)
        val buttonSelectMotherboard3: Button = findViewById(R.id.buttonSelectMotherboard3)
        val buttonSelectMotherboard4: Button = findViewById(R.id.buttonSelectMotherboard4)
        val buttonSelectMotherboard5: Button = findViewById(R.id.buttonSelectMotherboard5)

        buttonSelectMotherboard1.setOnClickListener {
            showMotherboardDescription("componentType", "motherboard")
        }

        buttonSelectMotherboard2.setOnClickListener {
            showMotherboardDescription("componentType1", "motherboard")
        }

        buttonSelectMotherboard3.setOnClickListener {
            showMotherboardDescription("componentType2", "motherboard")
        }

        buttonSelectMotherboard4.setOnClickListener {
            showMotherboardDescription("componentType3", "motherboard")
        }

        buttonSelectMotherboard5.setOnClickListener {
            showMotherboardDescription("componentType4", "motherboard")
        }
    }

    private fun showMotherboardDescription(compType: String, typeEl: String) {
        val intent = Intent(this, MotherboardDescriptionActivity::class.java)
        intent.putExtra(compType, typeEl)
        startActivity(intent)
    }
}
