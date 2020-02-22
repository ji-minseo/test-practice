# 자바에서 배열 정렬하기

https://emflant.tistory.com/210

# 문자열에서 숫자, 문자 구분하기

https://needjarvis.tistory.com/227

# 이차원 배열 범위 설정하기

```
for (int a = 0; a <commands.length; a++) {//세로 방만큼 내려가기
//commands[0].length->[0][0] - [0][2] 까지의 가로길이 (commands.length -> 세로 방 길이)

```

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


# charAt 함수를 활용하여 단어를 char배열에 한글자씩 저장하기

String word = "POWER"; //스트링 문자 POWER
char[] array_word = new char[word.length()]; // 스트링을 담을 배열

for(int i=0;i<array_word.length;i++){ 
	array_word[i]=(word.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
	System.out.println(array_word[i]); //출력
}
