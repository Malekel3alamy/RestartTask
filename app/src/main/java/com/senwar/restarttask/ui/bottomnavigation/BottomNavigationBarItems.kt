package com.senwar.restarttask.ui.bottomnavigation

import android.graphics.drawable.PaintDrawable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.senwar.restarttask.R


data class BottomNavItem(val index:Int,val route :String, val icon : Int, val label :String, val contentDescription :String)


  val screenList = listOf(BottomNavItem(1,"home", R.drawable.home_3x,"Home","You will find your study plan here"),
      BottomNavItem(2,"connect", R.drawable.chat_3x,"Connect","Here you will find study partners and people to connect with"),
      BottomNavItem(3,"questions",R.drawable.help,"Questions","Here are the questions with model answers"),
      BottomNavItem(4,"tools",R.drawable.pen,"Tools","Tools"),
      BottomNavItem(5,"profile",R.drawable.profile,"Profile","User Profile"))

