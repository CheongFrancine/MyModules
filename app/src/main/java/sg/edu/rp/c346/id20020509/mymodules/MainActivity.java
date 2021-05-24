package sg.edu.rp.c346.id20020509.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView tvC203;
    TextView tvC228;
    TextView tvC328;
    TextView tvC331;
    TextView tvC346;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        tvC203 = findViewById(R.id.tvC203);
        tvC228 = findViewById(R.id.tvC228);
        tvC328 = findViewById(R.id.tvC328);
        tvC331 = findViewById(R.id.tvC331);
        tvC346 = findViewById(R.id.tvC346);
        tvG953 = findViewById(R.id.tvG953);

        //Event handling Step 3
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C203");
                startActivity(intent);
            }
        });
        tvC228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C228");
                startActivity(intent);
            }
        });
        tvC328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C328");
                startActivity(intent);
            }
        });
        tvC331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C331");
                startActivity(intent);
            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C346");
                startActivity(intent);
            }
        });
        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "G953");
                startActivity(intent);
            }
        });
    }
}