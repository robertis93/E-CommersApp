package space.robert.e_commersapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.SnapHelper
import kotlinx.android.synthetic.main.fragment_back.*
import kotlinx.android.synthetic.main.fragment_front.*


class BackFragment : Fragment(R.layout.fragment_back), BackAdapter.Listener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_back, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_back.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        val mobilesList = ECommerseApp.repository.mobiles
        mobilesList.observe(viewLifecycleOwner, Observer {
            val adapter = BackAdapter(it, this)
            recycler_back.adapter = adapter
        })

        add_item_mobile.setOnClickListener{
            val action = BackFragmentDirections.actionBackFragmentToMobileDetailsFragment(null)
            findNavController().navigate(action)
        }
    }

    override fun onItemClick(mobile: Mobile) {
        Toast.makeText(context, "${mobile.name}", Toast.LENGTH_SHORT).show()
        val action = BackFragmentDirections.actionBackFragmentToMobileDetailsFragment(mobile.id)
        findNavController().navigate(action)
    }


}








