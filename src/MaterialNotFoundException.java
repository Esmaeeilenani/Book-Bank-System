

public class MaterialNotFoundException extends Exception {

    private String mess;

    MaterialNotFoundException(String mess) {
        this.mess = mess;
    }

    @Override
    public String getMessage() {
        return mess; 
    }

}
