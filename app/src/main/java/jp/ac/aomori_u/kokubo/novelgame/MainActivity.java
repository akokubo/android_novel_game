package jp.ac.aomori_u.kokubo.novelgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // シーン
    Scene[] scenes;

    // 画面のパーツ
    TextView title, body; // タイトルと本文
    Button[] buttons; // ボタン

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // シーンを9つ作る
        scenes = new Scene[9];

        Choice[] choices = new Choice[1];
        choices[0] = new Choice(1, "次へ");
        scenes[0] = new Scene("シーン0", "ノベルゲーム「桃太郎 〜if〜」", choices);

        choices = new Choice[2];
        choices[0] = new Choice(2, "桃を拾う");
        choices[1] = new Choice(3, "拾わない");
        scenes[1] = new Scene("シーン1", "むかしむかし、あるところにおじいさんとおばあさんがいました。おじいさんは山へ芝刈りに、おばあさんは川へ洗濯に行きました。おばあさんが川で洗濯をしていると、大きな桃がドンブラコ、ドンブラコと流れてきました。おばあさんは…", choices);

        choices = new Choice[2];
        choices[0] = new Choice(4, "きびだんごを持つ");
        choices[1] = new Choice(5, "持たない");
        scenes[2] = new Scene("シーン2", "家に帰って、大きな桃を食べようとして包丁で切ると、中から玉のような赤ちゃんが出てきました。赤ちゃんは、桃から生まれたので、桃太郎と名づけられました。…月日は流れ、桃太郎は、成長しました。ある日、鬼が島というところから鬼がやってきて、村人たちを襲い、苦しめているという話を桃太郎は聞きました。「よっし、オラ、鬼をやっつけてくるよ！」すると、おばあさんが、桃太郎にきびだんごを作ってくれました。桃太郎は…", choices);

        choices = new Choice[2];
        choices[0] = new Choice(6, "鬼が島へ鬼退治に行く");
        choices[1] = new Choice(7, "行かない");
        scenes[3] = new Scene("シーン3", "おばあさんが、腰を抜かしている間に桃は流れていきました。…月日は流れ、鬼が島から鬼がやってきて、村人たちを襲うようになりました。そんなある日、おばあさんが、桃太郎とかいう鬼のボスに、とても口では言えないようなひどい目にあわされました。おじいさんは…", choices);

        choices = new Choice[1];
        choices[0] = new Choice(8, "次へ");
        scenes[4] = new Scene("シーン4", "「ありがとう。オラ、必ず鬼をやってつけてくるよ」桃太郎は、喜び勇んで出かけました。そして、道中できびだんごを使って、イヌ、サル、キジを家来にすることに成功します。桃太郎は、鬼が島に到着すると、１人＋３匹の連携プレイで、一気に鬼をたたんでしまいました。鬼は、もう悪いことはしないと誓い、宝物を差し出しました。桃太郎は、宝物を持って帰り、おじいさんやおばあさんとしあわせに暮らしました。", choices);

        choices = new Choice[1];
        choices[0] = new Choice(8, "次へ");
        scenes[5] = new Scene("シーン5", "（うわ、おばあさんのきびだんごは、とってもまずいんだ。）桃太郎は、適当にごまかして、その場をダッシュで逃げ出しました。あんまりあわてていたので、着の身、着のまま鬼が島に到着する羽目に陥りました。お腹もペコペコで、鬼に発見されて、いきなりボコられてしまいます。かくして、桃太郎は鬼のパシリにされ、今日も村の子供たちのおこずかいをカツアゲして生活しています。おじいさんとおばあさんは、恥ずかしくて夜逃げしてしまいました。おばあさん、もっとおいしいきびだんごが作れたらよかったのにね。", choices);

        choices = new Choice[1];
        choices[0] = new Choice(8, "次へ");
        scenes[6] = new Scene("シーン6", "おじいさんの目が、静かな怒りに燃えています。おじいさんは、単身、鬼が島に降り立ち、鬼のボスの桃太郎に一騎打ちを申し込みます。「じじい、貴様に身の程を教えてやろう」うわ、いかにも負けそうなヤツの台詞です。案の定、桃太郎はおじいさんに倒されてしまいます。実は、おじいさんとは世を忍ぶ仮の姿、本当は宇宙からやってきたＺ戦士だったのです。世界に平和は戻り、そしてこの話は、誰からともなくひろまり、おじいさんは伝説となりました。", choices);

        choices = new Choice[1];
        choices[0] = new Choice(8, "次へ");
        scenes[7] = new Scene("シーン7", "おじいさんはとても悔しかったのですが、動こうとはしませんでした。「戦いからは、何も生まれないものじゃ」そうしているうちに、鬼はどんどん勢力を拡大し、世界を征服してしまいました。鬼が島では、毎夜、奴隷となった人間の虐殺の宴が開かれ、阿鼻叫喚の地獄が実現してしまいました。", choices);

        choices = new Choice[1];
        choices[0] = new Choice(0, "最初へ");
        scenes[8] = new Scene("シーン8", "ゲーム終了", choices);

        // タイトルを作る
        title = new TextView(this);
        title.setTextSize(20.0f);

        // 本文を作る
        body = new TextView(this);

        // ボタンを2つ作る
        buttons = new Button[2];
        buttons[0] = new Button(this);
        buttons[1] = new Button(this);

        // シーン0を画面に設定する
        int i = 0;
        // タイトルを設定する
        title.setText(scenes[i].title);
        // 本文を設定する
        body.setText(scenes[i].body);
        // ボタンを設定する
        setButton(buttons, scenes[i].choices);

        // リニアレイアウトを作り、画面のパーツをはめる
        LinearLayout ll;
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);
        ll.addView(title);
        ll.addView(body);
        ll.addView(buttons[0]);
        ll.addView(buttons[1]);
    }

    class ChoiceClickListener implements View.OnClickListener
    {
        int link; // リンク先

        // コンストラクタ
        ChoiceClickListener(int link) {
            this.link = link;
        }

        public void onClick(View v) {
            // タイトルを書き換える
            title.setText(scenes[link].title);
            // 本文を書き換える
            body.setText(scenes[link].body);
            // ボタンを書き換える
            setButton(buttons, scenes[link].choices);
        }
    }

    // ボタンを設定する/書き換える
    void setButton(Button[] buttons, Choice[] choices) {
        // ボタンを最大2つまで設定する
        for (int j = 0; j < 2; j++) {
            // 取り敢えず最初にボタンを非表示にする
            buttons[j].setVisibility(View.GONE);
            if (choices != null && choices.length > j) {
                // ボタンに選択肢の文字列を設定する
                buttons[j].setText(choices[j].text);
                // ボタンを表示する
                buttons[j].setVisibility(View.VISIBLE);
                // ボタンにイベントリスナーを設定する
                buttons[j].setOnClickListener(new ChoiceClickListener(choices[j].link));
            }
        }
    }
}
