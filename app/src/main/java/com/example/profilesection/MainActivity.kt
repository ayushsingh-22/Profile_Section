package com.example.profilesection

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        val credGarageLayout = findViewById<LinearLayout>(R.id.cred_garage_layout)
        val creditScoreLayout = findViewById<LinearLayout>(R.id.credit_score_layout)
        val lifetimeCashbackLayout = findViewById<LinearLayout>(R.id.lifetime_cashback_layout)
        val bankBalanceLayout = findViewById<LinearLayout>(R.id.bank_balance_layout)
        val cashbackBalanceLayout = findViewById<LinearLayout>(R.id.cashback_balance_layout)
        val coinsLayout = findViewById<LinearLayout>(R.id.coins_layout)
        val winUptoLayout = findViewById<LinearLayout>(R.id.win_upto_layout)
        val allTransactionsLayout = findViewById<LinearLayout>(R.id.all_transactions_layout)

        // Set up click listeners
        credGarageLayout.setOnClickListener {
            // Handle click for CRED Garage
            Toast.makeText(this, "CRED Garage clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, CredGarageActivity::class.java))
        }

        creditScoreLayout.setOnClickListener {
            // Handle click for Credit Score
            Toast.makeText(this, "Credit Score clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, CreditScoreActivity::class.java))
        }

        lifetimeCashbackLayout.setOnClickListener {
            // Handle click for Lifetime Cashback
            Toast.makeText(this, "Lifetime Cashback clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, LifetimeCashbackActivity::class.java))
        }

        bankBalanceLayout.setOnClickListener {
            // Handle click for Bank Balance
            Toast.makeText(this, "Bank Balance clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, BankBalanceActivity::class.java))
        }

        cashbackBalanceLayout.setOnClickListener {
            // Handle click for Cashback Balance
            Toast.makeText(this, "Cashback Balance clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, CashbackBalanceActivity::class.java))
        }

        coinsLayout.setOnClickListener {
            // Handle click for Coins
            Toast.makeText(this, "Coins clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, CoinsActivity::class.java))
        }

        winUptoLayout.setOnClickListener {
            // Handle click for Win upto Rs 1000
            Toast.makeText(this, "Win upto Rs 1000 clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, WinUptoActivity::class.java))
        }

        allTransactionsLayout.setOnClickListener {
            // Handle click for All Transactions
            Toast.makeText(this, "All Transactions clicked", Toast.LENGTH_SHORT).show()
            // You can start a new activity or fragment here
            // startActivity(Intent(this, AllTransactionsActivity::class.java))
        }
    }
}
