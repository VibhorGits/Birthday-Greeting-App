package eu.tutorials.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {

            val intent = Intent(this, Birthday_Greeting_Activity::class.java)
            val name = editText1.editableText.toString()
            intent.putExtra(Birthday_Greeting_Activity.NAME_EXTRA,name)
            startActivity(intent)
        }
    }
}
