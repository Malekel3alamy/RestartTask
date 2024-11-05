package com.senwar.restarttask

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import com.senwar.restarttask.ui.bottomnavigation.BottomNavigationBar
import com.senwar.restarttask.ui.theme.RestartTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            if (getShared()){
                BottomNavigationBar(false)
            }else{
                BottomNavigationBar(true)
                share(myValue = true)
            }

        }
    }


    // save boolean value to shared preferences
    @Composable
    fun share(myValue:Boolean){
        val context = LocalContext.current
        val sharedPreferences = remember { context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE) }



        // Update Shared Preferences when myValue changes
        LaunchedEffect(myValue) {
            sharedPreferences.edit { putBoolean("firstVisit", myValue) }
        }
    }

    // get values from shared preferences
    @Composable
    fun getShared():Boolean{
        val context = LocalContext.current

        val sharedPreferences = remember { context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE) }
         return  sharedPreferences.getBoolean("firstVisit",false)
    }

    

}


