package com.example.codepathmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var listItems: List<ListItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val itemsRv = findViewById<RecyclerView>(R.id.list)
        // Fetch the list of items
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val name = findViewById<EditText>(R.id.editName).text.toString()
            val price = findViewById<EditText>(R.id.editPrice).text.toString()
            val url = findViewById<EditText>(R.id.editUrl).text.toString()
            listItems = ItemFetcher.getEmails(name, price, url)

            // Create adapter passing in the list of items
            val adapter = ItemAdapter(listItems)
            // Attach the adapter to the RecyclerView to populate items
            itemsRv.adapter = adapter

            findViewById<EditText>(R.id.editName).setText("")
            findViewById<EditText>(R.id.editPrice).setText("")
            findViewById<EditText>(R.id.editUrl).setText("")
        }

        // Set layout manager to position the items
        itemsRv.layoutManager = LinearLayoutManager(this)
    }
}