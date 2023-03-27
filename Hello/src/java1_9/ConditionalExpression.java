package java1_9;

public class ConditionalExpression {
	public static void main(String[] args) {
//		問１）
//		boolean型変数 rain を宣言し、今日の天気が雨なら「true」雨でないなら「false」を代入して下さい。
//		もし rain が true ならコンソールに「DVDを見ます。」と false なら「外で遊びます。」と表示して下さい。
		
		boolean rain;
		rain = false;
		if(rain == true) {
		System.out.println("DVDを見ます。");
		}else {
		System.out.println("外で遊びます。");
		}
	}
}
