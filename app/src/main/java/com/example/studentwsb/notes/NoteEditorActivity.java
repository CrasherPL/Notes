package com.example.studentwsb.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class NoteEditorActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        editText = findViewById(R.id.editText);
        Intent intent = getIntent();
        int noteId = intent.getIntExtra("noteId", -1);
        if (noteId != -1) {
            editText .setText(MainActivity.notes.get(noteId));
        }
    }
}
