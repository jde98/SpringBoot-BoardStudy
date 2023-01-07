package com.bbs.board.controller;

import com.bbs.board.service.BoardService;
import com.bbs.board.vo.BoardVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Log4j2
@RestController
@RequestMapping(value = "/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping
    public Map<String, Object> getBoardList(
            @RequestParam String postTitle,
            @RequestParam String createUser
    ){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            BoardVO postParam = new BoardVO();

            postParam.setPostTitle(postTitle);
            postParam.setCreateUser(createUser);

            result.put("boardList", boardService.getBoardList(postParam));
            result.put("boardCount", boardService.getBoardCount(postParam));
            result.put("status", 202);


        } catch(Exception e) {
            result.put("status", 404);
            log.error("getBoarListError:", e.getMessage());
        }

        return result;
    }

    @PostMapping
    public Map<String, Object> addBoard(@RequestBody BoardVO param){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            boardService.addBoard(param);
            result.put("status", 202);
        } catch(Exception e) {
            result.put("status", 404);
            log.error("addBoard:", e.getMessage());
        }

        return result;
    }

    @PutMapping
    public Map<String, Object> updateBoard(@RequestBody BoardVO param){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            boardService.updateBoard(param);
            result.put("status", 202);
        } catch(Exception e) {
            result.put("status", 404);
            log.error("updateBoard:", e.getMessage());
        }

        return result;
    }

    @DeleteMapping
    public Map<String, Object> deleteBoard(@RequestBody BoardVO param){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            boardService.deleteBoard(param);
            result.put("status", 202);
        } catch(Exception e) {
            result.put("status", 404);
            log.error("deleteBoard:", e.getMessage());
        }

        return result;
    }
}
