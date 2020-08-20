package space.robert.e_commersapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.mobile_item.view.*

class BackAdapter(val mobileList: List<Mobile>) :
    RecyclerView.Adapter<BackAdapter.MobileViewHolder>() {
    private var items = listOf<Mobile>()

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): BackAdapter.MobileViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_back, parent, false)
        return MobileViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mobileList.size
    }

    override fun onBindViewHolder(holder: MobileViewHolder, position: Int) {
        holder.bindItems(mobileList[position])
    }


    class MobileViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems(mobile: Mobile) {
            val textViewName = itemView.findViewById(R.id.nameViewBack) as TextView
            val textViewCount = itemView.findViewById(R.id.countViewBack) as TextView
            textViewName.text = mobile.name
            textViewCount.text = mobile.count.toString()
        }

    }
}





