package com.example.yam.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int y = 1;
    Double x, sum = 0.0,sofi=0.0;
    String st1,st2;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);

    }


    public void plus(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("Error");
            Toast.makeText(this, "אסור לעשות פעולה בשורה ריקה", Toast.LENGTH_LONG).show();

        } else {
            if (et.getText().toString().equals(".")) {
                et.setText("Error");
                Toast.makeText(this, "אסור לשים . בלי כלום", Toast.LENGTH_LONG).show();
            } else {
                if (et.getText().toString().equals("-")) {
                    et.setText("Error");
                    Toast.makeText(this, "אסור לשים - בלי כלום", Toast.LENGTH_LONG).show();

                } else {
                    st1 = et.getText().toString();
                    x = Double.parseDouble(st1);
                    et.setText("");
                    if (y == 1) {
                        sum = sum + x;
                    } else {
                        if (y == 2) {
                            sum = sum - x;
                        } else {
                            if (y == 3) {
                                sum = sum * x;
                            } else {
                                if (x == 0) {
                                    Toast.makeText(this, "אסור לחלק ב0", Toast.LENGTH_LONG).show();

                                } else {

                                    sum = sum / x;
                                }
                            }
                        }
                    }
                }
            }
            et.setHint(Double.toString(sum));
        }

        y=1;
    }
    public void minus(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("Error");
            Toast.makeText(this, "אסור לעשות פעולה בשורה ריקה", Toast.LENGTH_LONG).show();

        } else {
            if (et.getText().toString().equals(".")) {
                et.setText("Error");
                Toast.makeText(this, "אסור לשים . בלי כלום", Toast.LENGTH_LONG).show();
            } else {
                if (et.getText().toString().equals("-")) {
                    et.setText("Error");
                    Toast.makeText(this, "אסור לשים - בלי כלום", Toast.LENGTH_LONG).show();

                } else {
                    st1 = et.getText().toString();
                    x = Double.parseDouble(st1);
                    et.setText("");
                    if (y == 1) {
                        sum = sum + x;
                    } else {
                        if (y == 2) {
                            sum = sum - x;
                        } else {
                            if (y == 3) {
                                sum = sum * x;
                            } else {
                                if (x == 0) {
                                    Toast.makeText(this, "אסור לחלק ב0", Toast.LENGTH_LONG).show();

                                } else {

                                    sum = sum / x;
                                }
                            }
                        }
                    }
                }
            }
            et.setHint(Double.toString(sum));
        }
        y = 2;
    }
    public void cefel(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("Error");
            Toast.makeText(this, "אסור לעשות פעולה בשורה ריקה", Toast.LENGTH_LONG).show();

        } else {
            if (et.getText().toString().equals(".")) {
                et.setText("Error");
                Toast.makeText(this, "אסור לשים . בלי כלום", Toast.LENGTH_LONG).show();
            } else {
                if (et.getText().toString().equals("-")) {
                    et.setText("Error");
                    Toast.makeText(this, "אסור לשים - בלי כלום", Toast.LENGTH_LONG).show();

                } else {
                    st1 = et.getText().toString();
                    x = Double.parseDouble(st1);
                    et.setText("");
                    if (y == 1) {
                        sum = sum + x;
                    } else {
                        if (y == 2) {
                            sum = sum - x;
                        } else {
                            if (y == 3) {
                                sum = sum * x;
                            } else {
                                if (x == 0) {
                                    Toast.makeText(this, "אסור לחלק ב0", Toast.LENGTH_LONG).show();

                                } else {

                                    sum = sum / x;
                                }                            }
                        }
                    }
                }
            }
            et.setHint(Double.toString(sum));
        }
        y = 3;
    }
    public void hiluk(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("Error");
            Toast.makeText(this, "אסור לעשות פעולה בשורה ריקה", Toast.LENGTH_LONG).show();

        } else {
            if (et.getText().toString().equals(".")) {
                et.setText("Error");
                Toast.makeText(this, "אסור לשים . בלי כלום", Toast.LENGTH_LONG).show();
            } else {
                if (et.getText().toString().equals("-")) {
                    et.setText("Error");
                    Toast.makeText(this, "אסור לשים - בלי כלום", Toast.LENGTH_LONG).show();

                } else {
                    st1 = et.getText().toString();
                    x = Double.parseDouble(st1);
                    et.setText("");
                    if (y == 1) {
                        sum = sum + x;
                    } else {
                        if (y == 2) {
                            sum = sum - x;
                        } else {
                            if (y == 3) {
                                sum = sum * x;
                            } else {
                                if (x == 0) {
                                    Toast.makeText(this, "אסור לחלק ב0", Toast.LENGTH_LONG).show();

                                } else {

                                    sum = sum / x;
                                }

                            }
                        }
                    }
                }
            }
            et.setHint(Double.toString(sum));
        }
        y = 4;
    }

    public void AC(View view) {
        et.setText("");
        et.setHint("0");
        y = 1;
        sum = 0.0;
        x = 0.0;



    }





    public void shave(View view) {
        if (et.getText().toString().equals("")) {
            et.setText("Error");
            Toast.makeText(this, "אסור לעשות פעולה בשורה ריקה", Toast.LENGTH_LONG).show();

        } else {
            if (et.getText().toString().equals(".")) {
                et.setText("Error");
                Toast.makeText(this, "אסור לשים . בלי כלום", Toast.LENGTH_LONG).show();
            } else {
                if (et.getText().toString().equals("-")) {
                    et.setText("Error");
                    Toast.makeText(this, "אסור לשים - בלי כלום", Toast.LENGTH_LONG).show();

                } else {
                    st1 = et.getText().toString();
                    x = Double.parseDouble(st1);
                    et.setText("");
                    if (y == 1) {
                        sum = sum + x;
                    } else {
                        if (y == 2) {
                            sum = sum - x;
                        } else {
                            if (y == 3) {
                                sum = sum * x;
                            } else {
                                if (x == 0) {
                                    Toast.makeText(this, "אסור לחלק ב0", Toast.LENGTH_LONG).show();

                                } else {

                                    sum = sum / x;
                                }
                            }
                        }
                    }
                }
            }
            et.setHint(Double.toString(sum));
        }
        sofi=sum;
        sum=0.0;
        y=1;
    }


    public void credit(View view) {
        Intent credit = new Intent(this, Credit.class);
        st2 = Double.toString(sofi);
        credit.putExtra("scum", st2);
        startActivity(credit);



    }
}








