package matteo.eventapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void onClick(View v) {
        final TextView numberTextView = (TextView) findViewById(R.id.numberView);
        String num = numberTextView.getText().toString();
        int number = Integer.parseInt(num);
        switch (v.getId()){

            case R.id.plus1:
                number++;
                break;
            case R.id.minus1:
                number--;
                break;
            case R.id.molt:
                number*=2;
                break;
            case R.id.elevamento:
                number*=number;
                break;
        }
        numberTextView.setText(Integer.toString(number));
    }
}
