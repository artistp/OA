package com.thzw.oa.entity;

import java.util.Date;

public class im_count_view_by_adminid {
    private Integer taskId;

    private String taskTitle;

    private Date beginTime;

    private Date endTime;

    private Long totals;

    private Long unchecked;

    private Long checked;

    private String taskContent;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getTotals() {
        return totals;
    }

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    public Long getUnchecked() {
        return unchecked;
    }

    public void setUnchecked(Long unchecked) {
        this.unchecked = unchecked;
    }

    public Long getChecked() {
        return checked;
    }

    public void setChecked(Long checked) {
        this.checked = checked;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }
}