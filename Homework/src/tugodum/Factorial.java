package tugodum;

public class Factorial {
	public int getFactorial(int x) {
		int look = 1; 
		for(int i = 1; i <= x; i++) {
			look*=i; // ����������� ����� ������ look = look*i;
}
		return look;
	}
}
