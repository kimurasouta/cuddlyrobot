package java課題26_28;

public class AnimalData {
		
		private String[] animalData;
		
		//getter
		public  String[] getAnimalData(){
			return animalData;
		}
		
		//setter
		public void setAnimalData(String[] animalData) {
			this.animalData = animalData;
			
			//:区切りで配列を生成
			String[] animal_data0 = animalData[0].split(":");
			String[] animal_data1 = animalData[1].split(":");
			String[] animal_data2 = animalData[2].split(":");
			String[] animal_data3 = animalData[3].split(":");
			String[] animal_data4 = animalData[4].split(":");
			String[] animal_data5 = animalData[5].split(":");
			
			//出力
			System.out.println("動物名:" + animal_data0[0]);
			System.out.println("体長：" + animal_data0[1] + "m");
			System.out.println("速度：" + animal_data0[2] + "km/h");
			System.out.println("学名：バンテラ レオ");
			System.out.println("");
			
			System.out.println("動物名:" + animal_data1[0]);
			System.out.println("体長：" + animal_data1[1] + "m");
			System.out.println("速度：" + animal_data1[2] + "km/h");
			System.out.println("学名：ロキソドンタ・サイクロティス");
			System.out.println("");
			
			System.out.println("動物名:" + animal_data2[0]);
			System.out.println("体長：" + animal_data2[1] + "m");
			System.out.println("速度：" + animal_data2[2] + "km/h");
			System.out.println("学名：アイルロポダ・メラノレウカ");
			System.out.println("");
			
			System.out.println("動物名:" + animal_data3[0]);
			System.out.println("体長：" + animal_data3[1] + "m");
			System.out.println("速度：" + animal_data3[2] + "km/h");
			System.out.println("学名：パン・トゥログロディテス");
			System.out.println("");
			
			System.out.println("動物名:" + animal_data4[0]);
			System.out.println("体長：" + animal_data4[1] + "m");
			System.out.println("速度：" + animal_data4[2] + "km/h");
			System.out.println("学名：チャップマンシマウマ");
			System.out.println("");
			
			System.out.println("動物名:" + animal_data5[0]);
			System.out.println("体長：" + animal_data5[1] + "m");
			System.out.println("速度：" + animal_data5[2] + "km/h");
			System.out.println("学名：不明");
			System.out.println("");
		}
}
