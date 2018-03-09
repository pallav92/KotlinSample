package com.example.yatraonlinev_pallavsrivastava.kotlinsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.model.Note
import kotlinx.android.synthetic.main.layout_note_item.view.*

class NotelistAdapter(val items: List<Note>, val listener: (Note) -> Unit) : RecyclerView.Adapter<NotelistAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_note_item, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position], listener)

    }

    override fun getItemCount(): Int {
         return items.size
    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bind(note: Note, listener: (Note) -> Unit) = with(itemView) {
            itemView.tv_header.setText(note.name)
            itemView.tv_note_preview.setText(note.message)
            itemView.iv_note_image.setImageDrawable(resources.getDrawable(R.drawable.ic_launcher_background))
            setOnClickListener { listener(note) }
        }

    }

}