    package space.robert.e_commersapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import kotlinx.android.synthetic.main.fragment_front.*


    class FrontFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.fragment_front, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        SwipeRefreshLayout.setRefreshing(false);
       // recycler.layoutManager = LinearLayoutManager(context)
        recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        val snamHelper:SnapHelper =LinearSnapHelper()
        snamHelper.attachToRecyclerView(recycler)
        val mobilesList = ECommerseApp.repository.mobiles
        mobilesList.observe(viewLifecycleOwner, Observer{
            val adapter = Adapter(it)
            recycler.adapter = adapter
        })
//        val molileList = listOf(
//            Mobile("Apple iPod touch 5 32Gb", 8888, 5),
//            Mobile("Samsung Galaxy S Duos S7562", 7230, 2),
//            Mobile("Canon EOS 600D Kit", 15659, 4),
//            Mobile("Samsung Galaxy Tab 2 10.1 P5100 16Gb", 13290, 9)
//
//        )


    }



    }




