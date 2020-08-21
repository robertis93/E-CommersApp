package space.robert.e_commersapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs


class MobileDetailsFragment : Fragment() {
    val args: MobileDetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        args.mobileId
        return inflater.inflate(R.layout.fragment_mobile_details, container, false)
    }

}