package java課題25;

import java.util.Random;

public class Sub {
	public void Sub() {
		Theme3 the = new Theme3();
		
		// for文を使ってループさせる
		int status[] = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			status[i] = r.nextInt(999)+1;
		}
		
		// 配列を指定する
		the.setHp(status[0]);
		the.setMp(status[1]);
		the.setAttack(status[2]);
		the.setSpeed(status[3]);
		the.setDefense(status[4]);
		
		// コンソールに出力させる
		System.out.println("ステータス");
		System.out.println("HP ; " + the.getHp());
		System.out.println("MP : " + the.getMp());
		System.out.println("攻撃力 ; " + the.getattack());
		System.out.println("素早さ：" + the.getspeed());
		System.out.println("防御力：" + the.getdefense());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}
}