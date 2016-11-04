package tw.com.a4040e032.a03203;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main2 extends AppCompatActivity {
    private Button kk;
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        kk = (Button)findViewById(R.id.kk);
        tv2 =(TextView)findViewById(R.id.tv2);
        Bundle bundle = getIntent().getExtras();
        String text = "";
        text += "國文" + bundle.getString("ch1") + "\n";
        text += "英文 " + bundle.getString("ch2") + "\n";
        text += "數學 " + bundle.getString("ch3") + "\n";
        text += "總和" + bundle.getInt("ch4") + "\n";
        text += "平均" + bundle.getFloat("ch5") + "\n";
        tv2.setText(text);

    }

    public void bk(View view) {
        finish();
    }
}
