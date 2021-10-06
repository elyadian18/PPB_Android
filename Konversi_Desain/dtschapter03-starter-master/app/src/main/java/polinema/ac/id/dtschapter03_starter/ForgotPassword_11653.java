package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword_11653 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password11653);
    }
    public void postSendRequest(View view){
        Intent i = new Intent(ForgotPassword_11653.this, ResetPassword_11653.class);
        startActivity(i);
    }
}