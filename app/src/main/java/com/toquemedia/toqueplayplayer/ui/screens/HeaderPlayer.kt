package com.toquemedia.toqueplayplayer.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun HeaderPlayer(
    modifier: Modifier,
    title: String,
    subTitle: String
) {
    Row (
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(imageVector = Icons.Rounded.KeyboardArrowDown,
            contentDescription ="Key board down",
            colorFilter = ColorFilter.tint(color = Color.White)
            )
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = title.uppercase(),
                textAlign = TextAlign.Center,
                color = Color.White,


            )
            Text(
                text = subTitle,
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }

        Image(imageVector = Icons.Rounded.MoreVert,
            contentDescription ="Key board down",
            colorFilter = ColorFilter.tint(color = Color.White)
            )
    }

}

@Preview
@Composable
fun HeaderPlayerPreview() {
    HeaderPlayer(modifier = Modifier,"A REPRODUZR DA PLAYLIST", "Músicas de que gostaste" )
}