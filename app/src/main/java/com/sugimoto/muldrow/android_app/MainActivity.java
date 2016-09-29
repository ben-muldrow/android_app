package com.sugimoto.muldrow.android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends AppCompatActivity {

    // GUI elements
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // set creation state and view
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // start up facebook SDK and Logger [not working right now]
        FacebookSdk.sdkInitialize(getApplicationContext());
//      AppEventsLogger.activateApp(this);

        // add layout objects
        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        // change text on button click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });
    }
}
