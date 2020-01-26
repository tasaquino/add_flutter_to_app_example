package com.tasaquino.existing_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_flutter_side.setOnClickListener { goToFlutterSide() }
    }

    private fun goToFlutterSide() {
        startActivity(FlutterActivity
                .withNewEngine()
                .initialRoute("/")
                .build(this))
    }
}
