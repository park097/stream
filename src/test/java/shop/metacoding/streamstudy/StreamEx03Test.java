package shop.metacoding.streamstudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import shop.metacoding.streamstudy.board.Board;
import shop.metacoding.streamstudy.board.BoardListDTO;

public class StreamEx03Test {

    @Test
    public void ex01() {
        Board b1 = Board.builder()
                .id(1)
                .title("제목1")
                .content("내용1")
                .author("ssar")
                .build();
        Board b2 = Board.builder()
                .id(2)
                .title("제목2")
                .content("내용2")
                .author("ssar")
                .build();
        Board b3 = Board.builder()
                .id(3)
                .title("제목3")
                .content("내용3")
                .author("cos")
                .build();
        List<Board> boardList = Arrays.asList(b1, b2, b3);
        List<BoardListDTO> responseDTOs = boardList.stream()
                .filter(board -> !board.getAuthor().equals("cos"))
                .filter(board -> board.getContent().contains("1") )
                .map(board -> new BoardListDTO(board)) // 가공
                .collect(Collectors.toList()); 
        System.out.println(responseDTOs);

    }

}