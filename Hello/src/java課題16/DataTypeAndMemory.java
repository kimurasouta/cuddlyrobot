package java課題16;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
		char x = 'A';
		java.lang.System.out.println(x);

		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		String y = "Hello Java";
		java.lang.System.out.println(y);
			
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		int z = 3776;
		java.lang.System.out.println(z);

		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		double a = 3.14;
		java.lang.System.out.println(a);
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		int[] nums = {10, 100, 1000};
		java.lang.System.out.println(nums[1]);

		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		int[] b = nums;
		b[1] = 8;
		java.lang.System.out.println("nums[1] =" + nums[1] + "," + "b[1] =" + b[1] );

	}

}
