package com.toquemedia.toqueplayplayer.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.sp

@Composable
fun SongTitleAndArtist(
    modifier: Modifier,
    artist: String,
    songTitle: String
) {
   Row(
       modifier = modifier
           .fillMaxWidth(),
       horizontalArrangement = Arrangement.SpaceBetween,

   ) {

       Column {
           Text(text = songTitle,
               color = Color.White,
               fontWeight = FontWeight.Bold,
               fontSize = 18.sp,
               )
           Text(
               text = artist,
               color = Color.White,
               fontWeight = FontWeight.Bold,
               fontSize = 18.sp,
               )
       }

       Image(imageVector = Icons.Rounded.Favorite,
           contentDescription ="Like" ,
           colorFilter = ColorFilter.tint(color = Color.Red)

       )

   }
}

@Preview
@Composable
fun SongTitleAndArtistPreview() {
    SongTitleAndArtist(modifier = Modifier, "Killa Hiil, Anderson Mario", "Buloco")
}