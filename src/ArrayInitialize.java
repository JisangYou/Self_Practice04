
public class ArrayInitialize {
	String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayInitialize array = new ArrayInitialize();
		array.otherInit();
	}

	public void otherInit() {
		int[] lottoNumbers = { 5, 12, 23, 25, 38, 41, 2 }; // �ڿ� �����ݷ�

		// int[] lottoNumbers2;
		// lottoNumbers2={5,12,23,25,38,41,2}; �̷��� �����ϸ� �����Ͽ����� ��.
	}

	public String getMonth(int monthInt) {

		return month[monthInt + 1];
	}
}
