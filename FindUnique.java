package Guvi;

public class FindUnique {
	public static void main(String[] args) {
	int r=0;
	int a[]={12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
	for(int i=0;i< a.length;i++)
	{
	r=a[i]|r%3;
	}
	System.out.println(r);
	}
}
