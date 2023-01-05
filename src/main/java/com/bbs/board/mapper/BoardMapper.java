package com.bbs.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {

    List<Map<String, Object>> getBoardList();

    int getBoardCount();

    void addBoard(Map<String, Object> boardParam);
    void updateBoard(Map<String, Object> boardParam);
    void deleteBoard(Map<String, Object> boardParam);
}
