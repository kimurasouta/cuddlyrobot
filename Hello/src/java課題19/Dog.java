package java課題19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String dog = "犬";
	
	// Q2：フィールドに動物の数の変数を定義してください。
	int kazu = 4;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public void dogMethod() {
		System.out.println(dog);
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public void kazuMethod() {
		System.out.println(kazu);
	}
}
