package com.bbs.board.mapper;

import com.bbs.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {

    List<Map<String, Object>> getBoardList(BoardVO postParam);

    int getBoardCount(BoardVO postParam);

    void addBoard(BoardVO boardParam);
    void updateBoard(BoardVO boardParam);
    void deleteBoard(BoardVO boardParam);
}
