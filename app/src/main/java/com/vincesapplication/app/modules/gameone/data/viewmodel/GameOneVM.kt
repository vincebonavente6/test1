package com.vincesapplication.app.modules.gameone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vincesapplication.app.modules.gameone.`data`.model.GameOneModel
import org.koin.core.KoinComponent

class GameOneVM : ViewModel(), KoinComponent {
  val gameOneModel: MutableLiveData<GameOneModel> = MutableLiveData(GameOneModel())

  var navArguments: Bundle? = null
}
