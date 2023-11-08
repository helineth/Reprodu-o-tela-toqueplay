package com.toquemedia.toqueplayplayer.ui.screens



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LinearProgressIndicator(
    modifier: Modifier,
    color: SliderColors,
    init: String,
    finished: String
) {
Row ( modifier = modifier
    .fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically
){
    Text(
        text = init,
        color = Color.White,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
    )

    Slider(value = 0.1F, onValueChange = {},
        modifier = modifier
            .size(250.dp, 22.dp),
        colors = color



    )
    Text(
        text = finished,
        color = Color.White,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,

    )
}

}

@Preview
@Composable
fun LineraProgressPreview() {
    val customSliderColors = SliderDefaults.colors(
        activeTrackColor = Color.Red,
        thumbColor = Color.Red,
    )
    LinearProgressIndicator(modifier = Modifier, customSliderColors,"00:03", "03:00")
    
}
