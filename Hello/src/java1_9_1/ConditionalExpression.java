package java1_9_1;

import java.util.Random;

public class ConditionalExpression {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問２）
//		String型変数 name に任意の名前を入れて下さい。
//		int型変数 score に「0~100」までの乱数を代入して下さい。
//		もし score が 40点未満なら「〇〇さんは□□点です。もう少し頑張りましょう。」、
//		もし score が 40点以上、60点未満なら「〇〇さんは□□点です。もう少しでした。」、
//		もし score が 60点以上、80点未満なら「〇〇さんは□□点です。よくできました。」、
//		もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。
		String name = "木村颯太";
		Random rand = new Random();
	    int score = rand.nextInt(101);
	    if(score < 40) {
	    	System.out.println(name + "さんは" + score + "点です。もう少し頑張りましょう。");
	    }else if(40 <= score && score < 60) {
	    	System.out.println(name + "さんは" + score + "点です。もう少しでした。");
	    }else if(60 <= score && score < 80) {
	    	System.out.println(name + "さんは" + score + "点です。よくできました。");
	    }else {
	    	System.out.println(name + "さんは" + score + "点です。たいへんよくできました。");
	    }
	}

}
