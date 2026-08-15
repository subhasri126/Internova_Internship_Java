public class NumberPractice {
    public static void main(String[] args) {
        System.out.println("Number Practice");
        System.out.println("---------------");
        System.out.println();
        System.out.println("Numbers from 1 to 100");
        System.out.println("---------------------");
        
        int i=1;
        while(i<=100){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.println("Even Numbers");
        System.out.println("------------");
        for(i=1;i<=100;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Odd Numbers");
        System.out.println("------------");
        for(i=1;i<=100;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum of Numbers");
        System.out.println("--------------");
      
        int sum=0;
        i=1;
        do{
            sum+=i;
            i++;
        }while(i<=100);
        System.out.println("Sum : "+sum);

    }
}
