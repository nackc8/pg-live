package d250108;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] arg){
        try {
            throw new CustomException("Ett specialfel inträffade!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
