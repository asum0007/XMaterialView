package com.asum.xmaterialview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.asum.xmaterialview.view.MRelativeLayout;
import com.asum.xmaterialview.view.MTextView;

public class MaterialViewMainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_view_main);

        MTextView materialTextView = (MTextView) findViewById(R.id.material);
        materialTextView.setBackgroundColor(Color.BLUE);
        materialTextView.setText("GGGGGGGGGGGGGGGGGGGGGGG");
        materialTextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        findViewById(R.id.drawable).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        MRelativeLayout relativeLayout = (MRelativeLayout) findViewById(R.id.relativelayout);
        relativeLayout.setBackgroundColor(Color.RED);
    }
}
