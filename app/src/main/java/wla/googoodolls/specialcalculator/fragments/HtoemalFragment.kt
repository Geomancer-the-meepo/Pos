package wla.googoodolls.specialcalculator.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_htoemal.*
import wla.googoodolls.specialcalculator.R

/**
 * A simple [Fragment] subclass.
 */
class HtoemalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_htoemal, container, false)
    }


}
