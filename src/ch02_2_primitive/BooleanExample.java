package ch02_2_primitive;

public class BooleanExample {
	
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int[]arr = {3,19,34,50,87};
		int key = 19;
		
		binarySearch(arr,key);
	}
	
	public static void binarySearch(int[]arr2 , int key2) {
		
		int left = 0; //첫번째인덱스값
		int right = arr2.length - 1; //마지막인덱스값
		int mid;
		
		while(left <= right) {
			
			mid = (left+right)/2;
			
			if(key2 == arr2[mid]) {
				System.out.println(key2 + "값의 index위치" + mid);
				break;
			}
			
			if(key2 < arr2[mid]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		
	}
}
