package com.toquemedia.toqueplayplayer.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.toquemedia.toqueplayplayer.R
import com.toquemedia.toqueplayplayer.ui.theme.BlackColor
import com.toquemedia.toqueplayplayer.ui.theme.RedColor

@Composable
fun Home() {
    val customSliderColors = SliderDefaults.colors(
        activeTrackColor = Color.Red,
        thumbColor = Color.Red,
    )

    Surface(
        color = Color.Transparent,
        modifier = Modifier
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        RedColor,
                        BlackColor
                    )
                )
            )

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
horizontalAlignment = Alignment.CenterHorizontally
            ) {
Spacer(modifier = Modifier.height(16.dp))
            HeaderPlayer(
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                "A REPRODUZR DA PLAYLIST",
                "Músicas de que gostaste"
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.buloco),
                contentDescription ="imagem da capa",
                contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(350.dp)
                .clip(RoundedCornerShape(10.dp))
            )
            Spacer(modifier = Modifier.height(10.dp))
        SongTitleAndArtist(modifier = Modifier
            .padding(horizontal = 16.dp),
            artist = "Killa Hill, Anderson Mario",
            songTitle = "Buloco" )

            Spacer(modifier = Modifier.height(80.dp))

            LinearProgressIndicator(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
               color =   customSliderColors,
                init = "00:03",
                finished = "03:00"

            )
            Spacer(modifier = Modifier.height(80.dp))
            PlayerComponent(
                modifier = Modifier
                .padding(horizontal = 16.dp),
            )
            Spacer(modifier = Modifier.height(110.dp))
            HeaderComponent(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
    }

}


@Preview
@Composable
fun HomePreview(){
    Home()
}
