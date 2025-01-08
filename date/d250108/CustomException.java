package d250108;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] arg){
        int outside = 10;
        try {
            System.out.println("innan exception, outside: " + outside);
            throw new CustomException("Ett specialfel inträffade!");
            // Körs aldrig pga exception:
            // System.out.println("efter throw exception, outside: " + outside);
        } catch (CustomException e) {
            System.out.println("i catch, outside: " + outside);
            System.out.println(e.getMessage());
        }
    }
}
