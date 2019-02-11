package com.example.pupil.iskl;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int a = 10;
    int b = 0;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk=findViewById(R.id.btnOk);

    }



// исключение(в теге выдает ошибку)
    public void Iscl() {

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            Log.e("Error", e.getLocalizedMessage());
        } finally {
            Log.d("APP","CLOSE");
        }

    }
    private  void getMoney(){
        Account account = new Account(200,"login",123);
        SingleThread stOne = new SingleThread(account); SingleThread stTwo = new SingleThread(account);
        stOne.getMoneyFromAccount("login",123,150);
        stTwo.getMoneyFromAccount("login",123,150);
    }
}
