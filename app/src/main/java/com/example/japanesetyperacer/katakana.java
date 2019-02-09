package com.example.japanesetyperacer;

import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class katakana extends AppCompatActivity {
    boolean ok=false;
    int randomId = new Random().nextInt(104)+0 ;
    String[] katakana={"ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ","ガ","ギ","グ","ゲ","ゴ","サ","シ","ス","セ","ソ","ザ","ジ","ズ","ゼ","ゾ","タ","チ","ツ","テ","ト","ダ","ヂ","ヅ","デ","ド","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","へ","ホ","バ","ビ","ブ","ベ","ボ","パ","ピ","プ","ペ","ポ","マ","ミ","ム","メ","モ","ヤ","ユ","ヨ","ラ","リ","ル","レ","ロ","ワ","ヲ","ン","キャ","キュ","キョ","ギャ","ギュ","ギョ","シャ","シュ","ショ","ジャ","ジュ","ジョ","チャ","チュ","チョ","ニャ","ニュ","ニョ","ヒャ","ヒュ","ヒョ","ビャ","ビュ","ビョ","ピャ","ピュ","ピョ","ミャ","ミュ","ミョ","リャ","リュ","リョ"};
    String[] romanji={"a" ,"i","u","e","o","ka","ki","ku","ke","ko","ga","gi","gu","ge","go","sa","shi","su","se","so","za","ji","zu","ze","zo","ta","chi","tsu","te","to","da","ji","zu","de","do","na","ni","nu","ne","no","ha","hi","fu","he","ho","ba","bi","bu","be","bo","pa","pi","pu","pe","po","ma","mi","mu","me","mo","ya","yu","yo","ra","ri","ru","re","ro","wa","wo","n","kya","kyu","kyo","gya","gyu","gyo","sha","shu","sho","ja","ju","jo","cha","chu","cho","nya","nyu","nyo","hya","hyu","hyo","bya","byu","byo","pya","pyu","pyo","mya","myu","myo","rya","ryu","ryo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.katakana);
        TextView kView = (TextView) findViewById(R.id.KView);
        kView.setText(katakana[randomId]);
    }
    public void onClick(View view)
    {
        String answer,answer2;
        EditText rView = (EditText) findViewById(R.id.RView);
        answer=rView.getText().toString();
        answer2=answer.toLowerCase();
        if(romanji[randomId].equals(answer2)) {
            Intent intent = new Intent(this, katakana.class);
            startActivity(intent);
            finish();
        } else {
            TextView aView = (TextView) findViewById(R.id.AView);
            aView.setText(romanji[randomId]);
            rView.setText("");
        }
    }
    public void onClick2(View view)
    {
        Intent intent = new Intent(this, hiragana.class);
        startActivity(intent);
        finish();
    }
}

