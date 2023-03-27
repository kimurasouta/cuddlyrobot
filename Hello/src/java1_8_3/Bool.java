package java1_8_3;

public class Bool {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問４）
//		以下の変数を使ってboolean型変数 result_4 に「変数 g の値は5以下 または 変数 g の値は10以上」という条件式を代入して下さい。
//		boolean型変数 result_4 をコンソールに出力して下さい。
		int g = 7;
		
		boolean result_4;
		result_4 = (g <= 5 || g >= 10);
		System.out.println(result_4);
	}

}
