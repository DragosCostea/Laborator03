package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import android.view.View;

public class PhoneDialerActivity extends AppCompatActivity {

    EditText editText = null;
    private class NumberButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            editText.setText(editText.getText().toString() + ((Button)view).getText().toString());
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        NumberButtonClickListener nbcl = new NumberButtonClickListener();
        editText = (EditText) findViewById(R.id.editText3);


        //LinearLayout container = (LinearLayout) findViewById(R.id.activity_phone_dialer);
        //container.addView(buttonOne);



        Button buttonZero = (Button) findViewById(R.id.button0);
        buttonZero.setOnClickListener(nbcl);
        Button buttonOne = (Button) findViewById(R.id.button1);
        buttonOne .setOnClickListener(nbcl);
        Button buttonTwo= (Button) findViewById(R.id.button2);
        buttonTwo.setOnClickListener(nbcl);


    }
}
