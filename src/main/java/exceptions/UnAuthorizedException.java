package exceptions;

public class UnAuthorizedException extends Exception {   //checked exception if we extend exception class.
                                                        // unchecked extend RuntimeException
    String code;

    public UnAuthorizedException(String code, String message) {
        super(message);
        this.code = code;
    }
}
