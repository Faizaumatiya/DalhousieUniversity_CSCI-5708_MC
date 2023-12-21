package com.example.labassignment03.persistence

import com.example.labassignment03.model.Note

object NotesStorage {

    val notes = ArrayList<Note>()

    init {
        for (i in 1..2){
            notes.add(Note("Note #$i", "Body #$i"))
        }
    }
}