
public class MultiplesOf3And5 {
	public static void main(String[]args) {
	int x = 0;
	int sum = 0;
	while(x < 1000){
		if (x % 3 == 0 || x % 5 == 0){
			sum += x;
			}
		x++;
		}
	System.out.println(sum);
	}
}

