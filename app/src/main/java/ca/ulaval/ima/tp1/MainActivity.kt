package ca.ulaval.ima.tp1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit  private var UrlToLoad: String
    lateinit  private var profil: Profil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UrlToLoad = getString(R.string.url_web)
        profil = Profil(getString(R.string.prenom), getString(R.string.nom),getString(R.string.idul), this.getDate(
            resources.getInteger(R.integer.birth_year), resources.getInteger(R.integer.birth_month), resources.getInteger(R.integer.birth_day)
        ))
    }
    fun  getDate(dy: Int, mth: Int, y: Int): Date {
        val date = Calendar.getInstance();
        date.set(Calendar.YEAR, y)
        date.set(Calendar.MONTH, mth)
        date.set(Calendar.DAY_OF_MONTH, dy)
        return date.time
    }

    fun displayWebExt(view: View){
        val int = Intent(Intent.ACTION_VIEW)
        int.setData(Uri.parse(UrlToLoad))
        startActivity(int)
    }
    fun displayWebView(view: View){
        val int = Intent(applicationContext, WebActivity::class.java)
        int.putExtra("url", UrlToLoad)
        startActivity(int)
    }

    fun displayUlavalActivity(view: View){
        val int = Intent(applicationContext, UlavalActivity::class.java)
        startActivity(int)
    }


    fun displayProfil(view: View){
        val int = Intent(applicationContext, ProfilActivity::class.java)
        int.putExtra("parcelProfil", profil)
        startActivity(int)
    }





}