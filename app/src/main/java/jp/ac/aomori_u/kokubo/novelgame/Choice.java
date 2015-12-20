package jp.ac.aomori_u.kokubo.novelgame;

/**
 * 選択肢を表すクラス
 */
public class Choice {
    int link; // リンク先
    String text; // 文字列

    // コンストラクタ
    Choice(int link, String text) {
        this.link = link;
        this.text = text;
    }
}
