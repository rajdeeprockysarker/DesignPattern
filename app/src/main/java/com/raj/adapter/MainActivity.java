package com.raj.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.raj.adapter.builder.Phone;
import com.raj.adapter.com.adapter.AndroidCharger;
import com.raj.adapter.com.adapter.AndroidPhone;
import com.raj.adapter.com.adapter.AndroidToIPhoneAdapter;
import com.raj.adapter.com.adapter.IPhone;
import com.raj.adapter.com.adapter.IPhoneCharger;
import com.raj.adapter.com.adapter.IPhoneX;
import com.raj.adapter.com.adapter.OnePlus5;
import com.raj.adapter.facade.FacadePhone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Arrays.asList();

        AndroidCharger androidCharger = new AndroidCharger();
        AndroidPhone androidPhone = new OnePlus5();
        androidCharger.charge(androidPhone);

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhoneX();
        iPhoneCharger.charge(iPhone);

        AndroidToIPhoneAdapter adapter = new AndroidToIPhoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);

        ///------------------------------------------------------------------------
        Phone phone = new Phone.Builder()
                .backPanel("Sandstone")
                .frontPanel("AMOLED")
                .camera("12 MP")
                .processor("Snapdragon 625")
                .build();



        System.out.println(phone);
        /*
           Immutable
           inner static class
         */
      //----------------------------------------------------------------------------------------


        FacadePhone facadePhone = new FacadePhone();

        System.out.println(facadePhone.buildAndroidPhone());
        System.out.println(facadePhone.buildApplePhone());



    }
}
