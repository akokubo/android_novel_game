package jp.ac.aomori_u.kokubo.novelgame;

/**
 * シーンを表すクラス
 */
public class Scene {
    String title; // タイトル
    String body; // 本文
    int imageResource; // 画像のリソース
    Choice[] choices; // 選択肢

    // コンストラクタ
    Scene(String title, String body, int imageResource, Choice[] choices) {
        this.title = title;
        this.body = body;
        this.imageResource = imageResource;
        this.choices = choices;
    }
}
