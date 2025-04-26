package com.example.biletum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

/**
 * Активность авторизации пользователя в приложении.
 *
 * Эта активность отвечает за:
 * - Ввод номера телефона пользователем.
 * - Переход в главное окно приложения при успешной авторизации.
 * - Переход на экран регистрации нового пользователя.
 */
class AuthorizationActivity : AppCompatActivity() {

    /**
     * Вызывается при создании активности.
     * Настраивает пользовательский интерфейс и обрабатывает действия пользователей, такие как
     * нажатия на кнопки для авторизации или перехода на экран регистрации.
     *
     * @param savedInstanceState Состояние активности, если оно было ранее сохранено.
     * Это состояние можно использовать для восстановления данных активности после её пересоздания.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authorization)

        // Кнопка для авторизации пользователя в приложении.
        // При нажатии происходит переход в главное окно приложения.
        val button: Button = findViewById(R.id.Authorization_button_authoriz)
        button.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Кнопка для перехода на экран регистрации нового пользователя.
        // При нажатии происходит переход на активность регистрации.
        val buttonReg: Button = findViewById(R.id.Authorization_toRegistr)
        buttonReg.setOnClickListener {
            val intent: Intent = Intent(this, RegistrActivity::class.java)
            startActivity(intent)
        }

        // Поле для ввода номера телефона.
        // Пользователь должен ввести свой номер телефона для авторизации.
        val inputText: EditText = findViewById(R.id.Authorization_eT_phoneNumber)
    }
}
