package com.example.rwsd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText fileName,content;
        Button write,read;
        
        fileName=(EditText)findViewById(R.id.editText1);
        content=(EditText)findViewById(R.id.editText2);
        write=(Button)findViewById(R.id.button1);
        read=(Button)findViewById(R.id.button2);
        
        
        		
    }

    
}
