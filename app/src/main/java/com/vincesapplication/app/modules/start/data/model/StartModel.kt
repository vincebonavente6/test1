package com.vincesapplication.app.modules.start.`data`.model

import com.vincesapplication.app.R
import com.vincesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSAMPLERPG: String? = MyApp.getInstance().resources.getString(R.string.lbl_sample_rpg)

)
