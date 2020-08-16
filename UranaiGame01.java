package Uranaigame;

public class UranaiGame01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
			System.out.println("あなたの年齢を教えてください");
				String ageString = new java.util.Scanner(System.in).nextLine();
				int age = Integer.parseInt(ageString);
				int fortune = new java.util.Random() .nextInt(4) + 1;
					System.out.println("占いの結果が出ました");
					System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
						if (fortune ==1) {
							System.out.println("大吉");
						}else if (fortune ==2) {
							System.out.println("中吉");
						}else if (fortune ==3){
							System.out.println("小吉");
						}else {
							System.out.println("凶");
						}
	}

}
