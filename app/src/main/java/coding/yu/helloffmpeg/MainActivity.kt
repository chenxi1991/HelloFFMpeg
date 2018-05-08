package coding.yu.helloffmpeg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kwange.libffmpeg.FfmpegUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample_text.text = FfmpegUtils.getDecoder().toString()
    }


}
