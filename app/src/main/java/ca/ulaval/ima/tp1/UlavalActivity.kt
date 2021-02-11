package ca.ulaval.ima.tp1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class UlavalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulaval)
    }
    fun close (view: View){
        finish()
    }

}