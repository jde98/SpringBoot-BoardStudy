package com.bbs.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<Map<String, Object>> getBoardList();

    int getBoardCount();

    void addBoard(Map<String, Object> boardParam);
    void updateBoard(Map<String, Object> boardParam);
    void deleteBoard(Map<String, Object> boardParam);
}
