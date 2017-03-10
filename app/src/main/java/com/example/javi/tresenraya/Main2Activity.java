package com.example.javi.tresenraya;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {

    private Button uno;
    private Button dos;
    private Button tres;
    private Button cuatro;
    private Button cinco;
    private Button seis;
    private Button siete;
    private Button ocho;
    private Button nueve;


    int cambio = 0; // par jugador1 , impar jugador2.
    int enpate = 0; // si llega a nueve hay un enpate.

    /**
     * posibles combinaciones ganadoras horizontal , vertical , diagonal.
     */
    int ganada[][] = { {1,2,3,},{4,5,6},{7,8,9} , {1,4,7},{2,5,8},{3,6,9} , {1,5,9},{3,5,7}};

    int jugador1[][] = new int[8][3]; // almacenamos las combinaciones del jugador 1
    int jugador2[][] = new int[8][3]; // almacenamos las combinaciones del jugador 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Context context = getApplicationContext();
        CharSequence text = "Has ganado !!!!";
        int duration = Toast.LENGTH_LONG; // duracion del mensaje emergente

        final Toast toast = Toast.makeText(context, text, duration);

        uno = (Button) findViewById(R.id.button1);

        dos = (Button) findViewById(R.id.button12);

        tres = (Button) findViewById(R.id.button13);

        cuatro = (Button) findViewById(R.id.button14);

        cinco = (Button) findViewById(R.id.button15);

        seis = (Button) findViewById(R.id.button16);

        siete = (Button) findViewById(R.id.button17);

        ocho = (Button) findViewById(R.id.button18);

        nueve = (Button) findViewById(R.id.button19);



        final Button uno = (Button) findViewById(R.id.button1);
        uno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    uno.setBackgroundColor(0xffff0000); // color rojo
                    cambio++;

                    jugador1[0][0] = 1;
                    jugador1[3][0] = 1;
                    jugador1[6][0] = 1;

                    uno.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado


                    /**
                     *  si gana muestra mensaje y inhabilita los botones
                     */
                    if(a){

                        toast.show();
                        noClickButton();

                    }

                }else{  // es el jugador 2 , mismo procedimiento que el de arriba

                    uno.setBackgroundColor(0xff00ffff); // color cian
                    cambio++;

                    jugador2[0][0] = 1;
                    jugador2[3][0] = 1;
                    jugador2[6][0] = 1;

                    uno.setClickable(false);

                    a = ganador(jugador2);

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });


        final Button dos = (Button) findViewById(R.id.button12);
        dos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    dos.setBackgroundColor(0xffff0000);
                    cambio++;

                    jugador1[0][1] = 2;
                    jugador1[4][0] = 2;

                    dos.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    dos.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[0][1] = 2;
                    jugador2[4][0] = 2;

                    dos.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });


        final Button tres = (Button) findViewById(R.id.button13);
        tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    tres.setBackgroundColor(0xffff0000);
                    cambio++;

                    jugador1[0][2] = 3;
                    jugador1[5][0] = 3;
                    jugador1[7][0] = 3;

                    tres.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    tres.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[0][2] = 3;
                    jugador2[5][0] = 3;
                    jugador2[7][0] = 3;

                    tres.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });

        final Button cuatro = (Button) findViewById(R.id.button14);
        cuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    cuatro.setBackgroundColor(0xffff0000);

                    cambio++;

                    jugador1[1][0] = 4;
                    jugador1[3][1] = 4;

                    cuatro.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    cuatro.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[1][0] = 4;
                    jugador2[3][1] = 4;

                    cuatro.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });


        final Button cinco = (Button) findViewById(R.id.button15);
        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    cinco.setBackgroundColor(0xffff0000);

                    cambio++;

                    jugador1[1][1] = 5;
                    jugador1[4][1] = 5;
                    jugador1[6][1] = 5;
                    jugador1[7][1] = 5;

                    cinco.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    cinco.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[1][1] = 5;
                    jugador2[4][1] = 5;
                    jugador2[6][1] = 5;
                    jugador2[7][1] = 5;

                    cinco.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });

        final Button seis = (Button) findViewById(R.id.button16);
        seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    seis.setBackgroundColor(0xffff0000);

                    cambio++;

                    jugador1[1][2] = 6;
                    jugador1[5][1] = 6;

                    seis.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    seis.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[1][2] = 6;
                    jugador2[5][1] = 6;

                    seis.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });

        final Button siete = (Button) findViewById(R.id.button17);
        siete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    siete.setBackgroundColor(0xffff0000);

                    cambio++;

                    jugador1[2][0] = 7;
                    jugador1[3][2] = 7;
                    jugador1[7][2] = 7;

                    siete.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    siete.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[2][0] = 7;
                    jugador2[3][2] = 7;
                    jugador2[7][2] = 7;

                    siete.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });

        final Button ocho = (Button) findViewById(R.id.button18);
        ocho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    ocho.setBackgroundColor(0xffff0000);

                    cambio++;

                    jugador1[2][1] = 8;
                    jugador1[4][2] = 8;

                    ocho.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    ocho.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[2][1] = 8;
                    jugador2[4][2] = 8;

                    ocho.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });

        final Button nueve = (Button) findViewById(R.id.button19);
        nueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                boolean a;
                enpate++;

                if(cambio % 2 == 0){

                    nueve.setBackgroundColor(0xffff0000);

                    cambio++;

                    jugador1[2][2] = 9;
                    jugador1[5][2] = 9;
                    jugador1[6][2] = 9;

                    nueve.setClickable(false);

                    a = ganador(jugador1); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }

                }else{

                    nueve.setBackgroundColor(0xff00ffff);
                    cambio++;

                    jugador2[2][2] = 9;
                    jugador2[5][2] = 9;
                    jugador2[6][2] = 9;

                    nueve.setClickable(false);

                    a = ganador(jugador2); // comprueba si ha ganado

                    if(a){

                        toast.show();
                        noClickButton();
                    }
                }

                if(enpate == 9 && !a){
                    empate();
                }

            }
        });


    }

    /**
     *
     * @param menu menu
     * @return bol
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    /**
     * Comprueba el ganador
     * @param jugador
     */
    public boolean ganador(int[][] jugador){

        boolean gana = false;

        for (int y = 0 ; y < 7; y++) {

            if (Arrays.equals(ganada[y], jugador[y])) {

                gana = true;
            }
        }

        return gana;
    }

    /**
     *
     * @param item
     * @return
     */
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
//
        if(id == R.id.salir){

            finish();
        }

        if(id == R.id.reinicio){

            enpate = 0; // se restablece el numero de botones pulsados

            for (int i = 0; i < jugador1.length; i++) {  //número de filas
                for (int j = 0; j < jugador1[i].length; j++) { //número de columnas de cada fila
                    jugador1[i][j] = 0;
                }
            }

            for (int i = 0; i < jugador2.length; i++) {  //número de filas
                for (int j = 0; j < jugador2[i].length; j++) { //número de columnas de cada fila
                    jugador2[i][j] = 0;
                }
            }

            // se cambia el color a blanco cuando se reinicia

            uno.setBackgroundColor(0xffffffff);

            dos.setBackgroundColor(0xffffffff);

            tres.setBackgroundColor(0xffffffff);

            cuatro.setBackgroundColor(0xffffffff);

            cinco.setBackgroundColor(0xffffffff);

            seis.setBackgroundColor(0xffffffff);

            siete.setBackgroundColor(0xffffffff);

            ocho.setBackgroundColor(0xffffffff);

            nueve.setBackgroundColor(0xffffffff);


            // se activan los botones

            uno.setClickable(true);

            dos.setClickable(true);

            tres.setClickable(true);

            cuatro.setClickable(true);

            cinco.setClickable(true);

            cinco.setClickable(true);

            seis.setClickable(true);

            siete.setClickable(true);

            ocho.setClickable(true);

            nueve.setClickable(true);
        }


        if(id == R.id.acerca){

            Intent myIntent = new Intent(Main2Activity.this, Main3Activity.class);

            startActivity(myIntent);

            finish();
        }



        return super.onOptionsItemSelected(item);
    }

    /**
     * No se puede hacer click sobre los botones
     */
    public void noClickButton(){

        uno.setClickable(false);

        dos.setClickable(false);

        tres.setClickable(false);

        cuatro.setClickable(false);

        cinco.setClickable(false);

        cinco.setClickable(false);

        seis.setClickable(false);

        siete.setClickable(false);

        ocho.setClickable(false);

        nueve.setClickable(false);
    }


    /**
     * Mensasje de empate en caso de que todos los botons
     */
    public void empate(){

        Context context = getApplicationContext();
        CharSequence text = "Enpate entre los dos jugadores !!!!";
        int duration = Toast.LENGTH_LONG; // duracion del mensaje emergente

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
