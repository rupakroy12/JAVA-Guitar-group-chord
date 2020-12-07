import java.util.*;

class group_chord_major
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String [] ar= new String[]{"A","A#", "B","C","C#", "D","D#","E","F","F#","G","G#"};
		String s;
		int i;
		System.out.println("Enter scale : ");
		s= sc.nextLine();
		s =s.toUpperCase();

		for(i=0;i<=11;i++)
		{
			if(s.equals(ar[i]))
				break;
		}

		System.out.println("Group chords of " + s+ " major :-");
		int c= 0;
                int c2 = 1;
		while(c!=4 && c2!=11)
		{
			if(c2==1 || c2==6 || c2==8 )
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
