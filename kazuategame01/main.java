package kazuategame01;

public class main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
	System.out.println("�����ăQ�[��");
	int ans = new java.util.Random().nextInt(10);
	for (int i = 0; i<5; i++) {
		System.out.println("0~9�̐�������͂��Ă�������");
		int num = new java.util.Scanner(System.in).nextInt();
		if (num == ans) {
			System.out.println("������!");
			break;
		}else {
			System.out.println("�͂���");
		}
			System.out.println("�Q�[�����I�����܂�");
		}
	}
}