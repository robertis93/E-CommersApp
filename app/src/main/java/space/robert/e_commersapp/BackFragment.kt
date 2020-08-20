    package space.robert.e_commersapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import kotlinx.android.synthetic.main.fragment_back.*
import kotlinx.android.synthetic.main.fragment_front.*


class BackFragment : Fragment(R.layout.fragment_back) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.fragment_back, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_back.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

        val molileList = listOf(
            Mobile("Apple iPod touch 5 32Gb", 8888, 5),
            Mobile("Samsung Galaxy S Duos S7562", 7230, 2),
            Mobile("Canon EOS 600D Kit", 15659, 4),
            Mobile("Samsung Galaxy Tab 2 10.1 P5100 16Gb", 13290, 9)

        )
        val adapter = BackAdapter(molileList)
        recycler_back.adapter = adapter

    }



}








