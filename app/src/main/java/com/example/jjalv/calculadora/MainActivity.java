package com.example.jjalv.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends Activity implements ImageButton.OnClickListener{

    ImageButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btIgual,btMas,btMenos,btPor,btEntre;
    String[] cifra = new String[1];
    String buffer = "";
    boolean suma=false;
    boolean resta=false;
    boolean multiplicar=false;
    boolean dividir=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(ImageButton)findViewById(R.id.imageButton);
        bt2=(ImageButton)findViewById(R.id.imageButton2);
        bt3=(ImageButton)findViewById(R.id.imageButton3);
        bt4=(ImageButton)findViewById(R.id.imageButton4);
        bt5=(ImageButton)findViewById(R.id.imageButton5);
        bt6=(ImageButton)findViewById(R.id.imageButton6);
        bt7=(ImageButton)findViewById(R.id.imageButton7);
        bt8=(ImageButton)findViewById(R.id.imageButton8);
        bt9=(ImageButton)findViewById(R.id.imageButton9);
        bt0=(ImageButton)findViewById(R.id.imageButton0);
        btIgual=(ImageButton)findViewById(R.id.imageButton15);
        btMas=(ImageButton)findViewById(R.id.imageButton11);
        btMenos=(ImageButton)findViewById(R.id.imageButton12);
        btPor=(ImageButton)findViewById(R.id.imageButton13);
        btEntre=(ImageButton)findViewById(R.id.imageButton14);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btIgual.setOnClickListener(this);
        btMas.setOnClickListener(this);
        btMenos.setOnClickListener(this);
        btPor.setOnClickListener(this);
        btEntre.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {




        switch (v.getId()){

            case R.id.imageButton:
                String uno="1";
                buffer=buffer+uno;
                break;
            case R.id.imageButton2:
                String dos="2";
                buffer=buffer+dos;
                break;
            case R.id.imageButton3:
                String tres="3";
                buffer=buffer+tres;
                break;
            case R.id.imageButton4:
                String cuatro="4";
                buffer=buffer+cuatro;
                break;
            case R.id.imageButton5:
                String cinco="5";
                buffer=buffer+cinco;
                break;
            case R.id.imageButton6:
                String seis="6";
                buffer=buffer+seis;
                break;
            case R.id.imageButton7:
                String siete="7";
                buffer=buffer+siete;
                break;
            case R.id.imageButton8:
                String ocho="8";
                buffer=buffer+ocho;
                break;
            case R.id.imageButton9:
                String nueve="9";
                buffer=buffer+nueve;
                break;
            case R.id.imageButton0:
                String cero="0";
                buffer=buffer+cero;
                break;
            case R.id.imageButton11:
                cifra[0]=buffer;
                buffer="";
                suma=true;
                break;
            case R.id.imageButton12:
                cifra[0]=buffer;
                buffer="";
                resta=true;
                break;
            case R.id.imageButton13:
                cifra[0]=buffer;
                buffer="";
                multiplicar=true;
                break;
            case R.id.imageButton14:
                cifra[0]=buffer;
                buffer="";
                dividir=true;
                break;
            case R.id.imageButton15:

                if(suma){
                    String cifra1 =cifra[0];
                    String resultadoSinEspacioCifra1=cifra1.trim();
                    String cifra2=buffer.trim();
                    int valor1= Integer.parseInt(resultadoSinEspacioCifra1);
                    int valor2= Integer.parseInt(cifra2);
                    int sumar=valor1+valor2;
                    buffer="";

                    Toast.makeText(this,""+sumar,Toast.LENGTH_LONG).show();

                    String sumarInt=String.valueOf(sumar);
                    Intent intent= new Intent(this,Resultado.class);
                    intent.putExtra("result",sumarInt);
                    startActivity(intent);
                    suma=false;
                }
                if(resta){
                    String cifra1 =cifra[0];
                    String resultadoSinEspacioCifra1=cifra1.trim();
                    String cifra2=buffer.trim();
                    int valor1= Integer.parseInt(resultadoSinEspacioCifra1);
                    int valor2= Integer.parseInt(cifra2);
                    int restar=valor1-valor2;
                    buffer="";
                    resta=false;

                    Toast.makeText(this,""+restar,Toast.LENGTH_LONG).show();

                    String restarInt=String.valueOf(restar);
                    Intent intent= new Intent(this,Resultado.class);
                    startActivity(intent);
                    intent.putExtra("result",restarInt);


            }
                if(multiplicar){
                    String cifra1 =cifra[0];
                    String resultadoSinEspacioCifra1=cifra1.trim();
                    String cifra2=buffer.trim();
                    int valor1= Integer.parseInt(resultadoSinEspacioCifra1);
                    int valor2= Integer.parseInt(cifra2);
                    int multiplicacion=valor1*valor2;
                    buffer="";

                    Toast.makeText(this,""+multiplicacion,Toast.LENGTH_LONG).show();

                    String multiplicarInt=String.valueOf(multiplicacion);
                    Intent intent= new Intent(this,Resultado.class);
                    intent.putExtra("result",multiplicarInt);
                    startActivity(intent);
                    multiplicar=false;

                }
                if(dividir){
                    String cifra1 =cifra[0];
                    String resultadoSinEspacioCifra1=cifra1.trim();
                    String cifra2=buffer.trim();
                    int valor1= Integer.parseInt(resultadoSinEspacioCifra1);
                    int valor2= Integer.parseInt(cifra2);
                    int division=valor1/valor2;
                    buffer="";

                    Toast.makeText(this,""+division,Toast.LENGTH_LONG).show();

                    String divisionInt=String.valueOf(division);
                    Intent intent= new Intent(this,Resultado.class);
                    intent.putExtra("result",divisionInt);
                    startActivity(intent);
                    dividir=false;

                }

                break;


        }



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
