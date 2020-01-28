public class data_type_operators {

    public static void main (String[] args){

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int lastresult = result;

        result = lastresult - 1;
        System.out.println(lastresult + " - 1 = " + result);

        lastresult = result;
        result = lastresult * 10;
        System.out.println(lastresult + " * 10 = " + result);

        lastresult = result;
        result = lastresult / 5;
        System.out.println(lastresult + " / 5 = " + result);

        lastresult = result;
        result = lastresult % 3;
        System.out.println(lastresult + " % 3 = " + result);

        lastresult = result;
        result = lastresult + 1;
        System.out.println(lastresult + " + 1 = " + result);

        result++;
        System.out.println("the result is " + result);

        result--;
        System.out.println("the result is " + result);

        result +=3;
        System.out.println("the result is " + result);

        result *=10;
        System.out.println("the result is " + result);

        result /= 5;
        System.out.println("the result is " + result);
    }
}
