package za.ac.theworkoutzone.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import za.ac.theworkoutzone.R
import za.ac.theworkoutzone.model.ExerciseData

class ARMViewModel (): ViewModel() {

    val ARMsList: MutableLiveData<List<ExerciseData>> by lazy {
        MutableLiveData<List<ExerciseData>>()
    }

    private var ARMList:ArrayList<ExerciseData>
    init {
        ARMList= ArrayList()
        getARMLists()

    }

    private fun getARMLists() {
        fetchList()
        ARMsList.value = ARMList
    }

    private fun fetchList()
    {
        ARMList.add(ExerciseData(R.drawable.absworkout,"ABS"))
        ARMList.add(ExerciseData(R.drawable.armworkout,"ARM"))
        ARMList.add(ExerciseData(R.drawable.butworkout,"BUT"))
        ARMList.add(ExerciseData(R.drawable.chestworkout,"CHEST"))
        ARMList.add(ExerciseData(R.drawable.flatstomachworkouts,"FLAT STOMACH"))
        ARMList.add(ExerciseData(R.drawable.legsworkout,"LEG"))
        ARMList.add(ExerciseData(R.drawable.weightlossworkout,"WEIGHT LOSS"))
    }
}