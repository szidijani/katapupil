package kotlintest.com.katapupil.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import kotlintest.com.katapupil.R;

public class CreateToDoActivity extends Activity {

    private EditText toDoInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_todo);

        toDoInput = findViewById(R.id.todoInput);
    }

    public void onCreateClicked(View view) {
        String toDoText = toDoInput.getText().toString();

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(MainActivity.NEW_ITEM_BUNDLE_KEY, toDoText);
        intent.putExtras(bundle);

        setResult(RESULT_OK, intent);

        finish();
    }
}
