class myjava 
{ 
	public static void main(String args[]) 
	{ 
		myjava ob = new myjava(); 
		int a[] = {1,2,3,4,5}; 
		int i,n=1,d=4;
		for(i=0;i<5;i++)
		{
			System.out.print(a[(i+d)%n]+" ");
}
}
}
	