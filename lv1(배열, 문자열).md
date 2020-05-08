# 자바에서 배열 정렬하기

import java.util.Arrays;
(import java.util.*;)

https://emflant.tistory.com/210

# 문자열에서 숫자, 문자 구분하기

https://needjarvis.tistory.com/227

# 이차원 배열 범위 설정하기

```
for (int a = 0; a <commands.length; a++) {//세로 방만큼 내려가기
//commands[0].length->[0][0] - [0][2] 까지의 가로길이 (commands.length -> 세로 방 길이)

```

### to string
.toString();
### to int
Integer.parseInt("Value");
Integer.valueOf

# String to Char

```
public static String getType(String word) {
        for(int i = 0; i < word.length(); i++) {
            int index = word.charAt(i);
            System.out.println(word.substring(i, i+1) + " " + index);
        }        
        
        return "";
    }
```

# Char to String
```
char[] ary = {'a','b','c','d','e'};
String arrayString = String.valueOf(ary);
System.out.println(arrayString);
```

# int -> char
```
int a = 1;
char b = (char) a;
System.out.println(b);
```


 //97-122 : 소문자
      //65 - 90 : 대문자
      //-26 : 다시 a부터 시작

-32 : 소 -> 대

삼항연산자
int b = (5 < 4) ? 50 : 40; 
(조건) ? 참일때 : 거짓일때;

# 같은 성분으로 배열 초기화

import java.util.Arrays;
boolean bools[] = new boolean[n+1]; //1-n까지숫자 = 방번호
Arrays.fill(bools, false);//아직 삭제안한 숫자들




int nums[] = new int[n+1];
      for(int i =0; i<n; i++) {
          nums[i] = i+1;//1-n 까지의 배열 만들기
      }


# 자바 문자열 자르기, 문자열비교

//사용법
String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
		

//예제
String str = "ABCDEFG"; //대상 문자열
/*A=0 B=1 C=2 D=3 E=4 F=5 G=6의 index를 가진다.*/
		
str.substring(3); 
/*substring(시작위치) 결과값 = DEFG*/

str.substring(3, 6); 
/*substring(시작위치,끝위치) 결과값 = DEF*/


# 문자열비교
s1.equals(s2); // > 같을경우 true

s1.compareTo(s2); // > 같으면0, s1 > s2 -> 양수(긍정값)
//s1 < s2 -> 음수 (부정값)


# 문자열 

(.replace  -> 대체)
(.substring -> 자르기 / (0-)
 .indexOf -> 해당 문자열 위치 /
 .length() -> 문자열 길이)


.charAt(n) -> n번째 문자 (char) 반환 (0-)
.split(".") -> 문자로 나눠 배열에 넣기
.compareTo() -> 비교해서 더 사전순서로 앞인지 (양수 -> 앞스트링이 사전순서 뒤)

.contains -> 포함하는가? (t/f)
.equals -> 같은가? (t/f)

# charAt 함수를 활용하여 단어를 char배열에 한글자씩 저장하기

String word = "POWER"; //스트링 문자 POWER
char[] array_word = new char[word.length()]; // 스트링을 담을 배열

for(int i=0;i<array_word.length;i++){ 
	array_word[i]=(word.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
	System.out.println(array_word[i]); //출력
}


# 문자열 배열에 담기

String salesTeam = "홍길동,유관순,강감찬";
String[] salesTeamArray = salesTeam.split(",");

String[] array = str.split(" ");
// 공백 기준으로 배열에 담기

# 문자열 일부 제거

String s  = "가나다라ABCDE 가나다라ABCDE"; // 원본 문자열
String s2;

// 문자열에서 모든 가나다라 다 지우기
s2 = s.replace("가나다라", "");
System.out.println("삭제(1): " + s2); // 출력 결과: ABCDE ABCDE

// 첫번째 "가나다라"만 없애기
s2 = s.replaceFirst("가나다라", "");
System.out.println("삭제(2): " + s2); // 출력 결과: ABCDE 가나다라ABCDE

// 문자열에서 모든 가나다라 다 지우기
s2 = s.replaceAll("가나다라", "");
System.out.println("삭제(3): " + s2); // 출력 결과: ABCDE ABCDE


# 문자열 특정부분 자르기

//1. 마지막 3글자 자르기
String str = "ABCDEFG"; 
String result = str.substring(str.length()-3, str.length());
System.out.println(result)
 //결과값EFG



//2. 특정문자 이후의 문자열 제거
String str = "ABCD/DEFGH";
String result = str.substring(str.lastIndexOf("/")+1);
System.out.println(result); 
//결과값 DEFGH



//3. 특정단어(부분)만 자르기
String str = "바나나 : 1000원, 사과 : 2000원, 배 : 3000원";
String target = "사과";
int target_num = str.indexOf(target); 
String result; result = str.substring(target_num,(str.substring(target_num).indexOf("원")+target_num));
System.out.println(result+"원"); 
//결과값 : 사과 : 2000원


# 문자열 길이대로 정렬

Arrays.sort(arr, new Comparator<String>(){
	public int compare(String s1, String s2){
		return Integer.compare(s1.length(), s2.length());//문자열 길이순 정렬
	}
});


## 문자열들을 담은 배열에서 한줄의 문자열 또 나눠서 해당 문자열만 배열로 다루기

for(String temp : arr) {
    String [] val = temp.split(",");
    //이런식으로 포문 안에서 String [] 선언해서 그때만 넣어줌
    -> 그러면 해당 포문이 도는 동안엔 해당 줄만 갖고 생각 가능
    }
}