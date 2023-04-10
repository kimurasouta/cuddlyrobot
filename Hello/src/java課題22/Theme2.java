/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
package java課題22; /*実行*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Theme2 {

	public static void main(String[] args) {
		Japan welcome = new Japan("こんにちは！ここは日本です！", "この寿司はうまい", "寿司は和食です");

		Date nowDate = new Date();
		SimpleDateFormat now = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String formatNowDate = now.format(nowDate);

		System.out.println(welcome.hello);
		System.out.println(welcome.sushi);
		System.out.println(welcome.wasyoku);
		System.out.println("今の現在日時は"+ formatNowDate + "です");
	}
}
