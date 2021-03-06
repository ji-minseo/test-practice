package chap04;

public class IntAryQueue {
    private int max; // 큐 용량
    private int num; // 현재 데이터 수
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
    num = 0; //처음 데이터 개수
    max = capacity; //큐의 크기
    try {
        que = new int[max];
    } catch (OutOfMemoryError e) {
        max = 0;
    }  
}

public int enque(int x) throws OverflowQueueException {
    if(num >= max)//끝까지 큐가 찬 경우
        throw new OverflowQueueException();
    else {
        que[num] = x;
        num++;
        
    }
    return que;
    //return que[num++] = x;

}

public int deque() throws EmptyQueueException {
    if(num == 0)
        throw new EmptyQueueException();
    else {
        for (int i = 0; i < max; i++) {
            que[i] = que[i+1];
        }
        num--;
    }
    return que;
}
