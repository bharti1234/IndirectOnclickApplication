package com.example.bharti.indirectonclickapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IndirectOnclickActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indirect_onclick);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new Handler());
    }
    public class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"hello how are you?",Toast.LENGTH_LONG).show();
        }
    }
}
