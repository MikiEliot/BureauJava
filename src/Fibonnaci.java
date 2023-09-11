
    public class Fibonnaci {
        public static void main(String[]args){
            int n = 30;
            int nb1 =0, nb2=1, nb3=0;

            for (int i = 2; i<n; i++){
                nb3 = nb1+nb2;
                nb1=nb2;
                nb2=nb3;
                System.out.print("-"+nb3);
            }
        }
    }

