package test01;

public class NewID {
	public static String solution(String new_id) {
		// 5단계
		if(new_id==null||new_id.equals("")) {
			new_id="a";
		}
		System.out.println("5단계 널체크 : " + new_id);
		// 1단계
		new_id = new_id.toLowerCase();
		System.out.println("1단계 소문자 변경 : " + new_id);
		// 2단계
		new_id = new_id.replaceAll("[^\\uAC00-\\uD7A30-9a-zA-Z-_.]", "");
		System.out.println("2단계 특수문자 변경 : " + new_id);
		// 3단계
		while(true) {
			new_id = new_id.replace("..", ".");
			if(!new_id.contains("..")) {
				break;
			}
		}
		System.out.println("3단계 . 변경 : " + new_id);
		// 4단계
		if(new_id.substring(0,1).equals(".")) {
			new_id=new_id.substring(1);
		}
		System.out.println("4단계 첫번째 . 삭제 : " + new_id);
		// 5단계
		if(new_id==null||new_id.equals("")) {
			new_id="a";
		}
		System.out.println("5단계 널체크 : " + new_id);
		if(new_id.substring(new_id.length()-1).equals(".")) {
			new_id=new_id.substring(0,new_id.length()-1);
		}
		System.out.println("4단계 마지막 . 삭제 : " + new_id);


		// 6단계
		if(new_id.length()>=16) {
			new_id=new_id.substring(0, 15);
		}
		System.out.println("6단계 16자 이상 삭제 : " + new_id);
		if(new_id.substring(new_id.length()-1).equals(".")) {
			new_id=new_id.substring(0,new_id.length()-1);
		}
		System.out.println("6단계 마지막 . 삭제 : " + new_id);
		// 7단계
		while(new_id.length()<=2){
			new_id += new_id.substring(new_id.length()-1);
		}
		System.out.println("7단계 문자열 늘리기 : " + new_id);

		String answer = new_id;


		return answer;
	}

	public static void main(String[] args) {
		NewID.solution("..ㅁ..");
	}
}
