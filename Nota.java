public class Nota{
	public static void main(String[] args){
		double nota = 92.0;
		if(nota >= 90){
			System.out.println("Excelent!");
		}
		else if(nota < 90 && nota >= 80){
			System.out.println("Good job!");
		}
		else if(nota < 80 && nota >= 60){
			System.out.println("Study Harder!");
		}
		else{
			System.out.println("Sorry, you failed!!");
		}
	}
}