interface A{
	public void teach();
}
interface B{
	public void teach();
}	
class test1 implements A{
	public void teach(){
		System.out.println("A is teaching");			
	}
}
class test2 implements B{
	public void teach(){
		System.out,println("B is teaching");
	}	
}
public class testing {
	public static void main(String[] args){
		test1 t1 =new test1();
		t1.teach();
		test2 t2 =new test2();
		t2.teach(); 
	}
}