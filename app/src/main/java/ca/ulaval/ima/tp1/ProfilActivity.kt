package ca.ulaval.ima.tp1
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        this.setInformation()
    }

    fun setInformation(){
        val int = intent
        val profil = int.getParcelableExtra<Profil>("parcelProfil")
        val prenomLabel = findViewById<TextView>(R.id.inputprenom)
        if (profil != null) {
            prenomLabel.setText(profil.prenom)
        }

        val nomLabel = findViewById<TextView>(R.id.inputnom)
        if (profil != null) {
            nomLabel.setText(profil.nom)
        }

        val idulLabel = findViewById<TextView>(R.id.inputidul)
        if (profil != null) {
            idulLabel.setText(profil.Idul)
        }
        val dateLabel = findViewById<TextView>(R.id.inputdate)
        if (profil != null) {
            val df = SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CANADA_FRENCH)
            dateLabel.setText(df.format(profil.bd))
        }

    }
}