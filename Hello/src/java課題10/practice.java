/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
					*/
package java課題10;

public class practice {

	public static void main(String[] args) {
		int i;
   
		for(i = 1; i < 21; i = i + 2) {
		System.out.println(i + 2);
		}
	}

}