package com.senwar.restarttask.ui.screens.questionsscreen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.showcaseview.ShowCaseView
import com.senwar.restarttask.R
import com.senwar.restarttask.ui.ButtonFilter
import com.senwar.restarttask.ui.theme.fontFamily
import com.senwar.spotlight.ShowCaseProperty

@Composable
fun QuestionsScreen(caseViewEnabled:Boolean) {
    val context = LocalContext.current

    val targets = remember { mutableStateMapOf<String, ShowCaseProperty>() }

   Scaffold {innerPadding ->
       Column(
           modifier = Modifier
               .wrapContentSize(Alignment.Center)
               .fillMaxSize()
               .padding(innerPadding)
       ) {

           Row (
               modifier = Modifier
                   .padding(start = 30.dp, top = 50.dp),
               horizontalArrangement = Arrangement.Start,
               verticalAlignment = Alignment.Top
           ){
               ButtonFilter(modifier = Modifier
                   .size(width = 120.dp, height = 45.dp)
                   .onGloballyPositioned { coordinates ->
                       targets["filter"] = ShowCaseProperty(
                           8,
                           coordinates,
                           "Filter Questions",
                           "You can Click here to filter questions"
                       )
                   })
           }
           LazyVerticalGrid(
               columns = GridCells.Fixed(2),
               modifier = Modifier
                   .fillMaxSize()
                   .padding(15.dp),

               ){

               item {
                   SpecialCardItem (modifier =  Modifier
                       .size(width = 220.dp, height = 130.dp)
                       .padding(15.dp)
                       .onGloballyPositioned { coordinates ->
                           targets["Card"] = ShowCaseProperty(
                               7,
                               coordinates,
                               "Card Item",
                               "Click here to see by categories with progression"
                           )
                       }
                   )

               }

               item {
                   CardItem()
               }
               item {
                   CardItem()
               }

               item {
                   CardItem()
               }
               item {
                   CardItem()
               }
           }



       }
   }
    if (caseViewEnabled){
        ShowCaseView(targets = targets) {
            Toast.makeText(context, "App Intro finished!", Toast.LENGTH_SHORT).show()

        }
    }
}


