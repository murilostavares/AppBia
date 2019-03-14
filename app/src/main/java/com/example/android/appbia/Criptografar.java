package com.example.android.appbia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Criptografar extends AppCompatActivity {


    public void consertar(View view) {

        EditText textoInserido = findViewById(R.id.texto_view);
        String hasTexto = textoInserido.getText().toString();

        displayMessage(consertado(hasTexto));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criptografar);
    }

    private void displayMessage(String message) {

        TextView textoApresentado = findViewById(R.id.texto_apresentado);
        textoApresentado.setText(message);
    }

    private String consertado(String hasTexto) {

        int mark = 0;
        int dot = hasTexto.length();
        StringBuilder nome = new StringBuilder();
        String adj;


        do {

            String letra = hasTexto.substring(mark, mark + 1);

            switch (letra) {
                //minusculas
                case "g":
                    adj = "a";
                    break;
                case "h":
                    adj = "b";
                    break;
                case "i":
                    adj = "c";
                    break;
                case "j":
                    adj = "d";
                    break;
                case "k":
                    adj = "e";
                    break;
                case "l":
                    adj = "f";
                    break;
                case "m":
                    adj = "g";
                    break;
                case "n":
                    adj = "h";
                    break;
                case "o":
                    adj = "i";
                    break;
                case "p":
                    adj = "j";
                    break;
                case "q":
                    adj = "k";
                    break;
                case "r":
                    adj = "l";
                    break;
                case "s":
                    adj = "m";
                    break;
                case "t":
                    adj = "n";
                    break;
                case "u":
                    adj = "o";
                    break;
                case "v":
                    adj = "p";
                    break;
                case "w":
                    adj = "q";
                    break;
                case "x":
                    adj = "r";
                    break;
                case "y":
                    adj = "s";
                    break;
                case "z":
                    adj = "t";
                    break;
                case "a":
                    adj = "u";
                    break;
                case "b":
                    adj = "v";
                    break;
                case "c":
                    adj = "w";
                    break;
                case "d":
                    adj = "x";
                    break;
                case "e":
                    adj = "y";
                    break;
                case "f":
                    adj = "z";
                    break;
                //maiusculas
                case "G":
                    adj = "A";
                    break;
                case "H":
                    adj = "B";
                    break;
                case "I":
                    adj = "C";
                    break;
                case "J":
                    adj = "D";
                    break;
                case "K":
                    adj = "E";
                    break;
                case "L":
                    adj = "F";
                    break;
                case "M":
                    adj = "G";
                    break;
                case "N":
                    adj = "H";
                    break;
                case "O":
                    adj = "I";
                    break;
                case "P":
                    adj = "J";
                    break;
                case "Q":
                    adj = "K";
                    break;
                case "R":
                    adj = "L";
                    break;
                case "S":
                    adj = "M";
                    break;
                case "T":
                    adj = "N";
                    break;
                case "U":
                    adj = "O";
                    break;
                case "V":
                    adj = "P";
                    break;
                case "W":
                    adj = "Q";
                    break;
                case "X":
                    adj = "R";
                    break;
                case "Y":
                    adj = "S";
                    break;
                case "Z":
                    adj = "T";
                    break;
                case "A":
                    adj = "U";
                    break;
                case "B":
                    adj = "V";
                    break;
                case "C":
                    adj = "W";
                    break;
                case "D":
                    adj = "X";
                    break;
                case "E":
                    adj = "Y";
                    break;
                case "F":
                    adj = "Z";
                    break;

                case " ":
                    adj = " ";
                    break;
                case ".":
                    adj = ".";
                    break;
                default:
                    adj = ("  *** NESTE PONTO, UM CARACTER INFORMADO ESTA INCORRETO ");
            }

            nome.append(adj);

            mark++;

        }

        while (mark < dot);

        return nome.toString();

    }


}
