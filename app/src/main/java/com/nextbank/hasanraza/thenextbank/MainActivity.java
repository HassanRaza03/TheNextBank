package com.nextbank.hasanraza.thenextbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user_name;
    EditText pass;
    Button for_pass;
    Button registr;
    Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if((user_name.getText()).toString().isEmpty() || (pass.getText()).toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Some Fields Empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Logged In as "+(user_name.getText()).toString()+"pass "+(pass.getText()).toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void bindViews(){
        user_name = (EditText) findViewById(R.id.usr_nme_txt);
        pass = (EditText) findViewById(R.id.pswrd_txt);
        for_pass = (Button) findViewById(R.id.forgt_pswrd_btn);
        registr = (Button) findViewById(R.id.Rgstr_btn);
        sign = (Button) findViewById(R.id.s_in_btn);
    }
}
