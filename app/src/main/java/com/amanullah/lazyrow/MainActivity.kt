package com.amanullah.lazyrow

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amanullah.lazyrow.repository.PersonRepository
import com.amanullah.lazyrow.ui.theme.LazyRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRowTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val personRepository = PersonRepository()
                    val getAllData = personRepository.getAllData()

                    LazyRow(
                        contentPadding = PaddingValues(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        itemsIndexed(
                            items = getAllData,
                            key = { index, person ->
                                person.id
                            }
                        ){
                                index, person ->
                            Log.d("MainActivity", index.toString())
                            CustomItem(person = person)
                        }
                    }
                }
            }
        }
    }
}