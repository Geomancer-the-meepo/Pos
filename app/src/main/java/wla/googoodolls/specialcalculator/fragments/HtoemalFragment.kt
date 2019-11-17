package wla.googoodolls.specialcalculator.fragments


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginTop
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_htoemal.*
import kotlinx.android.synthetic.main.fragment_htoemal.ibtAdd
import wla.googoodolls.specialcalculator.R

/**
 * A simple [Fragment] subclass.
 */
class HtoemalFragment : Fragment() {
    var marginTop  = 90
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_htoemal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ibtAdd.setOnClickListener { newLayout() }
    }
    private fun newLayout(){
        val layoutPara = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT)
        val li = LinearLayout(activity)

        li.orientation = LinearLayout.HORIZONTAL
        val layoutParaEdit = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT,2f)
        val et  = EditText(activity)
        et.setPadding(10,0,0,0)
        et.setHint("အကွက်")

        val et2  = EditText(activity)
        et2.setPadding(10,0,0,0)
        et2.setHint("အကွက်")

        li.addView(et,layoutParaEdit)
        li.addView(et2,layoutParaEdit)
        con.addView(li,layoutPara)
    }

}
