package com.poli.tulioassis.cuidardela

import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import android.view.View
import androidx.core.view.GravityCompat
import androidx.navigation.NavController

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navController: NavController
    private val appBarConfiguration by lazy {
        AppBarConfiguration(
            setOf(
                R.id.profileFragment,
                R.id.careFragment,
                R.id.pathologyFragment,
                R.id.nurcingFragment,
                R.id.aboutFragment
            ), drawerLayout
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        navController = findNavController(R.id.nav_host_fragment)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setNavigationItemSelectedListener { menuItem ->
            // set item as selected to persist highlight
            menuItem.isChecked = true
            // close drawer when item is tapped
            drawerLayout.closeDrawers()

            // Handle navigation view item clicks here.
            when (menuItem.itemId) {

                R.id.nav_care -> {
                    navController.navigate(R.id.careFragment)
                }

                R.id.nav_pathology -> {
                    navController.navigate(R.id.pathologyFragment)
                }

                R.id.nav_nurcing -> {
                    navController.navigate(R.id.nurcingFragment)
                }

                R.id.nav_about -> {
                    navController.navigate(R.id.aboutFragment)
                }

            }
            // Add code here to update the UI based on the item selected
            // For example, swap UI fragments here

            true
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun editProfileButton(view: View) {

    }

    //override fun onNavigationItemSelected(item: MenuItem): Boolean {
    //when (item.itemId) {

    //}
    //drawerLayout.closeDrawer(GravityCompat.START)
    //  return true
    //}


}
