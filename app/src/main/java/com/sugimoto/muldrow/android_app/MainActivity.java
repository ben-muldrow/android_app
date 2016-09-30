package com.sugimoto.muldrow.android_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends Activity {

    // GUI elements
    private TextView titleTextView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // set creation state
        super.onCreate(savedInstanceState);

        // start up facebook SDK and Logger
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        // set the view
        setContentView(R.layout.activity_main);

        // add layout objects
        titleTextView = (TextView)findViewById(R.id.titleTextView);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        // change text on button click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titleTextView.setText(editText.getText().toString());
            }
        });
    }
}
