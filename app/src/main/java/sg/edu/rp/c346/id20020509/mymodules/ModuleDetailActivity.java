package sg.edu.rp.c346.id20020509.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvModuleDetail;
    Button btBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        Intent intentReceived = getIntent();
        String moduleDetail = intentReceived.getStringExtra("module");

        tvModuleDetail = findViewById(R.id.tvModuleDetail);
        btBack = findViewById(R.id.btBack);

        if(moduleDetail.equals("C203")) {
            tvModuleDetail.setText("Module Code: " + moduleDetail
                    + "\nModule Name: Web App Development in PHP"
                    + "\nAcademic Year: 2021"
                    + "\nSemester: 1"
                    + "\nModule Credit: 4"
                    + "\nVenue: W67L");
        }
        else if(moduleDetail.equals("C228")) {
            tvModuleDetail.setText("Module Code: " + moduleDetail
                    + "\nModule Name: Operating Systems Security"
                    + "\nAcademic Year: 2021"
                    + "\nSemester: 1"
                    + "\nModule Credit: 4"
                    + "\nVenue: E62L");
        }
        else if(moduleDetail.equals("C328")) {
            tvModuleDetail.setText("Module Code: " + moduleDetail
                    + "\nModule Name: Intelligent Networks"
                    + "\nAcademic Year: 2021"
                    + "\nSemester: 1"
                    + "\nModule Credit: 4"
                    + "\nVenue: E62C");
        }
        else if(moduleDetail.equals("C331")) {
            tvModuleDetail.setText("Module Code: " + moduleDetail
                    + "\nModule Name: Digital Security and Forensics"
                    + "\nAcademic Year: 2021"
                    + "\nSemester: 1"
                    + "\nModule Credit: 4"
                    + "\nVenue: E61J");
        }
        else if(moduleDetail.equals("C346")) {
            tvModuleDetail.setText("Module Code: " + moduleDetail
                    + "\nModule Name: Mobile App Development"
                    + "\nAcademic Year: 2021"
                    + "\nSemester: 1"
                    + "\nModule Credit: 4"
                    + "\nVenue: E62E");
        }
        else if(moduleDetail.equals("G953")) {
            tvModuleDetail.setText("Module Code: " + moduleDetail
                    + "\nModule Name: Life Skills III"
                    + "\nAcademic Year: 2021"
                    + "\nSemester: 1"
                    + "\nModule Credit: 1"
                    + "\nVenue: HBL");
        }
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}