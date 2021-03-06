package com.example.firestoresmartchatmvvm.mvvm.activities.lobby

import android.os.Bundle
import com.example.firestoresmartchatmvvm.R
import com.example.firestoresmartchatmvvm.util.ActivityUtils
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class LobbyActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var lobbyFragment: LobbyFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        var fragment = supportFragmentManager.findFragmentById(R.id.contentFrame)

        if (fragment == null) {
            fragment = lobbyFragment
            ActivityUtils.addFragmentToActivity(
                supportFragmentManager,
                fragment,
                R.id.contentFrame
            )
        }
    }

}
