package kotlintest.com.katapupil.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import kotlintest.com.katapupil.R;
import kotlintest.com.katapupil.todo.ToDoItem;

public class MainActivity extends Activity {

    RecyclerView toDoListView;

    ToDoAdapter adapter;
    List<ToDoItem> items;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        toDoListView = findViewById(R.id.todoList);
        toDoListView.setLayoutManager(new LinearLayoutManager(this));

        items = new ArrayList<>();
        items.add(new ToDoItem("Go shopping!"));
        items.add(new ToDoItem("Pay bills!"));
        items.add(new ToDoItem("Go to bank!"));

        LayoutInflater inflater = LayoutInflater.from(this);

        adapter = new ToDoAdapter(inflater, items);

        toDoListView.setAdapter(adapter);
    }

    public void onGoCreateClicked(View button) {

        startActivity(new Intent(this, CreateToDoActivity.class));
    }
}
