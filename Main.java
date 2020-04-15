import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		System.out.println("Hello World!");
		System.out.println("Second");
		System.out.println("at home");

		//테스트
		Scanner s = new Scanner(System.in);
		System.out.print("문제를 선택하세요 1~3>(종료 : 0)");
		while(true){
			int Question = Integer.parseInt(s.nextLine());
			if(Question == 0){
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			else if(1 <= Question && Question <= 3){
				System.out.println();
				switch(Question){
					case 1:
						Question01();
						break;
					case 2:
						Question02();
						break;
					case 3:
						Question03();
						break;
					default:
				}
				System.out.print("문제를 선택하세요 1~3>(종료 : 0)");
			}else{
				System.out.print("문제를 다시 선택하세요.>");
			}
		}
	}
	
	private static void Question01(){
		Scanner s = new Scanner(System.in);
		System.out.print("알고자 하는 기본형을 입력하세요.");
		String value = s.nextLine();
		switch(value){
			case "boolean":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  1, "논리형");
				break;
			case "byte":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  1, "정수형");	
				break;
			case "short":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  2, "정수형");
				break;
			case "int":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  4, "정수형");
				break;
			case "long":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  8,  "정수형");
				break;
			case "float":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  4, "실수형");
				break;
			case "double":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  8, "실수형");
				break;
			case "char":
				System.out.printf("%s은(는) %sbyte이며, 종류는 %s이다.", value,  2, "문자형");
				break;
			default:
				System.out.print("해당 기본형은 존재하지 않습니다.");
				break;
		}
		System.out.println();
		System.out.println();
		
	}
	
	private static void Question02(){
		Scanner s = new Scanner(System.in);
		System.out.print("주민번호을 입력하세요.");
		String value = s.nextLine();
		System.out.println("주민번호 : " + value);
		System.out.println();
	}

	private static void Question03(){
		Scanner s = new Scanner(System.in);
		System.out.print("Char타입의 문자을 입력하세요>");
		char Value = s.next().charAt(0);
		System.out.println((int)Value);
		
	}
}