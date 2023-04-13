/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package java課題23;

public class Theme2 {
	public static void main(String[] args) {
		animalBean animalBean = new animalBean();
		String a = "動物名：ライオン" ;
		String b = "体長：2.1m" ;
		String c = "速度：80km/h" ;
		animalBean.setAnimalName(a);
		animalBean.setSpeed(b);
		animalBean.setBodyLength(c);
		System.out.println(animalBean.getAnimalName());
		System.out.println(animalBean.getSpeed());
		System.out.println(animalBean.getBodyLength());
		
	}
}