package com.example.lenovo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//构建MainActivity主活动类，继承自AppCompatActivity。
public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    //private List<home_news> newsList =new ArrayList<>();

    //使用BottomNavigationView实现底部导航栏。
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);

                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_forum);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_mine);
                    return true;
            }
            return false;
        }
    };

    //覆写，OnCreate()不产生窗口，在窗口显示前设置窗口的成员属性。m开头。
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//用super调用父类的savedInstanceState，失去了焦点后仍保存。
        setContentView(R.layout.activity_main);//设置文本布局。

        //引入message的文本布局,通过findViewById方法获得TextView实例.
        mTextMessage = (TextView) findViewById(R.id.message);
        //引入导航栏布局,同上。
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //设置监听回调方法。即运行后返回已执行。
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        /**
        inithomenews();
        home_news_adapter adapter =new home_news_adapter(MainActivity.this,
                R.layout.activity_main_home,newsList);
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
         */

    }

    /**
    private void inithomenews(){
        for (int i=0;i<20;i++){
            home_news news1 =new home_news("newsA",R.drawable.login_picture1);
            newsList.add(news1);
        }

    }
     */

}
