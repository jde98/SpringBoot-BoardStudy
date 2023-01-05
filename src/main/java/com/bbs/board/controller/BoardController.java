package com.bbs.board.controller;

import com.bbs.board.service.BoardService;
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
    public Map<String, Object> getBoardList(){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            result.put("boardList", boardService.getBoardList());
            result.put("boardCount", boardService.getBoardCount());
            result.put("status", 202);
        } catch(Exception e) {
            result.put("status", 404);
            log.error("getBoarListError:", e.getMessage());
        }

        return result;
    }

    @PostMapping
    public Map<String, Object> addBoard(@RequestBody Map<String, Object> param){
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
    public Map<String, Object> updateBoard(@RequestBody Map<String, Object> param){
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
    public Map<String, Object> deleteBoard(@RequestBody Map<String, Object> param){
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
