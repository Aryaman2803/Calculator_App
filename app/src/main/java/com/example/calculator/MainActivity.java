package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    boolean hasdot;
    TextView inputScreen, signScreen;
    private String value1 = "";
    private String value2 = "";
    private double num1 = 0;
    private double num2 = 0;
    private String sign = "";
    private double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hasdot = false;


        inputScreen = findViewById(R.id.input);
        signScreen = findViewById(R.id.sign);

        Button btnLog = findViewById(R.id.btnLog);
        Button btnLn = findViewById(R.id.btnLn);
        Button btnLSquare = findViewById(R.id.btnSquare);
        Button btnRoot = findViewById(R.id.btnRoot);
        Button btnFactorial = findViewById(R.id.btnFactorial);
        Button btnSin = findViewById(R.id.btnSin);
        Button btnCos = findViewById(R.id.btnCos);
        Button btnTan = findViewById(R.id.btnTan);
        Button btnPlusSign = findViewById(R.id.btnPlusSign);
        Button btnMinusSign = findViewById(R.id.btnMinusSign);
        Button btnMultiplySign = findViewById(R.id.btnMultiplySign);
        Button btnDivideSign = findViewById(R.id.btnDivideSign);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btn00 = findViewById(R.id.btn00);
        ImageButton btnBackspace = findViewById(R.id.btnBackspace);
        Button btnDeleteSign = findViewById(R.id.btnDeleteSign);
        Button btnDotSign = findViewById(R.id.btnDotSign);

        Button btnEqualsSign = findViewById(R.id.btnEqualsSign);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "0");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signScreen.setText(signScreen.getText() + "00");
            }
        });
        btnDotSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!hasdot)
                    if (inputScreen.getText().equals("")) {
                        inputScreen.setText("0.");
                    } else {
                        inputScreen.setText(inputScreen.getText() + ".");
                    }
            }
        });
        /**
         // Symbols
         **/

        btnPlusSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = signScreen.getText().toString();
                inputScreen.setText(value1);
                signScreen.setText("+");
                sign = "+";
                hasdot = false;
            }
        });
        btnMinusSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = signScreen.getText().toString();
                inputScreen.setText(value1);
                signScreen.setText("-");
                sign = "-";
                hasdot = false;
            }
        });
        btnMultiplySign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = signScreen.getText().toString();
                inputScreen.setText(value1);
                signScreen.setText("*");
                sign = "*";
                hasdot = false;
            }
        });
        btnDivideSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = signScreen.getText().toString();
                inputScreen.setText(value1);
                signScreen.setText("÷");
                sign = "÷";
                hasdot = false;
            }
        });
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (signScreen.getText().equals("")) {
                    signScreen.setText(null);
                } else {
                    int len = signScreen.getText().length();
                    String s = signScreen.getText().toString();
                    if (s.charAt(len - 1) == '.') {
                        hasdot = false;
                        signScreen.setText(signScreen.getText().subSequence(0, signScreen.getText().length() - 1));
                    } else {
                        signScreen.setText(signScreen.getText().subSequence(0, signScreen.getText().length() - 1));
                    }
                }
            }
        });
        btnDeleteSignx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputScreen.setText(null);
                signScreen.setText(null);
                value1 = null;
                value2 = null;
            }
        });

        btnEqualsSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                else if(signScreen.getText() != "" && sign ==""){
//                    inputScreen.setText(signScreen.getText());
//                    signScreen.setText("");
//                }
//                else if (signScreen.getText() != "" && sign != "") {
//                    value2 =signScreen.getText().toString();
//
//                    //Convert value1 to double for conversion
//                     num1 = Double.parseDouble(value1);
//                     //Convet value2 to double for conversion
//                     num2 = Double.parseDouble(value2);
//
//                     double result;
//
//                     switch (sign){
//                         case "*":
//                             result = num1 * num2;
//                             inputScreen.setText(result +"");
//                             signScreen.setText("");
//                             sign = "";
//                             break;
//                     }
//            }


                if (inputScreen.getText() == "") {
                    signScreen.setText("Error");
                } else if (sign != null) {
                    if (inputScreen.getText() != "Error") {

                        value2 = signScreen.getText().toString();
                        value2 = value2.substring(1);
                        num1 = Double.parseDouble(value1);
                        num2 = Double.parseDouble(value2);

                        inputScreen.setText("");

                        switch (sign) {
                            default:
                                break;
                            case "+":
                                result = num1 + num2;
                                inputScreen.setText(result + "");
                                sign = "";
                                signScreen.setText("");
                                break;
                            case "-":
                                result = num1 - num2;
                                inputScreen.setText(result + "");
                                sign = "";
                                signScreen.setText("");
                                break;
                            case "*":
                                result = num1 * num2;
                                inputScreen.setText(result + "");
                                sign = "";
                                signScreen.setText("");
                                break;
                            case "÷":
                                result = num1 / num2;
                                inputScreen.setText(result + "");
                                sign = "";
                                signScreen.setText("");
                                break;
                        }
                    }
                }

            }


        });


    }
}
