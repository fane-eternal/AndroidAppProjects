package com.example.kryptonote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class KryptoNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kryptonote_layout);
    }


    public void onEncrypt(View v){
        try{
            Cipher x = new Cipher(((EditText) findViewById(R.id.key)).getText().toString());
            String ans = x.encrypt(((EditText) findViewById(R.id.data)).getText().toString());
            ((TextView) findViewById(R.id.data)).setText(ans);
        }
        catch(Exception e){
            Toast label = Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            label.show();
        }

    }


    public void onDecrypt(View v){
        try{
            Cipher x = new Cipher(((EditText) findViewById(R.id.key)).getText().toString());
            String ans = x.decrypt(((EditText) findViewById(R.id.data)).getText().toString());
            ((TextView) findViewById(R.id.data)).setText(ans);
        }

        catch(Exception e){
            Toast label = Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            label.show();
        }
    }


    public void onSave(View v){
        try{
            String name = ((EditText) findViewById(R.id.file)).getText().toString();
            File dir = this.getFilesDir();
            File file = new File(dir, name);
            FileWriter fw = new FileWriter(file);
            fw.write(((EditText) findViewById(R.id.data)).getText().toString());

            fw.close();
            Toast label = Toast.makeText(this, "Note Saved.", Toast.LENGTH_SHORT);
            label.show();
        }
        catch (Exception e){
            Toast sh = Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            sh.show();
        }
    }


    public void onLoad(View v){
        try{
            String name = ((EditText) findViewById(R.id.file)).getText().toString();
            File dir = this.getFilesDir();
            File file = new File(dir, name);
            FileReader fr = new FileReader(file);
            String show = "";
            for(int c = fr.read(); c!= -1; c = fr.read()){
                show += (char) c;
            }
            fr.close();
            ((EditText) findViewById(R.id.data)).setText(show);
        }
        catch (Exception e){
            Toast label = Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
            label.show();
        }
    }
}
