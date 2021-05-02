package za.ac.theworkoutzone.userinterface


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import za.ac.theworkoutzone.model.ExerciseData

@Composable
fun ExerciseCard(
    exerciseData: ExerciseData, onClick:()->Unit
)  {
    Card(
        modifier = Modifier
            .padding
                (
                bottom = 9.dp,
                top = 9.dp,
                start = 5.dp,
                end = 5.dp
            )
            .fillMaxWidth()
            .clickable(onClick = onClick),

        shape = RoundedCornerShape(19.dp),
        elevation = 16.dp
    )
    {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(MaterialTheme.colors.surface)
        )
        {
            Surface(
                modifier = Modifier
                    .size(130.dp),
                shape = RoundedCornerShape(16.dp),
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
            )
            {
                Image(
                    painter = painterResource(
                        id = exerciseData.exerciseImg),
                    contentDescription = null,
                    modifier = Modifier
                        .height(120.dp)
                        .clip(shape = RoundedCornerShape(15.dp)),
                    contentScale = ContentScale.Crop
                )

            }
            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
                    .align(Alignment.CenterVertically)

            )
            {
                Text(
                    text= exerciseData.exerciseName,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 22.sp),
                    color = Color.Red

                )
                /**
                CompositionLocalProvider(
                LocalContentAlpha provides ContentAlpha.medium)
                {
                Text(text = workoutData)
                }
                 **/
            }

        }

    }

}