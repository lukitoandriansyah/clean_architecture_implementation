package jav002.infrastructure.delivery.responses;

import java.io.Serializable;

public class NetflixResponses<T> implements Serializable {
    private String status;
    private String code;
    private String message;
    private T data;

    private static  final long serialVersionUID = 7302319210373510173L;

    public NetflixResponses(){
        super();
    }

    public NetflixResponses(String status, String code, String message){
        this.status = status;
        this.code=code;
        this.message=message;
    }

    public NetflixResponses(String status, String code, String message, T data){
        this.status=status;
        this.code=code;
        this.message=message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
