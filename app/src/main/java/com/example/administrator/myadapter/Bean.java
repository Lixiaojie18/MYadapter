package com.example.administrator.myadapter;

/**
 * Created by ${Administrator} on 2016/11/11 0011.
 */

public class Bean {
    private String Title;
    private String content;
    private String time;
    private String number;

    public Bean(String title, String content, String time, String number) {
        Title = title;
        this.content = content;
        this.time = time;
        this.number = number;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public String getNumber() {
        return number;
    }
}
