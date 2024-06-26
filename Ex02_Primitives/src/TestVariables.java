public class TestVariables {

    public static void main(String[] args) {
        float y,x = 0.5f;
        int m =0, c=0,age =20;

        boolean isRaining = true, happy = true ;
        String name = "Lona";
        y=m*x+c;
        System.out.println(name +" is "+ age + " years young" );
        System.out.println(m +" "+  y +" "+ x +" "+ c);
        System.out.println(isRaining || happy);
        System.out.println(isRaining || !happy);
        System.out.println(!isRaining || happy);
        System.out.println(!isRaining || !happy);


    }

}
