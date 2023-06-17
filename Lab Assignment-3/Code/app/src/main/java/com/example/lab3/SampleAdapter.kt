package com.example.lab3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.databinding.ItemRowBinding
class SampleAdapter (val items : MutableList<SampleModel>)
    : RecyclerView.Adapter<SampleAdapter.ViewHolder>(){
    private lateinit var binding: ItemRowBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleAdapter.ViewHolder {
        val inflater =LayoutInflater.from(parent.context)
        binding=ItemRowBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: SampleAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }
    override fun getItemCount() = items.size
    inner class ViewHolder(itemView : ItemRowBinding) : RecyclerView.ViewHolder(itemView.root){
        fun bind(item : SampleModel){
            binding.apply {
                tvId.text=item.title.toString()
                tvName.text=item.body
            }
        }
    }
}

/*Code Reference:
[1] https://medium.com/@ezatpanah/recyclerview-in-android-with-example-in-depth-guide-94462a6b573b
[2] https://www.geeksforgeeks.org/how-to-use-view-binding-in-recyclerview-adapter-class-in-android/
*/
