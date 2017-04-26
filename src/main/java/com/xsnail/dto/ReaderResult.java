package com.xsnail.dto;

/**
 * Created by Admin on 2017/3/27.
 */
public class ReaderResult<T> {
    private boolean ok;
    private T data;
    private String error;

    public ReaderResult(boolean ok){
        this.ok = ok;
    }

    public ReaderResult(boolean ok, T data) {
        this.ok = ok;
        this.data = data;
    }

    public ReaderResult(boolean ok, String error) {
        this.ok = ok;
        this.error = error;
    }

    public ReaderResult(boolean ok, T data, String error) {
        this.ok = ok;
        this.data = data;
        this.error = error;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
