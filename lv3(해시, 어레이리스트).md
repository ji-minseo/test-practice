## Hash

해쉬맵
해쉬셋


https://edu.goorm.io/learn/lecture/41/%EB%B0%94%EB%A1%9C%EC%8B%A4%EC%8A%B5-%EC%83%9D%ED%99%9C%EC%BD%94%EB%94%A9-%EC%9E%90%EB%B0%94-java/lesson/39156/arraylist%EC%9D%98-%EC%82%AC%EC%9A%A9%EB%B2%95

## ArrayList

ArrayList는 크기를 미리 지정하지 않기 때문에 얼마든지 많은 수의 값을 저장할 수 있다

import java.util.*

import java.util.ArrayList


### 객체 생성

ArrayList<Integer> arrayList = new ArrayList<>();

ArrayList<String> al = new ArrayList<>();

//al.get(1).charAt(1) - String형이 들어있는 al이라 자유롭게 string 함수 사용가능


List al = new ArrayList();
ArrayList al = new ArrayList();
//이렇게 선언했을 땐 .toString 등으로 형변환해주어야함
al.get(1).toString().charAt(0);
al.get(1).toString().length();



### 값 추가

arrayList.add(0);
arrayList.add(1);
arrayList.add(2, 10);
//[0,1,10]


ArrayList<Integer> arrayList = new ArrayList<>();
ArrayList<Integer> arrayList2 = new ArrayList<>();

arrayList.addAll(arrayList2);
//덮어씌우기

### 특정 인덱스 값 제거
arrayList.remove(1);
arrayList.remove("value");

### 전체 삭제
ArrayList.clear();

### 특정 값 가져오기

al.get(1); -> 1번인덱스값 가져오기
al.contains("value"); -> 이 값 있는지 검색하기
무언가 있는지 없는지 확인할때 유용하게 사용가능

List<Integer> list = arrayList.subList(1,3);
 1-2번 방 가져옴 (1번방부터, 3번방 전까지)

### 어레이리스트 길이

al.size();

### foreach 문

배열 전체를 다 순회할 필요가 있을때 사용, 인덱스 접근시는 사용x
(주로 이중포문의 첫번째 포문)

(배열 전체를 돌며 한 배열 성분씩 문자열로 잘라 처리할때)

for (String temp : ary ) {
    // System.out.println(temp);
    String [] str = temp.split(",");
    }
}

(배열내 성분에 [i]로 직접 접근할때)

for(int i = 0; i < al.size(); i++) {
    answer[i] = al.get(i);
}