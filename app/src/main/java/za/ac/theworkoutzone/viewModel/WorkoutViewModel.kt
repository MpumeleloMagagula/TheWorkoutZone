package za.ac.theworkoutzone.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import za.ac.theworkoutzone.R
import za.ac.theworkoutzone.model.WorkoutData


class WorkoutViewModel(): ViewModel() {
    val workoutsList: MutableLiveData<List<WorkoutData>> by lazy {
        MutableLiveData<List<WorkoutData>>()
    }

    private var workoutList:ArrayList<WorkoutData>
    init {
          workoutList= ArrayList()
          getworkoutLists()

    }

    private fun getworkoutLists() {
        fetchList()
        workoutsList.value = workoutList
    }

    private fun fetchList() {
        workoutList.add(WorkoutData(R.drawable.absworkout,"ABS"))
        workoutList.add(WorkoutData(R.drawable.armworkout,"ARM"))
        workoutList.add(WorkoutData(R.drawable.butworkout,"BUT"))
        workoutList.add(WorkoutData(R.drawable.chestworkout,"CHEST"))
        workoutList.add(WorkoutData(R.drawable.flatstomachworkouts,"FLAT STOMACH"))
        workoutList.add(WorkoutData(R.drawable.legsworkout,"LEG"))
        workoutList.add(WorkoutData(R.drawable.weightlossworkout,"WEIGHT LOSS"))
    }
}