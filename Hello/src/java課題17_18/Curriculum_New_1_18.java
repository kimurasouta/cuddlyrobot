package java課題17_18;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	Hello("Hello javaSE", 11);
	System.out.println("");
	
	   //Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	Keisan(2, 4);
	System.out.println("");
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	int[] c = {1, 2, 3};
	Hairetu(c);
	System.out.println("");
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	Keisan(1.2, 1.3);
	System.out.println("");
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
	int back[] =Mesotto(3);
	System.out.println("");
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
	 double over = Hikisuu(back);
	 System.out.println("");
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	if(over > 49) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	}
	
	/*Q1*/ private static void Hello(String x, int y) {
		System.out.println(x + " " + y); 
	}
	
	/*Q2*/ private static void Keisan(int a, int b) {
		System.out.println(a * b);
	}
	/*Q3*/  private static void Hairetu(int c[]) {
		for(int d = 0; d < 3; d++) {
			System.out.println(c[d]);
		}
	}
	/*Q4*/ private static void Keisan(double e, double f) {
		System.out.println(e + f);
	}
	/*Q5*/ private static int[] Mesotto(int h) {
		int z[] = new int [h];
		
		for(int i = 0; i < h; i++) {
			Random rand = new Random();
			int num = rand.nextInt(101) +1;
			System.out.println(num);
			z[i] = num;
		}
		return z;
	}
	
	/*Q6*/ private static double Hikisuu(int l[]) {
		 int k = 0;
			double sum = 0;
			while(true) {
				sum = sum + l[k];
				k++;
				
				if(k == l.length) {
					break;
				}
			}
			System.out.println(sum / l.length);
			return sum / l.length;
	}
}
    






