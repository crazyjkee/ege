package ege;

public class B14 {
static int F(int x){
	return (2*(x-2)*(x+8));
}
	public static void main(String[] args) {
		int a,b,t,M,R;
		a=-15;
		b=15;
		M=a;
		R=F(a);
		for(t=a;t<=b;t++){
			if(F(t)<R){
				M=t;R=F(t);
			}
		}
System.out.println(M);
	}

}
