public class HelloWorld {
  public static void main(String[] args) {
	int limiter = 4000000;
	int sum = 0;
	int a = 1;
	int b = 1;
	while (b<limiter){
		if( b % 2 == 0){
			sum+=b;
		}
		int h = a+b;
		a=b;
		b=h;
	}
	System.out.println(sum);
  }
}