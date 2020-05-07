## Hash

해쉬맵
해쉬셋


## ArrayList

ArrayList는 크기를 미리 지정하지 않기 때문에 얼마든지 많은 수의 값을 저장할 수 있다

import java.util.*

import java.util.ArrayList


### 객체 생성

ArrayList<Integer> arrayList = new ArrayList<>();

ArrayList<String> al = new ArrayList<>();


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

### 특정 값 가져오기

al.get(1); -> 1번인덱스값 가져오기
al.contains("value"); -> 이 값 있는지 검색하기

List<Integer> list = arrayList.subList(1,3);
 1-2번 방 가져옴 (1번방부터, 3번방 전까지)

### 어레이리스트 길이

al.size();

