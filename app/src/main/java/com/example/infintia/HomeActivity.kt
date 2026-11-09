package com.example.infintia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btnCatalogo).setOnClickListener {
            startActivity(Intent(this, CatalogActivity::class.java))
        }

        findViewById<Button>(R.id.btnCarrito).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }

        findViewById<Button>(R.id.btnPerfil).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        findViewById<Button>(R.id.btnVendedor).setOnClickListener {
            startActivity(Intent(this, SellerDashboardActivity::class.java))
        }

        findViewById<Button>(R.id.btnAdmin).setOnClickListener {
            startActivity(Intent(this, AdminDashboardActivity::class.java))
        }
    }
}