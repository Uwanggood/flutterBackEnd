package by.flutterMVC.Vo;

import lombok.AllArgsConstructor;

import javax.persistence.*;


@Entity
public class Board {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int boardNum;
    String title;
    String content;

    @Override
    public String toString() {
        return "Board{" +
                "boardNum=" + boardNum +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public void setBoardNum(int boardNum) {
        this.boardNum = boardNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Board() {

    }

    public int getBoardNum() {
        return boardNum;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
