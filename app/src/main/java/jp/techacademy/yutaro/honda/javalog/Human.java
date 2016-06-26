package jp.techacademy.yutaro.honda.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "人";
    static String hobby = "考えていること";
    int age;
    // コンストラクタ
    public Human(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }


    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは人クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)");
    }


        public void think() {
            Log.d("javatest","考えていること:" + this.hobby );
        }
    }
