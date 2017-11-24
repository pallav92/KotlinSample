package com.example.yatraonlinev_pallavsrivastava.kotlinsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.model.Note

/**
 * Created by YATRAONLINE\v-pallav.srivastava on 23/11/17.
 */
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
        @BindView(R.id.tv_header)
        lateinit var tvHeader: TextView

        @BindView(R.id.tv_note_preview)
        lateinit var tvNotePreview: TextView

        fun bind(note: Note, listener: (Note) -> Unit) = with(itemView) {
            tvHeader.setText(note.name)
            tvNotePreview.setText(note.message)

            setOnClickListener { listener(note) }
        }

    }

}