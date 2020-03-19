# 스택, 큐 사용
import java.util.Stack;

import java.util.LinkedList;
import java.util.Queue;

## 스택 만들기
Stack<String> stack = new Stack<String>(); 
Stack<Integer> stack = new Stack<>();
Stack stack = new Stack(); ->             int x = (Integer)stack.pop();


Stack<Element> stack = new Stack<>();


## 푸시
stack.push("Hi-"+i);

public Element push(Element item); // 데이터 추가
public Element pop(); // 최근에 추가된(Top) 데이터 삭제
public Element peek(); // 최근에 추가된(Top) 데이터 조회
public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음


Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
            System.out.println(stack.peek());
        } // 1, 2, 3, 4, 5 가 현재 들어가 있음
        stack.pop(); // 1, 2, 3, 4
        System.out.println(stack.peek()); // 4
        System.out.println(stack.search(1)); // 4
        System.out.println(stack.empty()); // false



System.out.println(stack.pop()); //스택의 꼭대기 값을 반환하고 삭제한다.             
System.out.println(stack.peek()); //스택의 꼭대기 값을 반환한다.                  
System.out.println(stack.search("value")); //값이 존재하면 1, 아니면 -1을 출력한다. 
System.out.println(stack.isEmpty()); //스택이 비어있으면 true을 출력한다. 
System.out.println(stack);			//[v1, v2]
