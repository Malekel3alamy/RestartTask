package com.senwar.restarttask.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senwar.restarttask.R
import com.senwar.restarttask.ui.theme.fontFamily





@Composable
fun ButtonFilter(modifier: Modifier){


    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.green50)),
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
                color = colorResource(id = R.color.green90),
                modifier = Modifier,
                fontFamily = fontFamily

            )
            Icon(
                painter = painterResource(id = R.drawable.filter2),
                contentDescription = "",
                tint = colorResource(id = R.color.green90),
                modifier = Modifier
                    .padding(start = 5.dp),

                )
        }
    }
}



