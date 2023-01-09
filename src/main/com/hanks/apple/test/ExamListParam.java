package com.hanks.apple.test;

import java.util.List;

/**
 * @ClassName: com.riying.educated.utils.http.ExamListParam
 * @CreateDate: 2022/10/17 13:20
 * @Author: 侯建军
 * @Description: TODO
 */
public class ExamListParam {



    /**
     * bookId : 965716242728064
     * bookChapter : [965716242728065]
     */

    private String bookId;
    private List<Long> bookChapter;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public List<Long> getBookChapter() {
        return bookChapter;
    }

    public void setBookChapter(List<Long> bookChapter) {
        this.bookChapter = bookChapter;
    }
}
