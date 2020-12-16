package com.example.license;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    EditText inputname;
    EditText inputaddress;
    EditText inputbday;
    EditText inputsex;
    EditText inputheight;
    EditText inputweight;
    EditText inputnationality;
    EditText inputrestrictions;
    EditText inputcondition;
    EditText inputagy;
    EditText inputexpires;
    EditText inputlnum;
    EditText inputasst;
    EditText inputdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputname=findViewById(R. id. name);
        inputaddress = findViewById(R. id. address);
        inputbday=findViewById(R. id. bday);
        inputsex = findViewById(R. id. sex);
        inputheight=findViewById(R. id. height);
        inputweight = findViewById(R. id. weight);
        inputnationality=findViewById(R. id. nationality);
        inputrestrictions = findViewById(R. id. restrictions);
        inputcondition=findViewById(R. id. condition);
        inputagy = findViewById(R. id. agy);
        inputexpires=findViewById(R. id. expires);
        inputlnum = findViewById(R. id. lnum);
        inputasst=findViewById(R. id. asst);
        inputdate = findViewById(R. id. date);
    }

    public void btngo(View view) {
        if (TextUtils.isEmpty(inputname.getText().toString().trim()) || TextUtils.isEmpty(inputaddress.getText().toString().trim()) || TextUtils.isEmpty(inputbday.getText().toString().trim()) || TextUtils.isEmpty(inputsex.getText().toString().trim()) || TextUtils.isEmpty(inputheight.getText().toString().trim()) || TextUtils.isEmpty(inputweight.getText().toString().trim()) || TextUtils.isEmpty(inputnationality.getText().toString().trim()) || TextUtils.isEmpty(inputrestrictions.getText().toString().trim()) || TextUtils.isEmpty(inputcondition.getText().toString().trim()) || TextUtils.isEmpty(inputagy.getText().toString().trim()) || TextUtils.isEmpty(inputexpires.getText().toString().trim()) || TextUtils.isEmpty(inputlnum.getText().toString().trim()) || TextUtils.isEmpty(inputasst.getText().toString().trim()) || TextUtils.isEmpty(inputdate.getText().toString().trim())) {
            inputname.setError("Fields can't be Empty");
            inputaddress.setError("Fields can't be Empty");
            inputbday.setError("Fields can't be Empty");
            inputsex.setError("Fields can't be Empty");
            inputheight.setError("Fields can't be Empty");
            inputweight.setError("Fields can't be Empty");
            inputnationality.setError("Fields can't be Empty");
            inputrestrictions.setError("Fields can't be Empty");
            inputcondition.setError("Fields can't be Empty");
            inputagy.setError("Fields can't be Empty");
            inputexpires.setError("Fields can't be Empty");
            inputlnum.setError("Fields can't be Empty");
            inputasst.setError("Fields can't be Empty");
            inputdate.setError("Fields can't be Empty");
        }
        else{
            String name = inputname.getText().toString();
            Snackbar snackbar = Snackbar.make(view, "Are you sure you want to generate license for "+ name, Snackbar.LENGTH_LONG);
            snackbar.setAction("Ok", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = inputname.getText().toString();
                    String address = inputaddress.getText().toString();
                    String bday = inputbday.getText().toString();
                    String sex = inputsex.getText().toString();
                    String height = inputheight.getText().toString();
                    String weight = inputweight.getText().toString();
                    String nationality = inputnationality.getText().toString();
                    String restrictions = inputrestrictions.getText().toString();
                    String condition = inputcondition.getText().toString();
                    String agy = inputagy.getText().toString();
                    String expires = inputexpires.getText().toString();
                    String lnum = inputlnum.getText().toString();
                    String asst = inputasst.getText().toString();
                    String date = inputdate.getText().toString();


                    Intent intent = new Intent(getApplicationContext(), showoutput.class);
                    intent.putExtra("keyname" , name);
                    intent.putExtra("keyadd", address);
                    intent.putExtra("keybday" , bday);
                    intent.putExtra("keysex", sex);
                    intent.putExtra("keyheight" , height);
                    intent.putExtra("keyweight", weight);
                    intent.putExtra("keynationality" , nationality);
                    intent.putExtra("keyrestrictions", restrictions);
                    intent.putExtra("keycondition" , condition);
                    intent.putExtra("keyagy", agy);
                    intent.putExtra("keyexpires" , expires);
                    intent.putExtra("keylnum", lnum);
                    intent.putExtra("keyasst" , asst);
                    intent.putExtra("keydate", date);
                    startActivity(intent);
                }
            });
            snackbar.show();
        }
    }
}
