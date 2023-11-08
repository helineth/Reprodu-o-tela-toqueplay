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
import androidx.compose.ui.unit.dp
import com.toquemedia.toqueplayplayer.R

@Composable
fun HeaderComponent(
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
                    .size(25.dp),
                painter = painterResource(id = R.drawable.lists_fill0_wght400_grad0_opsz24),
                contentDescription =null, colorFilter = ColorFilter.tint(color = Color.White)
            )
            Image(
                modifier = modifier
                    .size(25.dp),
                painter = painterResource(id = R.drawable.bedtime_fill0_wght400_grad0_opsz24),
                contentDescription =null,
                colorFilter = ColorFilter.tint(color = Color.White)
            )
            Image(
                modifier = modifier
                .size(25.dp),
                painter = painterResource(id = R.drawable.arrow_up_from_square),
                contentDescription =null,
                colorFilter = ColorFilter.tint(color = Color.White)
            )
             }
}