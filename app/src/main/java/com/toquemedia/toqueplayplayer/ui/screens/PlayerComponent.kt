package com.toquemedia.toqueplayplayer.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.toquemedia.toqueplayplayer.R

@Composable
fun PlayerComponent(
    modifier: Modifier
    
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = modifier
                .size(18.dp),
            painter = painterResource(id = R.drawable.refresh_square_svgrepo_com),
            contentDescription =null,
            colorFilter = ColorFilter.tint(color = Color.White)
        )
        Image(
            modifier = modifier
                .size(22.dp),
            painter = painterResource(id = R.drawable.step_backward),
            contentDescription =null,
            colorFilter = ColorFilter.tint(color = Color.White)
        )
        Image(
            modifier = modifier
                .size(28.dp),
            painter = painterResource(id = R.drawable.caret_circle_right),
            contentDescription =null,
            colorFilter = ColorFilter.tint(color = Color.White)
        )
        Image(
            modifier = modifier
                .size(22.dp),
            painter = painterResource(id = R.drawable.step_forward),
            contentDescription =null,
            colorFilter = ColorFilter.tint(color = Color.White)
        )
        Image(
            modifier = modifier
                .size(18.dp),
            painter = painterResource(id = R.drawable.shuffle),
            contentDescription =null,
            colorFilter = ColorFilter.tint(color = Color.Gray)
        )
    }
    
}

@Preview
@Composable
fun PlayerComponentePreview() {
    PlayerComponent(modifier = Modifier)
}