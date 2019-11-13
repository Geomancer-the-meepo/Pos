package wla.googoodolls.specialcalculator

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.View
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import wla.googoodolls.specialcalculator.fragments.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btHoteList -> {
                didTapButton(btHoteList)
                loadFragment(HoteListFragment())
            }
            R.id.btHtwetList -> {
                didTapButton(btHtwetList)
                loadFragment(HtwetListFragment())
            }
            R.id.btPoutList -> {
                didTapButton(btPoutList)
                loadFragment(PoutListFragment())
            }
            R.id.btTotalList -> {
                didTapButton(btTotalList)
                loadFragment(TotalFragment())
            }
            R.id.btHtoemal -> {
                didTapButton(btHtoemal)
                loadFragment(HtoemalFragment())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btHoteList.setOnClickListener(this)
        btHtwetList.setOnClickListener(this)
        btPoutList.setOnClickListener(this)
        btTotalList.setOnClickListener(this)
        btHtoemal.setOnClickListener(this)

    }


    fun didTapButton(view: View) {
        val myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce)
        // Use bounce interpolator with amplitude 0.2 and frequency 20
        val interpolator = MyBounceInterpolator(0.2, 20.0)
        myAnim.interpolator = interpolator

        view.startAnimation(myAnim)
        vibrate()
    }

    private fun vibrate() {
        val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            v.vibrate(25)
        }
    }
    private fun loadFragment(f:Fragment){
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(R.anim.slide_up,R.anim.slide_down)
            .add(R.id.container,f)
            .addToBackStack(null)
            .commit()
    }
}
