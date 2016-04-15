package com.aspsine.multithreaddownload.demo.entity;

import java.io.Serializable;

/**
 * 应用信息实体类
 */
public class AppInfo implements Serializable {
    /**
     * 应用下载状态定义
     */
    public static final int STATUS_NOT_DOWNLOAD = 0;
    public static final int STATUS_CONNECTING = 1;
    public static final int STATUS_CONNECT_ERROR = 2;
    public static final int STATUS_DOWNLOADING = 3;
    public static final int STATUS_PAUSED = 4;
    public static final int STATUS_DOWNLOAD_ERROR = 5;
    public static final int STATUS_COMPLETE = 6;
    public static final int STATUS_INSTALLED = 7;

    private String name;
    private String packageName;
    private String id;
    private String image;
    private String url;
    private int progress;
    private String downloadPerSize;
    private int status;

    public AppInfo() {
    }

    public AppInfo(String id, String name, String image, String url) {
        this.name = name;
        this.id = id;
        this.image = image;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDownloadPerSize() {
        return downloadPerSize;
    }

    public void setDownloadPerSize(String downloadPerSize) {
        this.downloadPerSize = downloadPerSize;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getStatus() {
        return status;
    }

    /**
     * 下载状态
     * @return
     */
    public String getStatusText() {
        switch (status) {
            case STATUS_NOT_DOWNLOAD:
                return "没有下载";
            case STATUS_CONNECTING:
                return "连接中";
            case STATUS_CONNECT_ERROR:
                return "连接失败";
            case STATUS_DOWNLOADING:
                return "下载中";
            case STATUS_PAUSED:
                return "暂停";
            case STATUS_DOWNLOAD_ERROR:
                return "下载错误";
            case STATUS_COMPLETE:
                return "完成";
            case STATUS_INSTALLED:
                return "安装完成";
            default:
                return "没有下载";
        }
    }

    /**
     * 按钮状态
     * @return
     */
    public String getButtonText() {
        switch (status) {
            case STATUS_NOT_DOWNLOAD:
                return "下载";
            case STATUS_CONNECTING:
                return "取消";
            case STATUS_CONNECT_ERROR:
                return "再试一次";
            case STATUS_DOWNLOADING:
                return "暂停";
            case STATUS_PAUSED:
                return "继续";
            case STATUS_DOWNLOAD_ERROR:
                return "再试一次";
            case STATUS_COMPLETE:
                return "安装";
            case STATUS_INSTALLED:
                return "卸载";
            default:
                return "下载";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
