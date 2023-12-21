package com.example.labassignment03.persistence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment03.R
import com.example.labassignment03.model.Note

class NotesRecyclerViewAdapter() : RecyclerView.Adapter<NotesRecyclerViewAdapter.NoteListItem>(){
    private var notes = emptyList<Note>()

    inner class NoteListItem(noteListItemView : View?) : RecyclerView.ViewHolder(noteListItemView!!){
        val noteTitleText : TextView? = noteListItemView?.findViewById(R.id.noteTitle)
        val noteBodyText : TextView? = noteListItemView?.findViewById(R.id.noteBody)
        var notePosition = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteListItem {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        val noteListView : View = layoutInflater.inflate(R.layout.note_view, parent, false)
        return NoteListItem(noteListView)
    }

    override fun onBindViewHolder(holder: NoteListItem, position: Int) {
        val note : Note = notes[position]
        holder.noteTitleText?.text = note.noteTitle
        holder.noteBodyText?.text = note.noteBody
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    fun setNotes(notes : List<Note>){
        this.notes = notes;
        notifyDataSetChanged()
    }
}