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

    public static final int LIST_NEW_ITEM_REQUEST_CODE = 234;
    public static final String NEW_ITEM_BUNDLE_KEY = "newItemBundleKey";

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

        LayoutInflater inflater = LayoutInflater.from(this);
        adapter = new ToDoAdapter(inflater, items);
        toDoListView.setAdapter(adapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == LIST_NEW_ITEM_REQUEST_CODE) {
            Bundle bundle = intent.getExtras();

            String toDoText = bundle.getString(NEW_ITEM_BUNDLE_KEY);

            ToDoItem newItem = new ToDoItem(toDoText);
            items.add(newItem);
            adapter.notifyDataSetChanged();
        }
    }

    public void onGoCreateClicked(View button) {
        startActivityForResult(new Intent(this, CreateToDoActivity.class), LIST_NEW_ITEM_REQUEST_CODE);
    }
}
