package ca.ulaval.ima.tp1

import android.os.Parcel
import android.os.Parcelable
import java.util.*

data class Profil(val prenom: String, val nom: String, val Idul: String, val bd: Date?): Parcelable {
    companion object {
        @JvmField
        val CREATOR = object : Parcelable.Creator<Profil> {
            override fun createFromParcel(parcel: Parcel) = Profil(parcel)
            override fun newArray(size: Int) = arrayOfNulls<Profil>(size)
        }
    }
    constructor(parcel: Parcel) : this(
            prenom = parcel.readString() ?: "",
            nom = parcel.readString() ?: "",
            Idul = parcel.readString() ?: "",
            //bd = parcel.readValue(Date::class.java.classLoader) as? Date
             bd = Date(parcel.readLong())



    )
    override fun describeContents(): Int {
        return 0

    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(prenom)
        parcel.writeString(nom)
        parcel.writeString(Idul)
        if (bd != null) {
            parcel.writeLong(bd.time)
        }

    }
}


