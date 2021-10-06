package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResetPassword_11653 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password11653);
    }
    public void postChangeRequest(View view){
        Intent i = new Intent(ResetPassword_11653.this, SuccessActivity_11653.class);
        startActivity(i);
    }
}