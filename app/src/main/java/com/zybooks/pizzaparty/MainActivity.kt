//https://github.com/GU-APP-DEV-2024/participation-2-android-app-development-l2-TyYasukochi


/*I was thinking about making an app to track your progress in the gym, like a workout log.
  I frequently go to the gym and currently just use my notes app to track my progress, so I figured an app would be better and pretty useful.
  I know its a common thing for gym goers to track their progress by writing down their exercises and amount of weight done, so I feel it would provide a lot of value.
  I expect some challenges would be on the backend of the app like storing the user's data(previous logs).
*/
package com.zybooks.pizzaparty

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}