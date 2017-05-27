package com.example.mini.libros_mini1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startTask (View view){
        mTextView.setText("Napping");

        // Inicia el AsyncTask
        new SimpleAsyncTask(mTextView).execute();
    }

    private TextView mTextView;
}