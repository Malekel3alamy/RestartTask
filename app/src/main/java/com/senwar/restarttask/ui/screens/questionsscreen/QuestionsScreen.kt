package com.senwar.restarttask.ui.screens.questionsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senwar.restarttask.R


@Composable
fun QuestionsScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .fillMaxSize()

    ) {


          Row (
              modifier = Modifier
                  .padding(start = 25.dp, top = 50.dp),
              horizontalArrangement = Arrangement.Start,
              verticalAlignment = Alignment.Top
          ){
              com.senwar.restarttask.ui.Button()
          }


        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            content = {
               item {
                   SpecialCardItem()
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
        )

    }
}
