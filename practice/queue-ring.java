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

public int enque(int x) throws OverflowQueueException {//rear 로 넣기
    if(num >= max)
        throw new OverflowQueueException();
    else {
        que[rear++] = x;
        num++;
        // rear++;

    }
    return que;
}

public int deque() throws EmptyQueueException {//front로 꺼내기
    if(num == 0)
        throw new EmptyQueueException();
    else {
        que[front++] = 0;
        //front++;
        num--;
    }
    return que;
}
