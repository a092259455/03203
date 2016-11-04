package tw.com.a4040e032.a03203;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText aa;
    private EditText bb;
    private EditText cc;
    private EditText ff;
    private Button dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
   private void findViews(){
       dd = (Button) findViewById(R.id.dd);
       aa = (EditText)findViewById(R.id.aa) ;
       bb = (EditText)findViewById(R.id.bb) ;
       cc = (EditText)findViewById(R.id.cc) ;
       ff = (EditText)findViewById(R.id.ff) ;


   }
    private boolean isValid(EditText editText){
        String pattern = "1[0]{2}|[0-9]{1,2}";
        String text = editText.getText().toString();
        if (!text.matches(pattern)){
            editText.setError("0  ~  100");
            return false;
        }else {
            return true;
        }
    }
    public void onSubmitCLick(View view){
        boolean isValid =
                isValid(aa) & isValid(bb) & isValid(cc) & isValid(ff);
        if (!isValid){
            return;
        }
        Button nextPageBtn = (Button)findViewById(R.id.dd);
        nextPageBtn.setOnClickListener(new View.OnClickListener(){
                                           @Override
                                           public void onClick(View v){
                                               Intent intent = new Intent();
                                               Bundle bundle = new Bundle();
                                               int a1= Integer.parseInt(aa.getText().toString());//轉成數字型態
                                               int a2= Integer.parseInt(bb.getText().toString());
                                               int a3= Integer.parseInt(cc.getText().toString());
                                               int a4= Integer.parseInt(ff.getText().toString());
                                               int sum = a1+a2+a3+a4;
                                               float average = sum/4;
           /*bundle.putString("這個變數名稱",哪來的資料);*/
                                               bundle.putString("ch1",aa.getText().toString());//國
                                               bundle.putString("ch2",bb.getText().toString());//英
                                               bundle.putString("ch3",cc.getText().toString());//數
                                               bundle.putString("ch4",ff.getText().toString());//android
                                               bundle.putInt("ch4",sum);//總和
                                               bundle.putFloat("ch5",average);//平均


                                               intent.setClass(MainActivity.this ,main2.class);
                                               intent.putExtras(bundle);
                                               startActivity(intent);
                                           }
                                       }

        );

    }

}
