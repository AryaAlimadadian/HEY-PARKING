package com.example.heyparkingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.heyparkingproject.databinding.ActivityMapsBinding
import java.security.KeyStore
import java.util.*
import kotlin.concurrent.schedule

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {



    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()




        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val reserve = findViewById<Button>(R.id.reserve)

        reserve.setOnClickListener {
            val intent= Intent(baseContext, MainActivity2::class.java)
            startActivity(intent)
        }
        val start = findViewById<Button>(R.id.start)

        start.setOnClickListener {

            val timer = object: CountDownTimer(2000, 20) {
                override fun onTick(millisUntilFinished: Long){}

                override fun onFinish() {
                    Toast.makeText(
                        applicationContext,
                        "Parking found",
                        Toast.LENGTH_LONG
                    ).show()
                    reserve.setEnabled(true)
                }
            }
            timer.start()
        }
        val logout = findViewById<Button>(R.id.logout)

        logout.setOnClickListener {
            val intent= Intent(baseContext, MainActivity3::class.java)
            startActivity(intent)
            Toast.makeText(
                applicationContext,
                "Successfully logged out",
                Toast.LENGTH_LONG
            ).show()
            finish()
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Tehran and move the camera
        val tehran = LatLng(35.80, 51.45)
        mMap.addMarker(MarkerOptions().position(tehran).title("Marker in Tehran"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(tehran))
    }

}