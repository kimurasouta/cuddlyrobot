package java1_6_2;

import java.util.Random;

public class Variable4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問３）
//		下記の例のような文章をコンソールに出力して下さい。
//		但し、年齢の部分は乱数を使用し実行毎に結果が変わるようにして下さい。
//		※数字は0～100までの間で表示されるようにしてください。
//		例）
//		あなたの年齢を予想します。
//		あなたの年齢はおそらく〇〇歳ですね？
		String message = "あなたの年齢を予想します";
		System.out.println(message);
		
		
		Random rand = new Random();
	    int num = rand.nextInt(100);
	    System.out.println("あなたの年齢はおそらく" + num + "歳ですね？");
	    
	    
	}

}
