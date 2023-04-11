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
		String a = "動物名：ライオン\n体長：2.1m\n速度：80km/h" ;
		animalBean.setanimalBean(a);
		System.out.println(animalBean.getanimalBean());
	}
}