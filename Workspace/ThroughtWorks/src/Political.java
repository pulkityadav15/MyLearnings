import java.util.Arrays;
import java.util.StringTokenizer;


public class Political {

	public static void main(String[] args) {

		String line="http://www.cleartrip.com/signin/service?username=test&pwd=test&profile=developer&role=ELITE&key=manager";
		String content=line.substring(line.indexOf('?')+1);
		StringTokenizer st=new StringTokenizer(content);
		while(st.hasMoreTokens())
		{
			StringTokenizer st1=new StringTokenizer(st.nextToken("&"));
			while(st1.hasMoreTokens())
			{
				System.out.print(st1.nextToken("="));
				if(st1.countTokens()==1)
				{
					System.out.print(": ");
				}
			}
			System.out.println();
		}
	}
}

