package com.example.pcpartscompatibility

import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FinishedBuildActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished_build)

        // Получение информации о собранной конфигурации из предыдущих активностей
        val assembledPCInfo = intent.getStringExtra("assembledPCInfo")

        // Отображение информации о собранной конфигурации
        val textViewAssembledPCInfo = findViewById<TextView>(R.id.textViewAssembledPCInfo)
        textViewAssembledPCInfo.text = assembledPCInfo

        // Обработчик для кнопки "Выйти в главное меню"
        val buttonExitToMainMenu = findViewById<Button>(R.id.buttonExitToMainMenu)
        buttonExitToMainMenu.setOnClickListener {
            val intent = Intent(this, StarstActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
