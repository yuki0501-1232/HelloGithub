package Uranaigame;

public class UranaiGame01 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�悤�����肢�̊ق�");
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("���Ȃ��̔N��������Ă�������");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random() .nextInt(4);
		fortune++;
		System.out.println("�肢�̌��ʂ��o�܂���");
		System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł�");
		System.out.println("1:��g�@2:���g 3:�g 4:��");
		

	}

}
