package d250108;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] arg){
        int outside = 10;
        System.out.println("försts, outside: " + outside);
        try {
            outside = 123;
            System.out.println("innan exception, outside: " + outside);
            throw new CustomException("Ett specialfel inträffade!");
            // Körs aldrig pga exception:
            // System.out.println("efter throw exception, outside: " + outside);
        } catch (CustomException e) {
            System.out.println("i catch, outside: " + outside);
            System.out.println(e.getMessage());
        }
        System.out.println("sist, outside: " + outside);
    }
}
