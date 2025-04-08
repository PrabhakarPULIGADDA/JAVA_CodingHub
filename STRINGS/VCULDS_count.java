//write a code to print the no of uppercase,smallercase,vowels,consonenst,digits and special symbols in a string


class VCULDS_count
{
	public static void main(String args[])
	{
		int vowel=0,consonent=0,upper=0,lower=0,digit=0,special=0,space=0;
		String s=new String("HElo all @u 2e42 # ");

		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
			
			if(letter>='A'&& letter<='Z')
			{
				upper++;
				if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
				{
					vowel++;
				}
				else
				{
					consonent++;
				}
			}
			else if(letter>='a'&& letter<='z')
			{
				lower++;
				if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
				{
					vowel++;
				}
				else
				{
					consonent++;
				}
			}
			else if(letter>='0' && letter<='9')
			{
				digit++;
			}
			else if(letter==' ')
			{
				space++;
			}
			else
			{
				special++;
			}
			
		}
		
			System.out.println("no of upper case letters are: "+upper);
			System.out.println("no of lower case letters are: "+lower);
			System.out.println("no of vowels are: "+vowel);
			System.out.println("no of consonents are: "+consonent);
			System.out.println("no of digits  are: "+digit);
			System.out.println("no of special symbols are: "+special);
			System.out.println("no of spaces are: "+space);
			System.out.println("total length of string is: "+s.length());			
		
	}	

}
		