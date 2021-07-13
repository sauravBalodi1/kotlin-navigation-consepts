package com.example.kotlinnavigation2



import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        val navController=Navigation.findNavController(this,R.id.nav_host_fragment)

    }
    private fun setupBottomNavMenu(navController: NavController){
       R.id.bottom_nav?.let{
           NavigationUI.setupWithNavController(it,navController)
        }
    }
}


