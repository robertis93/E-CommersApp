package space.robert.e_commersapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_mobile_details.*
import java.lang.Exception


class MobileDetailsFragment : Fragment() {

    val args: MobileDetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_mobile_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mobilesList = ECommerseApp.repository.mobiles
        if (args.mobileId == null) {
            mobileName.text.clear()
            priceMobile.text.clear()
            enterNumber.text.clear()
        } else {
             val mobile =
                mobilesList.value?.find { it.id == args.mobileId }
            if (mobile == null) {
                throw Exception("Не найдет id")
            } else {

                mobileName.setText(mobile.name)
                priceMobile.setText(mobile.price.toString())
                enterNumber.setText(mobile.count.toString())
            }
        }

        saveMobile.setOnClickListener {
            if (args.mobileId == null) {
                val mobile = Mobile(
                    mobileName.text.toString(),
                    priceMobile.text.toString().toInt(),
                    enterNumber.text.toString().toInt()
                )
                ECommerseApp.repository.insertMobile(mobile)
            } else {
                val editedMobile = Mobile(
                    mobileName.text.toString(),
                    priceMobile.text.toString().toInt(),
                    enterNumber.text.toString().toInt(),
                    args.mobileId!!
                )
            }
            }

        canselMobile.setOnClickListener{
            val actionToBack = MobileDetailsFragmentDirections.actionMobileDetailsFragmentToBackFragment(
                null.toString()
            )
            findNavController().navigate(actionToBack)
        }
        }
        }
