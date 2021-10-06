package com.gian.doggy.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gian.doggy.data.model.BreedResponse
import com.gian.doggy.databinding.DogItemBinding
import com.gian.doggy.ui.view.HomeActivity
import com.squareup.picasso.Picasso

class AllBreedsAdapter(var context:HomeActivity):
    RecyclerView.Adapter<AllBreedsAdapter.MyViewHolder>() {

    var listOfDogs = ArrayList<String>()

    private var mListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onitemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(DogItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Picasso.get().load(listOfDogs[position]).into(holder.binding.imageOfCharacter)
    }

    override fun getItemCount(): Int {
        return listOfDogs.size
    }


    inner class MyViewHolder(val binding: DogItemBinding):RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {

            }
        }
    }


}