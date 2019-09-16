package kotlintest.com.katapupil.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import kotlintest.com.katapupil.R;

public class CreateToDoActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_todo);

    }
}
