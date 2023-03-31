/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package java課題15;

public class Practice {

	public static void main(String[] args) {
//		①配列int test[][]に以下の成績を格納し、表示してください。
		int test[][] = new int[4][3];
		 test[0][0] = 64;
		 test[0][1] = 73;
		 test[0][2] = 69;
		 test[1][0] = 58;
		 test[1][1] = 81;
		 test[1][2] = 75;
		 test[2][0] = 86;
		 test[2][1] = 68;
		 test[2][2] = 79;
		 test[3][0] = 72;
		 test[3][1] = 55;
		 test[3][2] = 80;
		 
		 
		 for(int x = 0; x < 4; x++) {
			 int y = 0;
			 
				 System.out.println("生徒" + (x + 1) + ":" + "国語" + test[x][y] + "点、 " +  "数学" + test[x][y + 1] + "点、 " + "英語" + test[x][y + 2] + "点" );
			 }
		 
		 
		 System.out.println(" ");
		 
//		 ②それぞれの教科の平均点を表示してください。
//		 出力結果：国語の平均点は○○点です。
//		           数学の平均点は○○点です。
//		           英語の平均点は○○点です。
		 int sum_kokugo = 0;
		 int sum_sugaku = 0;
		 int sum_eigo = 0;
		 
		 int count = 0;
		 
		 for(int z = 0; z < 4; z++) {
			
			 sum_kokugo = sum_kokugo + test[z][0];
			 sum_sugaku = sum_sugaku + test[z][1];
			 sum_eigo = sum_eigo + test[z][2];
			 
			 count++;
		 }
		 
		 System.out.println("国語の平均点は" + sum_kokugo / count + "点です。");
		 System.out.println("数学の平均点は" + sum_sugaku / count + "点です。");
		 System.out.println("英語の平均点は" + sum_eigo / count + "点です。");
	}

}
