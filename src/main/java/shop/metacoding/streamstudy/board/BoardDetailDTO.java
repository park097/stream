package shop.metacoding.streamstudy.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//깊은복사


@ToString
@Getter @Setter
public class BoardDetailDTO {
    private Integer id;
    private String title;
    private String content;
    private String author;
    
    
    public BoardDetailDTO(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.author = board.getAuthor();
    }

    
    

    
}


