package java課題19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		dog.dogMethod();
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog kazu = new Dog();
		dog.kazuMethod();
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date nowDate = new Date();
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		String formatNowDate = now.format(nowDate);
		System.out.println(formatNowDate);
	}
}
