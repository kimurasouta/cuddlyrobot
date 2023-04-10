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
		Animal animal = new Animal();
		String a = "動物名：ライオン";
		animal.setAnimal(a);
		System.out.println(animal.getAnimal());
		
		Length length = new Length();
		String b = "体長：2.1m";
		length.setLength(b);
		System.out.println(length.getLength());
		
		Speed speed = new Speed();
		String c = "速度：80km/h";
		speed.setSpeed(c);
		System.out.println(speed.getSpeed());
	}
}