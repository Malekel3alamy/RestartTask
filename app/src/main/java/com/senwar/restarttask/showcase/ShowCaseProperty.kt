package com.senwar.spotlight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates

data class ShowCaseProperty(
    var index: Int,
    val coordinate: LayoutCoordinates,
    val title: String,
    val subTitle: String,
    val titleColor: Color = Color.White,
    val subTitleColor: Color = Color.White
)