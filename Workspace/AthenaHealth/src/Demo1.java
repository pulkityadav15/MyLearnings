
public class Demo1 {

	public static void main(String[] args) {
		
		int i=10;
		int j=2;
		
		while(i<10){
			if(j>2)
			continue;
			for (int j2 = 0; j2 < 5; j2++) {
				System.out.println("j2");
			}
			System.out.println("after");
			continue;
		}
	}
}
