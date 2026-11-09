package com.example.infintia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SellerDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_dashboard)

        findViewById<Button>(R.id.btnProductos).setOnClickListener {
            startActivity(
                Intent(this, SellerProductsActivity::class.java)
            )
        }

        findViewById<Button>(R.id.btnPedidos).setOnClickListener {
            startActivity(
                Intent(this, SellerOrdersActivity::class.java)
            )
        }

        findViewById<Button>(R.id.btnPerfilVendedor).setOnClickListener {
            startActivity(
                Intent(this, SellerProfileActivity::class.java)
            )
        }

        findViewById<Button>(R.id.btnInventario).setOnClickListener {
            startActivity(
                Intent(this, SellerProductsActivity::class.java)
            )
        }
    }
}