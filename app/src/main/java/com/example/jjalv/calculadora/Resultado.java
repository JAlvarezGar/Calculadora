package com.example.jjalv.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Resultado extends Activity implements Button.OnClickListener {

    TextView tv1;
    Button nuevocalculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tv1 = (TextView) findViewById(R.id.tvResultado);
        nuevocalculo= (Button)findViewById(R.id.btNuevoCalculo);

        Bundle bundle = getIntent().getExtras();
        String result = bundle.getString("result");
        tv1.setText("El resultado es : "+result);
        nuevocalculo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        finish();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resultado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

