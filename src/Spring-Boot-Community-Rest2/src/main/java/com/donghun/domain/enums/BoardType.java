package com.donghun.domain.enums;

public enum BoardType {
    notice("공지사항"),
    free("자유게시판"),
    kyungsung("경성게시판");

    public String value;

    BoardType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
