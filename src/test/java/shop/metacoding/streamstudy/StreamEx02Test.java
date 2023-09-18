package shop.metacoding.streamstudy;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class StreamEx02Test {



   @Test
   public void ex04(){
    List<Integer> list =Arrays.asList(1,2,3,4);
   //스킵과 리밋으로 페이징 할 수 있음
   List<Integer> newList = list.stream()
   .skip(1)

   .limit(2)
   .map(t -> t*2) 
   .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));


   }


    @Test
    public void ex01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .filter(t ->  t != 3)//아직 스트림
                .map(t -> {    //두 줄을 적고 싶을 때 중괄호 
                     Integer r = t*2;
                    return r;
                }) // 물길 처음으로 돌아가서 다시 순회 ,가공 ,아직 스트림
                .collect(Collectors.toList()); // 컬렉션으로 반환한다는 말,수집(바구니에 담는 거)

        newList.stream().forEach(t -> System.out.println(t));
    }

    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream().filter(t -> t != 3).collect(Collectors.toList()); // 컬렉션으로 반환한다는 말

        newList.stream().forEach(t -> System.out.println(t));
    }

    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream().filter(t -> t != 3).collect(Collectors.toList()); // 컬렉션으로 반환한다는 말

        newList.stream().forEach(t -> System.out.println(t));
    }

}
