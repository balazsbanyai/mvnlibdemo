package com.banyaibalazs.mvnlibdemo.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.banyaibalazs.mvnlibdemo.lib.Library;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Library loaded with version: "+ Library.getVersion(), Toast.LENGTH_LONG).show();
    }
}
