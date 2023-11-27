package com.vincesapplication.app.modules.gameone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.vincesapplication.app.R
import com.vincesapplication.app.appcomponents.base.BaseActivity
import com.vincesapplication.app.databinding.ActivityGameOneBinding
import com.vincesapplication.app.modules.gameone.`data`.viewmodel.GameOneVM
import kotlin.String
import kotlin.Unit

class GameOneActivity : BaseActivity<ActivityGameOneBinding>(R.layout.activity_game_one) {
  private val viewModel: GameOneVM by viewModels<GameOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gameOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GAME_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GameOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
