package java課題26_28b;

public class Sub {

		public void setSub(String[] data) {
		AnimalData sub = new AnimalData();

		sub.setAnimalData(data);
		
		String[][] animal_data = new String[6][];
		 animal_data[0] = data[0].split(":");
		 animal_data[1] = data[1].split(":");
		 animal_data[2] = data[2].split(":");
		 animal_data[3] = data[3].split(":");
		 animal_data[4] = data[4].split(":");
		 animal_data[5] = data[5].split(":");
		
		//出力
		for(int i = 0; i < 6; i++) {
			
		System.out.println("動物名:" + animal_data[i][0]);
		System.out.println("体長：" + animal_data[i][1] + "m");
		System.out.println("速度：" + animal_data[i][2] + "km/h");
		
		if(animal_data[i][0].equals("ライオン")) {	
		System.out.println("学名：バンテラ レオ");
		System.out.println("");
		}else if(animal_data[i][0].equals( "ゾウ")) {
		System.out.println("学名：ロキソドンタ・サイクロティス");
		System.out.println("");
		}else if(animal_data[i][0].equals("パンダ")) {
		System.out.println("学名：アイルロポダ・メラノレウカ");
		System.out.println("");
		}else if(animal_data[i][0].equals("チンパンジー")) {
		System.out.println("学名：パン・トゥログロディテス");
		System.out.println("");
		}else if(animal_data[i][0].equals("シマウマ")) {
		System.out.println("学名：チャップマンシマウマ");
		System.out.println("");
		}else if(animal_data[i][0].equals("インコ")) {
		System.out.println("学名：不明");
		System.out.println("");
		}
	}

		}
}