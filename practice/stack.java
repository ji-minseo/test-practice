package chap04;

public class IntStack {
    private int max; // 스택의 끝값 ( 용량)
    private int ptr; // 현재 어디까지 채웠는지 알려주는 포인터
    private int[] stk; // 스택 본체


    //실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    //실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    //생성자
    public IntStack(int capacity) {
        ptr = 0; // 처음위치 0
        max = capacity; // 만들때 파라미터로 스택크기 지정
        try {
            stk = new int[max];//스택만들기
        } catch (OutOfMemoryError e) { //생성할 수 없음
            max = 0;
        }

    }

    //스탣에 x를 푸시 메서드
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) // 스택이 가득찼을떄
            throw new OverflowIntStackException();
        return stk[ptr++] = x; // x 채워넣기(stk[ptr]), 포인터 1이동
    }

    //스택에서 데이터를 팝 (제일 위 데이터 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) // 스택이 비어있음
            throw new EmptyIntStackException();
        return stk[--ptr]; // 스택 포인터 값 먼저감소후 반환(포인터가 앞당겨짐)
    }

    // peak 엿보기 메서드
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) //스택이 비어있음
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    //스택에서 x를 찾아 인덱스 (없으면 -1)를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)
            if(stk[i] == x)
                return i; //검색 성공
        return -1; //검색 실패
    }

    //스택 비움
    public void clear() {
        ptr = 0;
    }

    //스택의 용량을 반환
    public int capacity() {
        return max;
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size() {
        return ptr;
    }

    //스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= max;
    }

    //스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 축ㄹ력
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }


}