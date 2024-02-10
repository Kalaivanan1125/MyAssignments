package week1.day1;

public class SwitchCases {

	public static void main(String[] args) {
		String browser="Opera";
		switch(browser){
		case "Edge":
			System.out.println("Edge is Opened");
			break;
		case "Firefox":
			System.out.println("Firefox is Opened");
			break;
		case "Chrome":
			System.out.println("Chrome is Opened");
			break;
		case "Safari":
			System.out.println("Safari is Opened");
			break;
		default:
			System.out.println("It is not in the List");
		}

	}}

