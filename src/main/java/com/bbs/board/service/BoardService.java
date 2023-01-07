package com.bbs.board.service;

import com.bbs.board.vo.BoardVO;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<Map<String, Object>> getBoardList(BoardVO postParam);

    int getBoardCount(BoardVO postParam);

    void addBoard(BoardVO boardParam);
    void updateBoard(BoardVO boardParam);
    void deleteBoard(BoardVO boardParam);
}
