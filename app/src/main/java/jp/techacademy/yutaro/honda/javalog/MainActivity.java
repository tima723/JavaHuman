package jp.techacademy.yutaro.honda.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; // ここを追加



    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            Human human = new Human("本多", 20);

            human.say();
            Log.d("javatest", "私の名前は" + human.name + "です。" + "歳は" + human.age + "歳です");
            human.think();

        }

    }