package day02.exceptionEx;

public class Exception02 {

    public static void main(String[] args) {
        String[] stringarray = {"100", "1oo",null};
        for(int i=0; i<stringarray.length+1; i++){
            try {
                int value = Integer.parseInt(stringarray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
            }catch (NumberFormatException | NullPointerException e1){
                System.out.println("실행에 문제가 있습니다" + e1.getMessage()); //2가지 예외를 동일하게 처리하는 방식
            }catch(Exception e){
                System.out.println("실행에 문제가 발생하였습니다."+ e.getMessage());
            }
        }

    }
}
