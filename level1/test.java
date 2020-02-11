class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        for (int i = 0; i < lost.length; i++) {//체육복을 잃어버린 학생 기준으로 생각하기
            int l = lost[i];//잃어버린 학생 순환
            
            for (int j =0; j < reserve.length; j++){//리저브 배열을 돈다
                
                if(reserve[j] == l) {// 리저브 조차 도둑맞았어!
                    reserve[j] = 0;
                    answer++;
                }
                if((reserve[j] == l+1 || reserve[j] == l-1 )&& reserve[j] != 0){//잃어버린 학생의 앞뒤일경우
                    answer++;
                    reserve[j] = 0; //빌려줬으니까 초기화
                }
            } 
            for (int j =0; j < reserve.length; j++){
                System.out.print(reserve[j]);
            }
            System.out.println("");
            System.out.println("l = " + l);
            System.out.println("lost = "+lost[i]);
            
            

        }
        answer = answer + (n-lost.length);
        
        return answer;
    }
}