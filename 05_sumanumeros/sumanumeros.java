public class sumanumeros {
    public static void main (String[] args){
        int i;
        int r=0;
        for(i=1; i<=10;i++){
            r=r+i;
            if(i<10){
                System.out.print(r+"+");
            }else{
                System.out.print(r);
            }
        }
    }
}