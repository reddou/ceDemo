package com.zlzf.mygithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.zlzf.library.Nandke;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ddd(View view) {
        Toast.makeText(this,  Nandke.gitName(), Toast.LENGTH_SHORT).show();
    }
}
