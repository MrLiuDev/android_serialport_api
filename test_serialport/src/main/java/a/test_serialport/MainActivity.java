package a.test_serialport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnOpen;
    private FileOutputStream fileOutputStream;
    private FileInputStream fileInputStream;
    private SerialPort serialPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = (Button) findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_open:
                try {
                    serialPort = new SerialPort(new File("/dev/ttyS2"), 9600, 0);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
