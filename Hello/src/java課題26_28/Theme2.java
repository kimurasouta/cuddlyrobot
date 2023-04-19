/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
package java課題26_28;

import java.util.Scanner;

public class Theme2 {
	public static void main(String[] args) {
		
		/*Scannerでコンソールから入力を読み取るプログラム*/
		Scanner animal = new Scanner(System.in);
		System.out.println("動物名を入力");
		
		/*文字列トークン取得*/
		String line1 = animal.nextLine();
		
		
		System.out.println("体長を入力");
		
		/*ダブルトークン取得*/
		double line2 = animal.nextDouble();
		
		System.out.println("速度を入力");
		
		/*整数トークン取得*/
		int line3 = animal.nextInt();
		
		/*入力された文字列ごとに条件分岐して出力*/
		if (line1.equals("ライオン")) {
			System.out.println("動物名：" + line1 + "\n" + "体長：" + line2 + "m\n" + "速度：" + line3 + "km/h\n" + "学名：パンテラ レオ");
		}else if(line1.equals("ゾウ")) {
			System.out.println("動物名：" + line1 + "\n" + "体長：" + line2 + "m\n" + "速度：" + line3 + "km/h\n" + "学名：ロキソドンタ・サイクロティス");
		}else if(line1.equals("パンダ")) {
			System.out.println("動物名：" + line1 + "\n" + "体長：" + line2 + "m\n" + "速度：" + line3 + "km/h\n" + "学名：アイルロポダ・メラノレウカ");
		}else if(line1.equals("チンパンジー")) {
			System.out.println("動物名：" + line1 + "\n" + "体長：" + line2 + "m\n" + "速度：" + line3 + "km/h\n" + "学名：パン・トゥログロディテス");
		}else if(line1.equals("シマウマ")) {
			System.out.println("動物名：" + line1 + "\n" + "体長：" + line2 + "m\n" + "速度：" + line3 + "km/h\n" + "学名：チャップマンシマウマ");
		}else if(line1.equals("インコ")) {
			System.out.println("動物名：" + line1 + "\n" + "体長：" + line2 + "m\n" + "速度：" + line3 + "km/h\n" + "学名：不明");
		}
	}
}






