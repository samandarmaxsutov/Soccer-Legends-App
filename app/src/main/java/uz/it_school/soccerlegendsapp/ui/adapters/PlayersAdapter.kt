package uz.it_school.soccerlegendsapp.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.it_school.soccerlegendsapp.R
import uz.it_school.soccerlegendsapp.model.room.entities.SoccerPlayersData


class PlayersAdapter: RecyclerView.Adapter<PlayersAdapter.Holder>() {
    private val data: MutableList<SoccerPlayersData> = ArrayList()
    private var onClickListener:((SoccerPlayersData)->Unit)? = null
    @SuppressLint("NotifyDataSetChanged")
    fun submitItems(newItems: List<SoccerPlayersData>) {
        data.clear()
        data.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_player, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun onClick(l:(SoccerPlayersData)->Unit) {
        onClickListener=l
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name = itemView.findViewById<TextView>(R.id.country_name)
        private val capital = itemView.findViewById<TextView>(R.id.country_capital)
        private val image = itemView.findViewById<ImageView>(R.id.image_item)
        private val imageBtn = itemView.findViewById<ImageView>(R.id.btn_right)
        fun bind(postion: Int) {
            val item: SoccerPlayersData = data[postion]
            name.text = item.name
            capital.text = item.surname
            image.setImageResource(item.image)
        }

        init {
            imageBtn.setOnClickListener {
                onClickListener?.invoke(
                    data[adapterPosition]
                )
            }
            itemView.setOnClickListener {
                onClickListener?.invoke(
                    data[adapterPosition]
                )
            }
        }
    }
}
