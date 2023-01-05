package com.bbs.board.service;

import com.bbs.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<Map<String, Object>> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Override
    public int getBoardCount() {
        return boardMapper.getBoardCount();
    }

    @Override
    public void addBoard(Map<String, Object> boardParam) {
        boardMapper.addBoard(boardParam);
    }

    @Override
    public void updateBoard(Map<String, Object> boardParam) {
        boardMapper.updateBoard(boardParam);
    }

    @Override
    public void deleteBoard(Map<String, Object> boardParam) {
        boardMapper.deleteBoard(boardParam);
    }

}
