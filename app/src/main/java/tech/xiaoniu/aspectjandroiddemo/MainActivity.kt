package tech.xiaoniu.aspectjandroiddemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tech.xiaoniu.aspect.DebugLog

class MainActivity : AppCompatActivity() {
    private val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    @DebugLog
    fun initView() {
    }
}