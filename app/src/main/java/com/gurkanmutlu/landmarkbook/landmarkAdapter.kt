package com.gurkanmutlu.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gurkanmutlu.landmarkbook.databinding.RecyclerRowBinding

class landmarkAdapter(val landmarkList : ArrayList<Landmark>): RecyclerView.Adapter<landmarkAdapter.landmarkHolder>() {

    class landmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) { // görüntüleri bağlamak için

    }

    // bağlanacak olan view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): landmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return landmarkHolder(binding)
    }

    // bağlandıktan sonra ne olacak
    override fun onBindViewHolder(holder: landmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name


        holder.itemView.setOnClickListener { // her bir iteme tıklandığında ne olacak
            val intent = Intent(holder.itemView.context,detailsActivity::class.java) // hangi activityden hangi activitye gideceğini belirtiyoruz
            intent.putExtra("landmark",landmarkList.get(position)) // hangi landmarkı göndereceğimizi belirtiyoruz
            holder.itemView.context.startActivity(intent) // activityi başlatıyoruz


        }


    }

    // kaç tane item var
    override fun getItemCount(): Int {
        return landmarkList.size
    }
}