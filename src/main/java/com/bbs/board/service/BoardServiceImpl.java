package com.bbs.board.service;

import com.bbs.board.mapper.BoardMapper;
import com.bbs.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<Map<String, Object>> getBoardList(BoardVO postParam) {
        return boardMapper.getBoardList(postParam);
    }

    @Override
    public int getBoardCount(BoardVO postParam) {
        return boardMapper.getBoardCount(postParam);
    }

    @Override
    public void addBoard(BoardVO boardParam) {
        boardMapper.addBoard(boardParam);
    }

    @Override
    public void updateBoard(BoardVO boardParam) {
        boardMapper.updateBoard(boardParam);
    }

    @Override
    public void deleteBoard(BoardVO boardParam) {
        boardMapper.deleteBoard(boardParam);
    }

}
