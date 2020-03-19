package chap04;

public class IntAryQueue {
    private int max; // 큐 용량
    private int num; // 현재 데이터 수
    private int rear;
    private int front;
    private int[] que; //큐 본체

    //실행 시 예외 : 큐가 비어 있음
    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {}
    }

    //실행 시 예외 : 큐가 가득 참
    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() {}
    }
}

//생성자
public IntAryQueue(int capacity) {
    num, front, rear = 0; //프론트, 레어의 첫위치
    max = capacity; //큐의 크기
    try {
        que = new int[max];
    } catch (OutOfMemoryError e) {
        max = 0;
    }  
}

public int enque(int x) throws OverflowQueueException {//rear 로 넣기 - 리턴 없어도됨
    if(num >= max)
        throw new OverflowQueueException();
    que[rear++] = x;
    num++;
    // rear++;
    if(rear == max)
        rear = 0;
    return x;
}

public int deque() throws EmptyQueueException {//front로 꺼내기 -> 리턴값이 꺼내진 값!
    if(num == 0)
        throw new EmptyQueueException();
    int x = que[front++];
    //front++;
    num--;
    if(front == max)
        front = 0;
    
    return x;
}

//큐에소 데이터를 피크 (프런트 데이터를 들여다봄)
public int peek() throws EmptyQueueException {
    return que[front];
}

//큐에서 x를 검색하여 인덱스 (찾지 못하면 -1)를 반환
public int indexOf(int x) {
    for (int i = 0; i < num; i++) {
        if(que[i] == x)
            return i;
    }
    return -1;

}
//큐를 비움
public void clear() {
    front = rear = num = 0;

}
//큐의 용량을 반환
public int capacity() {
    return max;

}
//큐에 쌓여 있는 데이터 수를 반환
public int size() {
    return num;
}

//큐가 비어 있나요?
public boolean isEmpty() {//비어있을시 true
    return (num <= 0);
}

//큐가 가득 찼나요?
public boolean isFull() {//가득 차있을시 true
    return (num >= max);

}
// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
public void dump() {
    for (int i = front; i<rear; i++) {
        System.out.println(que[i]);
    }

}