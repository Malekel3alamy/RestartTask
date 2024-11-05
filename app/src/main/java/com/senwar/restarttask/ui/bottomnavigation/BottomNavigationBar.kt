package com.senwar.restarttask.ui.bottomnavigation

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jetpack.showcaseview.ShowCaseView
import com.senwar.restarttask.R
import com.senwar.restarttask.ui.screens.ConnectScreen
import com.senwar.restarttask.ui.screens.HomeScreen
import com.senwar.restarttask.ui.screens.ProfileScreen
import com.senwar.restarttask.ui.screens.questionsscreen.QuestionsScreen
import com.senwar.restarttask.ui.screens.ToolsScreen
import com.senwar.restarttask.ui.theme.fontFamily
import com.senwar.spotlight.ShowCaseProperty


@Composable
fun BottomNavigationBar(caseViewEnabled:Boolean){

    var navigationTutorialFinished by remember { mutableStateOf(false) }

    val context = LocalContext.current

    val targets = remember { mutableStateMapOf<String, ShowCaseProperty>() }

    var selectedIndex  by remember {
        mutableStateOf(0)
    }
 Scaffold (
     modifier = Modifier.fillMaxSize(),
     bottomBar = {


         NavigationBar {
         screenList.forEachIndexed { index, bottomNavItem ->

             NavigationBarItem(
                 selected = selectedIndex == index,
                 onClick = {
                     selectedIndex = index
                 },
                 icon = { 
                     Icon(
                         painter = painterResource(id = bottomNavItem.icon),
                         contentDescription = bottomNavItem.contentDescription ,
                         tint = if (selectedIndex == index) {colorResource(id = R.color.teal_200)} else{Color.Gray}
                         )
                 },
                 label = {
                     Text(
                         text = bottomNavItem.label,
                         color = if (selectedIndex == index) {
                             colorResource(id = R.color.teal_200)} else{Color.Gray},
                         fontSize = 11.sp ,
                         fontWeight = FontWeight.Bold ,
                         fontFamily = fontFamily,
                     )
                 },
                 modifier = Modifier
                     .onGloballyPositioned { coordinates ->
                         targets[bottomNavItem.route] = ShowCaseProperty(
                             bottomNavItem.index,
                             coordinates,
                             "navigation",
                             bottomNavItem.contentDescription

                         )
                     }

             
             )

         }
         }
     }
 ){ innerPadding ->

     ContentScreen(caseViewEnabled,modifier = Modifier.padding(innerPadding),selectedIndex)

     if (navigationTutorialFinished){
         selectedIndex = 2
         ContentScreen(caseViewEnabled,selectedIndex = 2)
     }

 }
    if (caseViewEnabled){
        ShowCaseView(targets = targets) {
            navigationTutorialFinished = true

        }
    }




}



@Composable
fun ContentScreen(caseViewEnabled: Boolean,modifier: Modifier = Modifier, selectedIndex: Int){

     when(selectedIndex){
         0 -> HomeScreen()
         1 -> ConnectScreen()
         2 -> QuestionsScreen(caseViewEnabled )
         3 -> ToolsScreen(caseViewEnabled)
         4 -> ProfileScreen()
     }
}


