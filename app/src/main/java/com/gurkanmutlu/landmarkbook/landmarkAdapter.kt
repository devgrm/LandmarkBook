package com.gurkanmutlu.landmarkbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gurkanmutlu.landmarkbook.databinding.RecyclerRowBinding

class landmarkAdapter(val landmarkList : ArrayList<Landmark>): RecyclerView.Adapter<landmarkAdapter.landmarkHolder>() {

    class landmarkHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) { // görüntüleri bağlamak için


    }

    // bağlanacak olan view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): landmarkHolder {
        val binding = RecyclerRowBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
        return landmarkHolder(binding)
    }

    // bağlandıktan sonra ne olacak
    override fun onBindViewHolder(holder: landmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name


    }


    // kaç tane item var
    override fun getItemCount(): Int {
        return landmarkList.size
    }
}