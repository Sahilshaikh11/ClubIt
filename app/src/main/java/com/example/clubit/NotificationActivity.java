package com.example.clubit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class NotificationActivity extends AppCompatActivity {

    ListView listView;
    String[] dname = {"WebDev","AppDev","AI/ML","BlockChain","DevOps",
            "DataScience","Data","Cloud","CyberSecurity","Designing","Iot"};
    String[] topic = {"Responsive Web Design", "Mobile App Testing", "Predictive Analytics", "Decentralized Ledger Technology", "Continuous Integration and Deployment",
            "Predictive Modeling", "Data Management", "Cloud Computing", "Network Security", "User Experience (UX) Design", "Smart Home Automation"};
    String[] content = {"Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration.","Predictive analytics, blockchain, cloud, IoT: Secure data, automation, seamless integration."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        listView=findViewById(R.id.list);
        NotificationAdapter notificationAdapter = new NotificationAdapter(this,dname,topic,content);
        listView.setAdapter(notificationAdapter);
    }
}