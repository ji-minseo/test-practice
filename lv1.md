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