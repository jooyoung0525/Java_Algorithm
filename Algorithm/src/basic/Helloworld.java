package basic;

/*
 * 1.이클립스를 켜서 여기 Algorithm 프로젝트를 연다.
 * 2.코딩을 한다.(패키지 만들고 클래스 만들고 코딩하고~)
 * 3.class 밑에 꼭 main 메소드(=함수) 를 만들고 main 메소드 내부에 코드를 작성한다.
 * 4.main 메소드 만들 때 main 네글자 쓰고 ctrl+space bar를 하면 알아서 추천해줌 (ctrl+space bar 하면 웬만한건 다 추천해줌) 
 * 5.코드 인덴트 (괄호를 계단식으로 예쁘게)하는건 ctrl + a + i;
 * 6.작업이 끝나면 jooOng 폴더 들어가서 마우스 우클릭 + git bash 열고
 * 7. git status (변경사항이 인식됐으면 빨간색깔로 뭔가 보일거임)
 * 8. git add . (난 이걸 커밋하겠다)
 * 9. git commit -m "메세지"
 * 10.git push origin master (origin은 원격 저장소를 뜻하고 master 브랜치 버전 push는 나는 원격에 내 지금 변경된사항을 업데이트하겠다) 
 * + 백준에 코드 제출시 위에 패키지 머시기 써있는 라인 날리고
 * public class Main으로 제출 (M 대문자 ★)
 */

public class Helloworld {
	
	
	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		int r = 30;
		System.out.println(r*r*PI);
	}
}
