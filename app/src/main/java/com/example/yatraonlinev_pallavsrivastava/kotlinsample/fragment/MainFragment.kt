package com.example.yatraonlinev_pallavsrivastava.kotlinsample.fragment

import android.os.Bundle
import android.os.SystemClock
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.R
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.adapter.NotelistAdapter
import com.example.yatraonlinev_pallavsrivastava.kotlinsample.model.Note
import java.util.*
import kotlin.collections.ArrayList


class MainFragment : Fragment() {

    @BindView(R.id.rv_notes_list)
    lateinit var rvNoteList: RecyclerView

    private lateinit var mLayoutManager: RecyclerView.LayoutManager
    private var mNoteList: MutableList<Note> = ArrayList()

    private val TAG = MainFragment::class.java.simpleName

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ButterKnife.bind(this, view)
        mLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rvNoteList.layoutManager = mLayoutManager
        setUpNotesData()
        rvNoteList.adapter = NotelistAdapter(mNoteList) {
            Toast.makeText(activity, "${it.name} Clicked", Toast.LENGTH_SHORT).show()
        }


    }

    fun setUpNotesData() {
        for (i in 1..10) {
            var note = Note("Note${i}", Date(SystemClock.currentThreadTimeMillis()).toString(), "hey", "fdfdd")
            mNoteList.add(note)
        }
    }
}