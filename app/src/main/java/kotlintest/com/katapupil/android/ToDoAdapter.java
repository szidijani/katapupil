package kotlintest.com.katapupil.android;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import kotlintest.com.katapupil.R;
import kotlintest.com.katapupil.todo.ToDoItem;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder> {

    private LayoutInflater inflater;
    private List<ToDoItem> toDoItemList;

    ToDoAdapter(LayoutInflater inflater, List<ToDoItem> toDoItemList) {
        this.inflater = inflater;
        this.toDoItemList = toDoItemList;
    }

    @NonNull
    @Override
    public ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_todo, viewGroup, false);

        return new ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoViewHolder toDoViewHolder, int index) {
        toDoViewHolder.getMessageTextView() // ==> TextView
                .setText(
                        toDoItemList.get(index) // ==> ToDoItem
                                .getMessage() // ==> String
                );
        toDoViewHolder.getCreatedTextView() // ==> TextView
                .setText(toDoItemList.get(index).getCreated().toString());
    }

    @Override
    public int getItemCount() {
        return toDoItemList.size();
    }

    class ToDoViewHolder extends RecyclerView.ViewHolder {

        private TextView messageTextView;
        private TextView createdTextView;

        ToDoViewHolder(@NonNull View itemView) {
            super(itemView);

            messageTextView = itemView.findViewById(R.id.message);
            createdTextView = itemView.findViewById(R.id.created);
        }

        TextView getMessageTextView() {
            return messageTextView;
        }

        TextView getCreatedTextView() {
            return createdTextView;
        }
    }
}
