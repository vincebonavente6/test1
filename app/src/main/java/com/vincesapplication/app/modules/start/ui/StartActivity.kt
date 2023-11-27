package com.vincesapplication.app.modules.start.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.vincesapplication.app.R
import com.vincesapplication.app.appcomponents.base.BaseActivity
import com.vincesapplication.app.databinding.ActivityStartBinding
import com.vincesapplication.app.modules.gameone.ui.GameOneActivity
import com.vincesapplication.app.modules.start.`data`.viewmodel.StartVM
import kotlin.String
import kotlin.Unit

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
  private val viewModel: StartVM by viewModels<StartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = GameOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnPlay.setOnClickListener {
        val destIntent = GameOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "START_ACTIVITY"

    }
  }
