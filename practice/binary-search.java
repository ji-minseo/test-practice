public class HelloWorld{

   		public static void main(String []args){
    	System.out.println("Hello World");

    	int[] nums = {2, 5, 11, 15, 16, 19, 21, 24};
    	int targetNum = 21;
        int answer = 0;
          
          int min = 0; // 배열 시작방 번호
          int max = nums.length - 1; ///배열 끝방 번호
        
          
          while(true) {//답 찾을때까지 검색 (배열 시작방, 끝방 번호 바꾸면서 계속)
            int middle = (max + min) / 2; // 중간 방번호 구하기
            
            if(nums[middle] == targetNum) {//정답을 찾음
              answer = middle; // 방 번호 리턴
              break;
            }
            else if (min == max) {// 다찾았는데 없음
              answer = -1;
              break;
            }
            else if (nums[middle]>targetNum) { //중간방 숫자가 타겟넘보다 큼 = 왼쪽조사
              max = middle; // 왼쪽조사를 위해 반띵
            }
            else { //오른쪽조사
              min = middle;
            }
              
            
            
          } 
          System.out.println(answer);
          

    	}
  
  		
    
}