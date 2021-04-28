package za.ac.theworkoutzone

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import za.ac.theworkoutzone.model.WorkoutData
import za.ac.theworkoutzone.ui.theme.TheWorkoutZoneTheme
import za.ac.theworkoutzone.userinterface.WorkoutCard
import za.ac.theworkoutzone.viewModel.WorkoutViewModel

class MainActivity : ComponentActivity() {

    private val workoutViewModel: WorkoutViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheWorkoutZoneTheme{
                val workoutLists = workoutViewModel.workoutsList.value
                SetWorkoutList(workoutList = workoutLists!!, c = this )
            }
        }
    }
}
@Composable
fun SetWorkoutList(workoutList: List<WorkoutData>, c:Context){
LazyColumn{
    itemsIndexed(items = workoutList)
    {
        index, itemWorkout ->
        WorkoutCard(workoutData = itemWorkout, onClick = {
            Toast.makeText(c,itemWorkout.workOutName,Toast.LENGTH_SHORT).show()
        })


    }
}
}

@Preview
@Composable
fun SetWorkoutView() {

}