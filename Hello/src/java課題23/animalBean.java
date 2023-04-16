package java課題23;

public class animalBean {
		 
	/*それぞれのフィールドを定義*/
	private String animalName;
	private String speed;
	private String bodyLength;
	
	/*getterメソッド*/
	public String getAnimalName() {
		return animalName;
	}
	
	/*setterメソッド*/
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	/*getterメソッド*/
	public String getSpeed() {
		return speed;
	}
	
	/*setterメソッド*/
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	/*getterメソッド*/
	public String getBodyLength() {
		return  bodyLength;
	}
	
	/*setterメソッド*/
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
}