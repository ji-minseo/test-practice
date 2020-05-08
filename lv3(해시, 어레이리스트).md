## Hash

List(ArrayList , Vector , LinkedList )는 입력한 모든 값들이 저장 순서보장 X 

Hash ( HashSet,LinkedHashSet , TreeSet ) 는 고유한 값만 저장. 순서보장 O 

hashset->List와 다르게 중복 값은 저장되지 X 고유한 값만 저장. 

리스트 : 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.


해쉬맵 -> Map : 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합이다.

 순서는 유지되지 않고, 키는 중복을 허용하지 않으며 값의 중복을 허용한다.


### HashSet

해쉬셋 -> Set : 중복된 요소를 저장하지 않음 .순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.

* 주로 겹치는 요소를 하나로 취급하는 문제의 경우, 해쉬셋 사용 *

import java.util.HashSet;

HashSet<Integer> hashSet = new HashSet<>();


hashSet.add(i + 3); //데이터 추가

if(hashSet.contains(CONTAINS_ELEMENT))

hashSet.isEmpty() //데이터 있는지 확인

remove(Object o) //특정 데이터 제거

clear() // 데이터 전부 삭제




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



### 반복자

import java.util.Iterator;