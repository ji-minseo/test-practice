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
    
}

