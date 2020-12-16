package com.example.license;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class showoutput extends AppCompatActivity {
    TextView oname;
    TextView oaddress;
    TextView obday;
    TextView osex;
    TextView oheight;
    TextView oweight;
    TextView onationality;
    TextView orestrictions;
    TextView ocondition;
    TextView oagy;
    TextView oexpires;
    TextView olnum;
    TextView oasst;
    TextView odate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showoutput);

        oname=findViewById(R. id. oname);
        oaddress = findViewById(R. id. oaddress);
        obday=findViewById(R. id. obday);
        osex=findViewById(R. id. osex);
        oheight=findViewById(R. id. oheight);
        oweight=findViewById(R. id. oweight);
        onationality=findViewById(R. id. onationality);
        orestrictions=findViewById(R. id. ores);
        ocondition=findViewById(R. id. ocon);
        oagy=findViewById(R. id. oagy);
        oexpires=findViewById(R. id. oexpire);
        olnum=findViewById(R. id. olnum);
        oasst=findViewById(R. id. osec);
        odate=findViewById(R. id. odate);

        String txtname = getIntent().getExtras().getString("keyname");
        String txtaddress = getIntent().getExtras().getString("keyadd");
        String txtbday = getIntent().getExtras().getString("keybday");
        String txtsex = getIntent().getExtras().getString("keysex");
        String txtheight = getIntent().getExtras().getString("keyheight");
        String txtweight = getIntent().getExtras().getString("keyweight");
        String txtnationality = getIntent().getExtras().getString("keynationality");
        String txtrestrictions = getIntent().getExtras().getString("keyrestrictions");
        String txtcondition = getIntent().getExtras().getString("keycondition");
        String txtagy = getIntent().getExtras().getString("keyagy");
        String txtexpires = getIntent().getExtras().getString("keyexpires");
        String txtlnum = getIntent().getExtras().getString("keylnum");
        String txtasst = getIntent().getExtras().getString("keyasst");
        String txtdate = getIntent().getExtras().getString("keydate");



        oname.setText(txtname);
        oaddress.setText(txtaddress);
        obday.setText(txtbday);
        osex.setText(txtsex);
        oheight.setText(txtheight);
        oweight.setText(txtweight);
        onationality.setText(txtnationality);
        orestrictions.setText(txtrestrictions);
        ocondition.setText(txtcondition);
        oagy.setText(txtagy);
        oexpires.setText(txtexpires);
        olnum.setText(txtlnum);
        oasst.setText(txtasst);
        odate.setText(txtdate);
    }
}
