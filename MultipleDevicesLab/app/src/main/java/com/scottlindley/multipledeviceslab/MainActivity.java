package com.scottlindley.multipledeviceslab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private ImageView mImageView;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        int orientation = getResources().getConfiguration().orientation;
        if(orientation== 1){
            setContentView(R.layout.activity_main);
        }else if (orientation==2){
            setContentView(R.layout.layout_land);
        }
        mButton = (Button)findViewById(R.id.my_button);
        mImageView = (ImageView)findViewById(R.id.my_icon);
        mTextView = (TextView) findViewById(R.id.QandA_text);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mImageView.setImageResource(R.drawable.ic_my_mood_black_24dp);
                mTextView.setText(R.string.answer_text);
            }
        });
        super.onResume();
    }
}
