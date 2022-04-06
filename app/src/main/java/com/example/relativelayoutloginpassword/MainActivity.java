package com.example.relativelayoutloginpassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.edittext1);
        t2=findViewById(R.id.edittext2);
        b1=findViewById(R.id.submit);
        b1.setOnClickListener(v->{
            String s1=t1.getText().toString();
            String s2=t2.getText().toString();
            if(s1.equals("sam")==true && s2.equals("sam")==true)
            {
                Toast.makeText(this, "Login Succesful", Toast.LENGTH_SHORT).show( );
            }
            else
            {
                Toast.makeText(this,"Login Fail",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void onBackPressed() { setContentView(R.layout.activity_main);
    }
}

