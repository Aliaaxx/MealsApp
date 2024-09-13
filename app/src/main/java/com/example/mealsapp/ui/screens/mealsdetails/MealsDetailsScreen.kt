/*
package com.example.mealsapp.ui.screens.mealsdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.domain.entity.meals.CategoryX

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MealsDetailsScreen(nav : NavController ?= null, category: CategoryX(), viewModel: MealsDetailsViewModel = hiltViewModel()){

    val category by viewModel.category.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxSize().padding(10.dp), verticalArrangement = Arrangement.spacedBy(5.dp), horizontalAlignment = Alignment.Start) {
        items(category.categories){
            ItemMeal(it)
        }
    }
}

@Composable
fun ItemMeal(category: CategoryX, modifier: Modifier = Modifier) {
    Card(
        modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp), shape = CircleShape, colors = CardDefaults.cardColors(Color.White), elevation = CardDefaults.cardElevation(5.dp)) {
        Row(modifier = modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {

            AsyncImage(model = category.strCategoryThumb, contentDescription = category.strCategory , contentScale = ContentScale.Crop , modifier = Modifier
                .size(50.dp)
                .clip(CircleShape))

            Text(text = category.strCategory ?: "")

        }

    }
}
*/

// Design only

package com.example.mealsapp.ui.screens.mealsdetails


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.domain.entity.meals.CategoryX

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MealsDetailsScreen(nav : NavController ?= null,category: CategoryX = CategoryX(),viewmodel: MealsDetailsViewModel = hiltViewModel()){


}