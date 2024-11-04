package com.senwar.restarttask.ui.screens.questionsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senwar.restarttask.R
import com.senwar.restarttask.ui.theme.fontFamily

@Preview(showSystemUi = true)
@Composable
fun SpecialCardItem(){
    Card (
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        modifier = Modifier
            .size(width = 220.dp, height = 130.dp)
            .padding(15.dp)

    ){
        Column (
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ){
            Text(
                text ="10 sur 10 Questions" ,
                fontSize = 12.sp ,
                fontFamily = fontFamily,
                color = colorResource(id = R.color.green90),
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp)
                    .background(colorResource(id = R.color.green50)),

            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(start = 15.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.plane),
                    contentDescription = ""
                )

                Text(
                    text = " Voyage",
                    fontSize = 16.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                    )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text ="Progress  100%",
                fontSize = 12.sp,
                fontFamily = fontFamily,
                modifier = Modifier.padding(start = 15.dp),
                color = Color.Gray

                )

            LinearProgressIndicator(
                progress = 100f,
                 modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 12.dp),
                color = colorResource(id = R.color.teal_700),
                strokeCap = StrokeCap.Round
                )

        }

    }
}