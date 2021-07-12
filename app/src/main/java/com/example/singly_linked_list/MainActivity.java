package com.example.singly_linked_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {  //linked list
    Linked_List linkedList;
    EditText values;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        values = findViewById(R.id.values);
        linkedList = new Linked_List();
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(3);
        ;
        Log.e(" ",linkedList.printValues());
        values.setText(linkedList.printValues());
        linkedList.remove();
       // linkedList.remove();
        Log.e(" -------",linkedList.printValues());
        linkedList.remove();
        Log.e(" ++++++++++",linkedList.printValues());

    }
}