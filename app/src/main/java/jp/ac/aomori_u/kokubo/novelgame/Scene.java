package jp.ac.aomori_u.kokubo.novelgame;

/**
 * シーンを表すクラス
 */
public class Scene {
    String title; // タイトル
    String body; // 本文
    Choice[] choices; // 選択肢

    // コンストラクタ
    Scene(String title, String body, Choice[] choices) {
        this.title = title;
        this.body = body;
        this.choices = choices;
    }
}
