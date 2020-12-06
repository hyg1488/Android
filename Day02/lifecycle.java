package com.example.mylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Log 는 오류의 위치를 확인하거나 컴파일시의 경로 확인 등을 위해
    // logcat 영역에 출력하는 디버깅 클래스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i( "MY", "-- onCreate() --");

        // onCreate() 는 애플리케이션을 호출시, 최초 딱 한번만 호출되는 메서드
    }

   @Override
    protected void onStart() {
        super.onStart();
        Log.i( "MY", "-- onStart() --");

        // onStart() 는 화면이 현재 엑티비티로 넘어오면 그때마다 호출되는 메서드

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i( "MY", "-- onResume() --");

        // onResume 은 화면이 현재 엑티비티로 넘어오면 그때마다 호출되는 메서드
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "MY", "-- onPause() --");

        // onPause 는 애플리케이션 홈버튼을 누를시 애플리케이션을 일시 정지
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "MY", "-- onStop() --");
        // onStop 은 애플리케이션 홈버튼을 누를시 애플리케이션을 정지
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i( "MY", "-- onRestart() --");
        // 어플을 다시 실행시, 일시정지된 어플을 다시 시작 + onStart + onResume
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "MY", "-- onDestroy() --");

        // onDestroy 는 어플을 뒤로가기 누를시, 어플이 완전히 종료 되었을때 단 한번만 호출
    }

    // 총 7개 오버라이딩
    
    // 앱 실행
    // onCreate() --> 앱을 실행 시켰을때 단 한번  호출
    // onStart()  
    // onResume()
    
    //홈 버튼 클릭시
    // onPause()
    // onStop()
    
    //다시 앱으로 복귀
    // onRestart()
    // onStart()
    // onResume()
    
    // 뒤로가기 버튼을 통해서 앱을 완전히 종료
    // onPause()
    // onStop()
    // onDestroy() --> 앱이 완전히 종료되었을때 딱 한번 호출
}
