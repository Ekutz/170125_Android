package com.jspark.android.activitycontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Button callCommon, callTrans;
    EditText edit1_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callCommon = (Button)findViewById(R.id.commonCaller);
        callTrans = (Button)findViewById(R.id.transCaller);
        edit1_1 = (EditText)findViewById(R.id.edit1);

        callCommon.setOnClickListener(listener);
        callTrans.setOnClickListener(listener);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.print("onStart 시작", TAG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.print("onResume 시작", TAG);
    }

    // Running

    @Override
    protected void onPause() {
        super.onPause();
        Logger.print("onPause 시작", TAG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.print("onStop 시작", TAG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.print("onRestart 시작", TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.print("onDestroy 시작", TAG);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.commonCaller :
                    Intent i = new Intent(MainActivity.this, CommonActivity.class);
                    i.putExtra("data", edit1_1.getText().toString());
                    startActivity(i);
                    break;
                case R.id.transCaller :
                    i = new Intent(MainActivity.this, TransparentActivity.class);
                    startActivity(i);
                    break;
            }
        }
    };


}
