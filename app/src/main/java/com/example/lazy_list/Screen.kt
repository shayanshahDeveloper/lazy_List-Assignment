package com.example.lazy_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500)
@Composable
fun preview(){
LazyColumn(content ={
items(employeeList()){ item ->
    block(img = item.img, title = item.title, subtitle =item.subtitle  )
}

} )
   
}
@Composable
fun block(img : Int ,title : String ,subtitle : String){
Card ( modifier = Modifier

    .padding(8.dp)
    .fillMaxWidth()
    .clip(CircleShape) )
{
Row (verticalAlignment = Alignment.CenterVertically,
modifier = Modifier.padding(8.dp)
) {
Image(painter = painterResource(id = img) ,
    contentDescription = "",
    modifier = Modifier
        .size(70.dp)
        .padding(8.dp)
        .weight(.2f)
        .clip(CircleShape)
    )
    itemDescription(title, subtitle, Modifier.weight(.8f))
}
}
}

@Composable
private fun itemDescription(title: String, subtitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Thin
        )
    }
}


data class employee(val img : Int , val title : String , val subtitle : String)

fun employeeList (): MutableList<employee> {
val list = mutableListOf<employee>()
list.add(employee(R.drawable.images , "Nooh" , "Developer"))
    list.add(employee(R.drawable.images , "Asad" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ahmad" , "Back End Developer"))
    list.add(employee(R.drawable.image_3 , "Jawad" , "Front Developer"))
    list.add(employee(R.drawable.images , "Izhan" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ali" , "App Developer"))
    list.add(employee(R.drawable.images , "Nooh" , "Developer"))
    list.add(employee(R.drawable.images , "Asad" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ahmad" , "Back End Developer"))
    list.add(employee(R.drawable.image_3 , "Jawad" , "Front Developer"))
    list.add(employee(R.drawable.images , "Izhan" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ali" , "App Developer"))
    list.add(employee(R.drawable.images , "Nooh" , "Developer"))
    list.add(employee(R.drawable.images , "Asad" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ahmad" , "Back End Developer"))
    list.add(employee(R.drawable.image_3 , "Jawad" , "Front Developer"))
    list.add(employee(R.drawable.images , "Izhan" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ali" , "App Developer"))
    list.add(employee(R.drawable.images , "Nooh" , "Developer"))
    list.add(employee(R.drawable.images , "Asad" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ahmad" , "Back End Developer"))
    list.add(employee(R.drawable.image_3 , "Jawad" , "Front Developer"))
    list.add(employee(R.drawable.images , "Izhan" , "App Developer"))
    list.add(employee(R.drawable.image_2 , "Ali" , "App Developer"))
return list
}


/*
Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
    employeeList().map {item ->
        block(img = item.img, title = item.title , subtitle = item.subtitle )
    }
}
 */