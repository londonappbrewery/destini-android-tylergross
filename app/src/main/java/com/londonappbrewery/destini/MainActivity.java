package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button buttonTop;
    Button buttonBottom;
    TextView storyTextView;
    String gameReset = "Click to Reset Game!";
    int userDepth = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);


        buttonTop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                switch(userDepth){
                    case 1:
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setText(R.string.T3_Ans2);
                        storyTextView.setText(R.string.T3_Story);
                        userDepth = 2;
                        break;
                    case 2:
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setText(gameReset);
                        storyTextView.setText(R.string.T6_End);
                        userDepth = 5;
                        break;
                    case 3:
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setText(R.string.T3_Ans2);
                        storyTextView.setText(R.string.T3_Story);
                        userDepth = 2;
                        break;
                    default:
                        break;
                }
            }

        });

        buttonBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                switch(userDepth){
                    case 1:
                        buttonTop.setText(R.string.T2_Ans1);
                        buttonBottom.setText(R.string.T2_Ans2);
                        storyTextView.setText(R.string.T2_Story);
                        userDepth = 3;
                        break;
                    case 2:
                        storyTextView.setText(R.string.T5_End);
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setText(gameReset);
                        userDepth = 5;
                        break;
                    case 3:
                        storyTextView.setText(R.string.T4_End);
                        buttonTop.setVisibility(View.GONE);
                        buttonBottom.setText(gameReset);
                        userDepth = 5;
                        break;
                    case 5:
                        storyTextView.setText(R.string.T1_Story);
                        buttonTop.setVisibility(View.VISIBLE);
                        buttonTop.setText(R.string.T1_Ans1);
                        buttonBottom.setText(R.string.T1_Ans2);
                        userDepth = 1;
                        break;
                    default:
                        break;


                }
            }


        });



    }


}
