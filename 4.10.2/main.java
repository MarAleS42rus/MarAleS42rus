public class Main {
    
    
	public static void main(String[] args) {
	    
	    System.out.println("Lets go!!!");
	    
	    Arithmetic example = new Arithmetic("Пример1");
	    
	    example.summ(1, 50);
	    example.multiplication(2, 6);
	    example.maxElem(2, 3);
	    example.minElem(1, 4);
	    System.out.println();
	    
	    Arithmetic example2 = new Arithmetic("Пример2");
	    
	    example2.summ(10, 40);
	    example2.multiplication(20, 16);
	    example2.maxElem(25, 35);
	    example2.minElem(10, 10);
	}
}

