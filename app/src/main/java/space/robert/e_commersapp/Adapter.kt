package space.robert.e_commersapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.mobile_item.view.*

class Adapter(val mobileList: List<Mobile>) : RecyclerView.Adapter<Adapter.MobileViewHolder>() {
    private var items = listOf<Mobile>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MobileViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mobile_item, parent, false)
        return MobileViewHolder(view)
    }

    override fun getItemCount() :Int {
        return mobileList.size
    }

    override fun onBindViewHolder(holder: MobileViewHolder, position: Int) {
        holder.bindItems(mobileList[position])
    }



    class MobileViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindItems(mobile: Mobile) {
            val textViewName = itemView.findViewById(R.id.nameView) as TextView
            val textViewPrice  = itemView.findViewById(R.id.priceView) as TextView
            val textViewCount  = itemView.findViewById(R.id.countView) as TextView
            textViewName.text = mobile.name
            textViewPrice.text = mobile.price.toString()
            textViewCount.text = mobile.count.toString()
        }

    }
}





