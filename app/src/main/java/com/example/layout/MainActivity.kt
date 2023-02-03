package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculous.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_calculous){
            calculate()
        }
    }

    private fun calculate(){

        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()

        val totalValue = (distance * price) / autonomy
        binding.textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"
       // Toast.makeText(this, totalValue.toString(), Toast.LENGTH_SHORT).show()

    }
}