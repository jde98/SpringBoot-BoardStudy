package com.bbs.board.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
    private String boardId;
    private String postId;
    private String postType;
    private String postTitle;
    private String postContent;
    private String viewCnt;
    private String deleted;
    private String fileNo1;
    private String fileNo2;
    private String createDate;
    private String createUser;
    private String updateDate;
    private String updateUser;
    private String loginUser;
}
