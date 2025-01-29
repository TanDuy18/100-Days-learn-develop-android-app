package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    GreetingImage(
//                        message = "Happy Birthday Sam!",
//                        form = "From Emma"
//                    )
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        form = stringResource(R.string.signature_text)
                    )
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, form: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Transparent,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(), // Bao phủ toàn bộ màn hình
            contentAlignment = Alignment.Center // Đặt nội dung ở giữa
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(0.95f)
            ) {
                Text(
                    text = name, // "Happy Birthday"
                    fontSize = 95.sp,
                    lineHeight = 110.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = form, // "From Emma"
                    fontSize = 36.sp,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )
            }
        }
    }
}


@Composable
fun GreetingImage (message: String, form: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
   Box(modifier = modifier.fillMaxSize() ,
       ) {
       Image(
           painter = image ,
           modifier = Modifier.fillMaxSize(), // Image chiếm toàn bộ không gian Box
           contentScale = ContentScale.Crop,
           contentDescription = null,
           alpha = 0.5F
       )
       Greeting(
           name = message ,
           form = form,
           modifier = Modifier
               .fillMaxSize()
               .padding(8.dp)
       )
   }
}
@Preview(showBackground = true)
@Composable
fun PreviewBirthdayCard() {
    MyApplicationTheme {
        GreetingImage(
            message = "Happy Birthday Sam!",
            form = "From Emma"
        )
    }
}
/*
* Bài học về font size
*
* Trong UI elements in android apps use two different units of measurement : density-independent (dp)
*
*
*
* */