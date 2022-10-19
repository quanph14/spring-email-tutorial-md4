package com.codegym.model;

public class Email {
    private String id;
    private String language;
    private String pageSize;
    private String spamsFillter;
    private String signature;

    public Email() {
    }

    public Email(String id, String language, String paperSize, String spamsfillter, String signature) {
        this.id = id;
        this.language = language;
        this.pageSize = paperSize;
        this.spamsFillter = spamsfillter;
        this.signature = signature;
    }

    public Email(String language, String paperSize, String spamsfillter, String signature) {
        this.language = language;
        this.pageSize = paperSize;
        this.spamsFillter = spamsfillter;
        this.signature = signature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPaperSize() {
        return pageSize;
    }

    public void setPaperSize(String paperSize) {
        this.pageSize = paperSize;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamsFillter() {
        return spamsFillter;
    }

    public void setSpamsFillter(String spamsFillter) {
        this.spamsFillter = spamsFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
