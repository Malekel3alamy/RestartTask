package com.senwar.restarttask.ui.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jetpack.showcaseview.ShowCaseView
import com.senwar.restarttask.R
import com.senwar.restarttask.ui.bottomnavigation.BottomNavigationBar
import com.senwar.restarttask.ui.theme.fontFamily
import com.senwar.spotlight.ShowCaseProperty


@Composable
fun ToolsScreen(caseViewEnabled:Boolean,navController: NavController){
    val context = LocalContext.current

    var isTutorialFinished by remember { mutableStateOf(false) }

    val targets = remember { mutableStateMapOf<String, ShowCaseProperty>() }

   Scaffold {innerPadding ->
       Column(
           modifier = Modifier
               .fillMaxSize()
               .background(Color.Cyan)
               .padding(innerPadding),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
       ) {

           Button(
               modifier = Modifier
                   .size(width = 120.dp, height = 50.dp)
                   .onGloballyPositioned { coordinates ->
                       targets["Card"] = ShowCaseProperty(
                           9,
                           coordinates,
                           "Card Item",
                           "Click here to see by categories with progression"
                       )
                   },
               colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.green90)),
               shape = RoundedCornerShape(5.dp),
               onClick = { },
           ) {
               Row(modifier = Modifier
                   .fillMaxSize(),
                   verticalAlignment = Alignment.CenterVertically,
                   horizontalArrangement = Arrangement.Start
               ) {
                   Text(
                       text = "Filter",
                       fontSize = 18.sp,
                       color = colorResource(id = R.color.white),
                       modifier = Modifier,
                       fontFamily = fontFamily

                   )

               }
           }
       }
   }

    if (isTutorialFinished){

    }
    if (caseViewEnabled){
        ShowCaseView(targets = targets) {

            Toast.makeText(context, "App Intro finished!", Toast.LENGTH_SHORT).show()
             isTutorialFinished = true
            navController.navigate("home")
        }
    }
}