package net.iessochoa.sergiocontreras.t03ej2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import net.iessochoa.sergiocontreras.t03ej2.ui.theme.T03ej2Theme

@Composable
fun BirthdayApp(modifier: Modifier = Modifier) {
    T03ej2Theme {
        Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
            GreetingText(
                message = "Happy Birthday",
                from = "from Sergio",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = message, fontSize = 100.sp, lineHeight = 116.sp)
        Text(text = from, fontSize = 36.sp)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayAppPreview() {
    BirthdayApp()
}