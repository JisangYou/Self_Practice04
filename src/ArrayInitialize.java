
public class ArrayInitialize {
	String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayInitialize array = new ArrayInitialize();
		array.otherInit();
	}

	public void otherInit() {
		int[] lottoNumbers = { 5, 12, 23, 25, 38, 41, 2 }; // 뒤에 세미콜론

		// int[] lottoNumbers2;
		// lottoNumbers2={5,12,23,25,38,41,2}; 이렇게 지정하면 컴파일오류가 남.
	}

	public String getMonth(int monthInt) {

		return month[monthInt + 1];
	}
}
