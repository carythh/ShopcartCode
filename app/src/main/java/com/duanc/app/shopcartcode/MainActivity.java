package com.duanc.app.shopcartcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.duanc.app.shopcart.AddMinusView;

public class MainActivity extends AppCompatActivity {

    private AddMinusView addMinusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addMinusView = (AddMinusView) findViewById(R.id.add);

        addMinusView
                .setInventory(20) //可购买上限
                .setOnNowNumListener(new AddMinusView.onNumListener() {
                    @Override
                    public void onNowNum(int pos) {
                        Toast.makeText(MainActivity.this, "" + pos, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
