package za.ac.theworkoutzone.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import za.ac.theworkoutzone.R
import za.ac.theworkoutzone.model.ExerciseData

class ABSViewModel (): ViewModel()
{
    val ABSsList: MutableLiveData<List<ExerciseData>> by lazy {
        MutableLiveData<List<ExerciseData>>()
    }

    private var ABSList:ArrayList<ExerciseData>
    init {
        ABSList= ArrayList()
        getABSLists()

    }

    private fun getABSLists() {
        fetchList()
        ABSsList.value = ABSList
    }

    private fun fetchList()
    {
        ABSList.add(ExerciseData(R.drawable.plank,"Plank"))
        ABSList.add(ExerciseData(R.drawable.plank,"Mountain climber"))
        ABSList.add(ExerciseData(R.drawable.plank,"Reverse crunch"))
        ABSList.add(ExerciseData(R.drawable.plank,"Dead bug"))
        ABSList.add(ExerciseData(R.drawable.plank,"Leg raise"))
        ABSList.add(ExerciseData(R.drawable.plank,"Abs roll-out"))
        ABSList.add(ExerciseData(R.drawable.plank,"Bird-dog"))
        ABSList.add(ExerciseData(R.drawable.plank,"Hanging knee raise"))
        ABSList.add(ExerciseData(R.drawable.plank,"Dumbbell woodchop"))
        ABSList.add(ExerciseData(R.drawable.plank,"Medicine ball crunch"))
        ABSList.add(ExerciseData(R.drawable.plank,"Walking plank"))
        ABSList.add(ExerciseData(R.drawable.plank,"Bicycle Crunch"))
        ABSList.add(ExerciseData(R.drawable.plank,"L-sit"))
    }
}