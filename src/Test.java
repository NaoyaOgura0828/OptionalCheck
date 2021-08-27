import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        /* 文字数のlength(長さ)を出力するコード */
        /** null回避のテスト */

        String str = null;
//        System.out.println(str.length()); // 実行するとNullPointerExceptionエラーになる

        Optional<String> strOpt = Optional.ofNullable(str); // nullかもしれないという宣言

        /* nullでない場合の分岐処理 */
        if(strOpt.isPresent()) {
            String message = strOpt.get();
            System.out.println(message.length());
        }

        /* nullでない場合の分岐処理 ラムダ式.ver */
        strOpt.ifPresent(v -> System.out.println(v.length())); // 変数vにstrで宣言した文字列を格納し、System.opt.println内で使用する。

    }
}
