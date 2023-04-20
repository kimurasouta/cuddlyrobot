/*

 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */

package java課題25b; /*実行*/

import java.util.Scanner;

import java課題25.Sub;

public class Theme2 {
	public static void main(String[] args) {
		// コンソールに出力
		System.out.println("コンソールに名前を入力してください。");
		
		// コンストラクタから読み込む
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		System.out.println("こんにちは 「" + name + "」 さん");
		
		// Subをインスタンス化
		Sub s = new Sub();
		s.Sub();
	}
}
