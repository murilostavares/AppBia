package com.example.android.appbia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void consertar(View view) {

        EditText textoInserido = findViewById(R.id.texto_view);
        String hasTexto = textoInserido.getText().toString();

        String textoOK = consertado(hasTexto);

        displayMessage(textoOK);

    }

    private void displayMessage(String message) {

        TextView textoApresentado = findViewById(R.id.texto_apresentado);
        textoApresentado.setText(message);
    }

    private String consertado(String hasTexto) {

        int mark = 0;
        int dot = hasTexto.length();
        String nome = "";
        String adj;


        do {

            String letra = hasTexto.substring(mark, mark + 1);

            switch (letra) {
                //minusculas
                case "a":
                    adj = "g";
                    break;
                case "b":
                    adj = "h";
                    break;
                case "c":
                    adj = "i";
                    break;
                case "d":
                    adj = "j";
                    break;
                case "e":
                    adj = "k";
                    break;
                case "f":
                    adj = "l";
                    break;
                case "g":
                    adj = "m";
                    break;
                case "h":
                    adj = "n";
                    break;
                case "i":
                    adj = "o";
                    break;
                case "j":
                    adj = "p";
                    break;
                case "k":
                    adj = "q";
                    break;
                case "l":
                    adj = "r";
                    break;
                case "m":
                    adj = "s";
                    break;
                case "n":
                    adj = "t";
                    break;
                case "o":
                    adj = "u";
                    break;
                case "p":
                    adj = "v";
                    break;
                case "q":
                    adj = "w";
                    break;
                case "r":
                    adj = "x";
                    break;
                case "s":
                    adj = "y";
                    break;
                case "t":
                    adj = "z";
                    break;
                case "u":
                    adj = "a";
                    break;
                case "v":
                    adj = "b";
                    break;
                case "w":
                    adj = "c";
                    break;
                case "x":
                    adj = "d";
                    break;
                case "y":
                    adj = "e";
                    break;
                case "z":
                    adj = "f";
                    break;
                //maiusculas
                case "A":
                    adj = "G";
                    break;
                case "B":
                    adj = "H";
                    break;
                case "C":
                    adj = "I";
                    break;
                case "D":
                    adj = "J";
                    break;
                case "E":
                    adj = "K";
                    break;
                case "F":
                    adj = "L";
                    break;
                case "G":
                    adj = "M";
                    break;
                case "H":
                    adj = "N";
                    break;
                case "I":
                    adj = "O";
                    break;
                case "J":
                    adj = "P";
                    break;
                case "K":
                    adj = "Q";
                    break;
                case "L":
                    adj = "R";
                    break;
                case "M":
                    adj = "S";
                    break;
                case "N":
                    adj = "T";
                    break;
                case "O":
                    adj = "U";
                    break;
                case "P":
                    adj = "V";
                    break;
                case "Q":
                    adj = "W";
                    break;
                case "R":
                    adj = "X";
                    break;
                case "S":
                    adj = "Y";
                    break;
                case "T":
                    adj = "Z";
                    break;
                case "U":
                    adj = "A";
                    break;
                case "V":
                    adj = "B";
                    break;
                case "W":
                    adj = "C";
                    break;
                case "X":
                    adj = "D";
                    break;
                case "Y":
                    adj = "E";
                    break;
                case "Z":
                    adj = "F";
                    break;
                case " ":
                    adj = " ";
                    break;
                default:
                    adj = ("  *** NESTE PONTO, UM CARACTER INFORMADO ESTA INCORRETO ");
            }

            nome = nome + adj;

            mark++;

        }

        while (mark < dot && dot != 0);

        return nome;

    }







}
