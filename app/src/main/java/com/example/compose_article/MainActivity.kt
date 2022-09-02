package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Compose_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_articleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FirstImage()
                }
            }
        }
    }
}
@Composable
fun FollowUpText(){

    Column{
        Text(
            text= stringResource(id = R.string.title),
            fontSize=24.sp,
            modifier=Modifier
                .padding(start=16.dp,end=16.dp,bottom=16.dp,top=16.dp)
        )
        Text(
            text= stringResource(id = R.string.second_text),
            textAlign = TextAlign.Justify,
            fontSize=24.sp,
            modifier=Modifier
                .padding(start=16.dp,end=16.dp,bottom=16.dp,top=16.dp)
        )
        Text(
            text= stringResource(id = R.string.third_text),
            textAlign = TextAlign.Justify,
            fontSize=24.sp,
            modifier=Modifier
                .padding(start=16.dp,end=16.dp,bottom=16.dp,top=16.dp)
        )
    }
}
@Composable
fun FirstImage() {
    val image= painterResource(id=R.drawable.bg_compose_article)
    Column {
        Image(
            painter =image,
            contentDescription =null,
            modifier = Modifier
                .fillMaxWidth()
        )
        FollowUpText()
    }
}
