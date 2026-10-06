package com.example.cursojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursojetpackcompose.ui.theme.CursoJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardMenssagem()
        }
    }

    @Composable
    fun TextCustomizado(texto: String) {
        Text(text = texto, color = Color.White)

    }

    @Composable
    fun Inicial() {
        Column(modifier = Modifier.background(color = Color.Blue)) {
            TextCustomizado(texto = "Primeira Função Composable")
            Row {
                TextCustomizado(texto = "Seja bem Vindo")
                TextCustomizado(texto = "Olá Usuário")
            }

        }

    }

    @Preview
    @Composable
    fun Preview() {
        TestButtom()
    }

    @Composable
    fun NotificationBage() {

        Box(modifier = Modifier.padding(16.dp), contentAlignment = Alignment.Center) {

            Box(modifier = Modifier
                .size(24.dp)
                .clip(CircleShape)
                .background(color = Color.Green)
            )
            Box(modifier = Modifier.size(8.dp)
                .clip(CircleShape)
                .background(Color.Red)
                .align(Alignment.TopEnd))
        }
    }
}

@Composable
fun CardMenssagem(){
    Row (modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Estátua de Liberdade" ,
            modifier = Modifier.size(40.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(text = "Autor da Menssagem")
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Conteúdo da Menssagem")

        }
    }
}

@Composable
fun TesteModifier(){
    Column{
        Text(text = "Item 1",
            modifier = Modifier
                .border(border = BorderStroke(width = 1.dp, color = Color.Green))
                .padding(horizontal = 8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Item 1",
            modifier = Modifier
                .border(border = BorderStroke(width = 1.dp, color = Color.Green))
                .padding(horizontal = 8.dp, vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Item 1",
            modifier = Modifier
                .border(border = BorderStroke(width = 1.dp, color = Color.Green))
                .padding(8.dp)
        )
    }
}

@Composable
fun TestButtom(){
    Button(onClick = { /*TODO*/ }, modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        colors = ButtonDefaults.buttonColors( containerColor = Color.Green),
        shape = RoundedCornerShape(10.dp)
    ){
        Text(text= "Confirmar")
    }
}

