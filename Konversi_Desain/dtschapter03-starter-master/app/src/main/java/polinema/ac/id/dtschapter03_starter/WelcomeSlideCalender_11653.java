package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalender_11653 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calender11653);
    }
    public void clickGetStarted (View view){
        Intent i = new Intent(WelcomeSlideCalender_11653. this, WelcomeSlideSuperhero_11653.class);
        startActivity(i);

    }

    public void clickLogin(View view){
        Intent i =new Intent(WelcomeSlideCalender_11653.this, WelcomeBack_11653.class);
        startActivity(i);
    }
}