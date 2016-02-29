import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class PathClearTrip {
	public static void main(String[] args) throws IOException {

		int count=1;
		int a[][]=new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j]=count;
				count++;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int input[][]=new int[5][2];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i++) {
			String line=br.readLine();
			StringTokenizer st=new StringTokenizer(line);
			input[i][0]=Integer.parseInt(st.nextToken());
			input[i][1]=Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 5; i++) {
			int input1=input[i][0];
			int input2=input[i][1];
			
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					
				}
			}
		}
		
	}
	
}
