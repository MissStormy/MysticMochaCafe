package com.example.mysticmochacafe.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysticmochacafe.R

class HomeActivity : AppCompatActivity() {
    // Example initial values for resources
    private var coffeeBeans = 100
    private var milk = 50
    private var gleams = 30
    private var patrons = 5
    private var reputation = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set initial resource values
        /*updateResources()

        // Set click listeners for buttons
        profileButton.setOnClickListener {
            // Handle profile button click
        }

        announcementsButton.setOnClickListener {
            // Handle announcements button click
        }

        inventoryButton.setOnClickListener {
            // Handle inventory button click
        }

        settingsButton.setOnClickListener {
            // Handle settings button click
        }

        upgradesButton.setOnClickListener {
            // Handle upgrades button click
        }

        bestiaryButton.setOnClickListener {
            // Handle bestiary button click
        }

        levelsButton.setOnClickListener {
            // Handle levels button click
        }

        intimacyButton.setOnClickListener {
            // Handle intimacy button click
        }

    }

    private fun updateResources() {
        // Update the UI with the current resource values
        resourcesTextView.text = getString(
            R.string.resources_format,
            coffeeBeans,
            milk,
            gleams,
            patrons,
            reputation
        )
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // Handle touch events for moving around the cafe
        // You can extract touch coordinates (event.x, event.y) and update the UI accordingly
        // Example: Move a view based on touch gestures
        when (event.action) {
            MotionEvent.ACTION_MOVE -> {
                // Update UI based on touch movement
            }
        }
        return true
    }*/
}

}