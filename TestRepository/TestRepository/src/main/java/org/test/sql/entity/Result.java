package org.test.sql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Result<T> implements Serializable {
    private long timestamp;
    private String status;
    private String message;
    T data;


    public static <T> Result<T> isSuccess(T data,boolean flag){
        return flag ? success(data) : fail(data);
    }

    public static <T> Result<T> fail(T data){
        return fail(data,"fail");
    }

    public static <T> Result<T> fail(T data,String message){
        return new Result<>(System.currentTimeMillis(),
                "500",message,data);
    }

    public static <T> Result<T> success(T data){
        return success(data,"success");
    }

    public static <T> Result<T> success(T data,String message){
        return new Result<>(System.currentTimeMillis(),
                "200",message,data);
    }
}
