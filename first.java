package Pattrens;
import java.util.Scanner;

// 1
// *
// * * 
// * * * 
// * * * *
// * * * * *



// class first{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             // for col
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
        
//         }

//     }

// }

// 2
// *****
// *****
// *****
// *****
// *****


// class first{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             // for col
//             for(int j=1;j<=5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
        
//         }

//     }

// }




// 3)
// *****
// ****
// ***
// **
// *
// row 1 col 5 thne row 2 col 4 then row 3 col 3

// class first{
//     public static void main(String[] args){
//         for(int i=5;i>=1;i--){
//             // for col
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
        
//         }

//     }

// }




// 4)
// 1
// 12
// 123
// 1234
// 12345


// class first{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             // for col
//             for(int j=1;j<=i;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println();
        
//         }

//     }

// }



// 5}
// *
// * * 
// * * * 
// * * * *
// * * * * *
// * * * *
// * * *
// * *  
// * 


// class first{
//     public static void main(String[] args){
//         // first half
//         for(int i=0;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // second half
//         for(int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                  System.out.print("* ");
//             }
//              System.out.println();

//         }

//     }

// }



// 6
    //        *
    //       * * 
    //      * * * 
    //     * * * *
    //    * * * * *
    //     * * * *
    //      * * *
    //       * *  
    //        * 

        
// class first{
//     public static void main(String[] args){
//         // first half
//         for(int i=1;i<=5;i++){
//             for(int s=1;s<=5-i;s++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                  System.out.print("* ");
//             }
//              System.out.println();
//         }
//         // second half
//         for(int i=5-1;i>=1;i--){
//             for(int s=1;s<=5-i;s++){
//                 System.out.print(" ");
//             }
//              for(int j=1;j<=i;j++){
//                  System.out.print("* ");
//             }
//             System.out.println();

//         }

//     }

// }





// 7)

        //     1
        //   2 1 2
        //  3 2 1 2 3
        // 4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5



        
class first{
    public static void main(String[] args){
        int n=5;
        // first half
       
       for(int i=1;i<=5;i++){
         for(int s=0;s<=n-i;s++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }
       

    }

}




