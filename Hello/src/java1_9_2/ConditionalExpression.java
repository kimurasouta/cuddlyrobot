package java1_9_2;

public class ConditionalExpression {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問３）
//		①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）
//		②変数 study を定義し、文字列 "カリキュラム" を代入する。
//		③もし変数 isTired が 0 であれば「私はとても元気です。」、そうでなければ「私は疲れています。」と表示する。
//		※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
//		④もし変数 isTired が 0 であれば、変数 study を利用して「カリキュラムを続けます。」と表示する。
		int isTired = 1;
		String study = "カリキュラム";
		
		if(isTired == 0) {
			System.out.println("私はとても元気です。");
		}
        System.out.println((isTired == 0) ? study + "を続けます。": "私は疲れています。");

	}

}
