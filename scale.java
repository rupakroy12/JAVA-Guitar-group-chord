import java.util.*;

class scale
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String [] ar= new String[]{"A","A#", "B","C","C#", "D","D#","E","F","F#","G","G#"};
		String s;
		int i;
		System.out.println("Enter a scale : ");
		s= sc.nextLine();
		s =s.toUpperCase();
		//System.out.println(s);
		for(i=0;i<=11;i++)
		{
			if(s.equals(ar[i]))
				break;
		}

		System.out.println("Group chords of " + s+ " major :-");
		int c= 0;
                int c2 = 1;
		while(c!=4)
		{
			if(c2==1 || c2==6 || c2==8 ||c2==1)
				{
					System.out.print(ar[i]+ " ");
					c++;
				}
			if (c2==10)
				System.out.println("\nRelative minor : " + ar[i]+"m");
			if (i==11)
				i=-1;
			c2++;
                        i++;

		}

	}

}
