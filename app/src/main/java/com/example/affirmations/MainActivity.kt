package com.example.affirmations

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Tips
import com.example.affirmations.ui.theme.AppTheme
import androidx.compose.material3.ExperimentalMaterial3Api

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun MyApp() {
    val tipsList = Datasource().loadTips()
    Scaffold(
        topBar = {
            TipsTopAppBar()
        },
        content = {
            TipList(
               tipsList = tipsList,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 62.dp) // Adjust the padding as needed
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TipsTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_title),
                style = MaterialTheme.typography.headlineSmall
            )
        },
        modifier = Modifier.statusBarsPadding()
    )
}

@Composable
fun TipList(tipsList: List<Tips>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(tipsList) { Tips ->
            TipCard(
                tip = Tips,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun TipCard(tip: Tips, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Text(
                text = LocalContext.current.getString(tip.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Image(
                painter = painterResource(tip.imageResourceId),
                contentDescription = stringResource(tip.stringResourceId),
                modifier = Modifier
                    .width(350.dp)
                    .height(220.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(tip.stringDescriptionResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview
@Composable
private fun TipCardPreview() {
    TipCard(Tips(R.string.day1, R.drawable.a1, R.string.description1))
}
