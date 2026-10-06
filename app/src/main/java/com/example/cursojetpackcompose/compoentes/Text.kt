package com.example.cursojetpackcompose.compoentes






import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.cursojetpackcompose.R


@Preview
@Composable
fun Preview(){
    SimpleText()
}

@Composable
fun SimpleText(){
    Text(text= stringResource(id = R.string.hello_world),
        color = Color.White,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold
        )
}
