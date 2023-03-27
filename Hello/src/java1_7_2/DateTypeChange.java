package java1_7_2;

public class DateTypeChange {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
//		　double型の変数をコンソールに出力して下さい。
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
//		　int型の変数をコンソールに出力して下さい。
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
//		　String型の変数をコンソールに出力して下さい。
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//		　int型の変数をコンソールに出力して下さい。
		
       double x = 2 + 6.0;
       System.out.println(x);
       
       int y = (int)x;
       System.out.println(y);
       
       String z = String.valueOf(y);
       System.out.println(z);
       
       y = Integer.parseInt(z);
       System.out.println(y);
	}

}
