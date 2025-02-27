public class exp7 {
    public static void main(String[] args){
        int age = 22;
        int wt = 60;
        int ht = 172;

        if(age >= 22){
            if(wt >= 55 && wt <= 65){
                if(ht >= 170){
                    System.out.println("Application submitted successfully!");

                } else{
                    System.out.println("Height is not matching.");
                }

            } else{
                System.out.println("Weight is not matching.");
            }

        } else {
            System.out.println("age is not matching.");
        }
    }
}
