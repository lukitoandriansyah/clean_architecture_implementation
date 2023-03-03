package jav002.infrastructure.shared.exceptions;

public abstract class NetflixException extends Exception {
    private static final longserialVersionUID = -7482635401716007171L;
    private final int code;

    public NetflixException(final int code, final String message){
        super(message);
        this.code=code;
    }

    public int getCode() {
        return this.code;
    }
}
