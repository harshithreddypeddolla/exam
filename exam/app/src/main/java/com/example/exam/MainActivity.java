package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inputusername=findViewById(R.id.username);
        final EditText inputpassword=findViewById(R.id.password);
         Button buttonsubmit=findViewById(R.id.login);

         buttonsubmit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String username = inputusername.getText().toString();
                 String Password = inputpassword.getText().toString();

                 List<Info> information=Details.getInstance().information;

                 for(int i=0;i<information.size();i++)
                 {
                         Info info=information.get(i);

                     if (info.name.equals(username) &&info.passwords.equals(Password)) {
                         Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                         startActivity(intent);
                     }
                     else
                         {

                         Toast invalid = Toast.makeText(
                                 getApplicationContext(), "INVALID", Toast.LENGTH_LONG);
                         invalid.show();
                     }

                 }
             }
         });
    }
}