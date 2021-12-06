package com.amanullah.lazyrow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amanullah.lazyrow.model.Person

@Composable
fun CustomItem(person: Person)
{
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(12.dp),
    ) {
        Text(
            text = "${person.age}",
            color = Color.White,
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${person.firstName}",
            color = Color.Black,
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = "${person.lastName}",
            color = Color.Blue,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Thin
        )
    }
}