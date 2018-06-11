package com.lzh.checkUpService.model.entity;

public class TCheckList {
    private Long id;

    private String checkListName;

    private String checkListCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckListName() {
        return checkListName;
    }

    public void setCheckListName(String checkListName) {
        this.checkListName = checkListName == null ? null : checkListName.trim();
    }

    public String getCheckListCode() {
        return checkListCode;
    }

    public void setCheckListCode(String checkListCode) {
        this.checkListCode = checkListCode == null ? null : checkListCode.trim();
    }
}