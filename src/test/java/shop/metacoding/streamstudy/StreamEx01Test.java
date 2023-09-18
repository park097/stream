package shop.metacoding.streamstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamEx01Test {

    @Test
    public void ex06(){
        List<Integer>list = Arrays.asList(7,5,5,2,1,2,3,5,4,6);

        //중복제거 , 정렬
        List<Integer> newList = list.stream()
        .distinct()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());

        //값 출력하기
        newList.forEach(i -> System.out.println(i + " "));
    }

 
   @Test
   public void ex05() {
	 {
		int[] array = {10,7,2,5,1,6,4};
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
	}
}


     
    @Test
    public void ex04() {
        {
            List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
            List<Integer> newList = new ArrayList<>();
            // 1. list -> newList에 깊은 복사하기
            for (Integer t : list) {
                newList.add(t);
            }
            // 2. newList에서 동일한 값 제거하기
            for (int i = 0; i < newList.size(); i++) {
                for (int j = i + 1; j < newList.size(); j++) {
                    if (newList.get(i) == newList.get(j)) {
                        System.out.print("i값 : " + newList.get(i) + ", ");
                        System.out.print("j값 : " + newList.get(j));
                        System.out.println();
                        newList.remove(j);
                    }
                }
            }
            // 3. 값 출력하기
            for (Integer i : newList) {
                System.out.print(i + " ");
         
         
            }
           // 오름차순 정렬하기(버블정렬)
       for (int i = 0; i < newList.size() - 1; i++) {
       for (int j = 0; j < newList.size() - 1 - i; j++) {
        if (newList.get(j) > newList.get(j + 1)) {
            int temp = newList.get(j);
            newList.set(j, newList.get(j + 1));
            newList.set(j + 1, temp);
        }
    }
}

   // newList 출력
   for (Integer s : newList) {
    System.out.println(s);
}

        
        }


    
    

  

    }
   

        


    
       
       
      

    


    
    

    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> lowList = new ArrayList<>();
        List<Integer> highList = new ArrayList<>();

        // 얕은복사
        lowList = list; // 주소가 들어간거임,같은 값을 가리키는 거??

        // 깊은 복사
        for (Integer i : list) {
            highList.add(i); // 값까지 들어가는 거 ,새로운 공간을 만들어서 데이터를 만들어내서
        }

        Stream<Integer> stream = list.stream();
        stream.distinct().forEach(t -> {
            System.out.println(t);
        });

    }

    @Test
    public void ex01() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);

        list.add(3);

        list.add(1);

        Stream<Integer> stream = list.stream();
        stream.forEach(t -> { // 스트림을 순회하면서 하나씩 소비 ,소비되는 데이터가 t(변수)/람다식은 타입을 안넣어도 됨
            System.out.println(t);
        });

    }
}