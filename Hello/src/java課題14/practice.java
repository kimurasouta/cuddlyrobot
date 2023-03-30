
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package java課題14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		string型の配列を作成し、アルファベットa～jまでを格納してください。
//		brake文を使用し、a～dまで表示してください。
	//	
//		 出力結果：a
//		           b
//		           c
//		           d
		String[] box = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int x = 0;
		while(true) {
			System.out.println(box[x]);
			x++;
		if(x == 4){
			break;
		}
		}
//		cotinue文を使用し、i以外を表示してください。
	//	
//		 出力結果：a
//		           b
//		           c
//		           d
//		           e
//		           f
//		           g
//		           h
//		           j
		System.out.println("");
		
		for(x = 0; x < 10; x++) {
			if(x == 8) {
				continue;
			}
			System.out.println(box[x]);
		}
		

	}

}
