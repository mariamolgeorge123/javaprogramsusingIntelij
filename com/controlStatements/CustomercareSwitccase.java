package com.controlStatements;

import java.util.Scanner;

public class CustomercareSwitccase {
    public static void main(String[] args) {
        System.out.println("Customer Care");
        System.out.println("**********");
        System.out.println("Welcome");

Scanner sc=new Scanner(System.in);
        System.out.println("1.English");
        System.out.println("2.Malayalam");
        System.out.println("3.Hindi");

        System.out.println("Select the language do you want?");
        int oper=sc.nextInt();

        switch(oper)
        {
            case 1:
                System.out.println("welcome.what help do you want?");
                System.out.println(" 1. change Hours\n 2.Refund Request\n 3.Discount Request\n 4.phone Transfer\n 5.Exit\n");
                int data=sc.nextInt();
                switch(data)
                {
                    case 1:System.out.println("which time you prefer?");
                           System.out.println(" 1. 8am-12 pm\n 2. 1pm-4pm\n 3.5pm-9pm\n 4.Exit\n");
                           int time=sc.nextInt();
                           switch(time)
                           {
                               case 1:
                                   System.out.println("your timing changes to 8am-12 pm");
                                   break;
                               case 2:
                                   System.out.println("your timing changes to 1pm-4 pm");
                                   break;
                               case 3:
                               System.out.println("your timing changes to 5pm-9 pm");
                               break;
                               case 4:break;
                               default:
                                   System.out.println("Invalid number");
                                   break;

                           }
                           break;
                    case 2:
                        System.out.println("Enter your Account number");
                        String account=sc.next();
                        System.out.println("Enter your valid mobile number");
                        String mobile=sc.next();
                        System.out.println("Enter your valid email id");
                        String email=sc.next();
                        System.out.println(" for verification your Account number is"+account+"and your mail id is"+email);
                        System.out.println("Refund is processing.Ii will be refunded within 5 working days.details will send to your email");
                        break;
                    case 3:
                        System.out.println("Enter your Card number");
                        String card=sc.next();
                        System.out.println("Enter your Card points");
                        int point=sc.nextInt();
                        System.out.println("Enter your valid email id");
                        String emailid=sc.next();
                        System.out.println(" for verification your card number is"+card+"and your mail id is"+emailid);
                            if(point>=100 && point<200) {
                                System.out.println("you are eligible for 10% discount.Details will sent to your email id");
                            }
                            else if(point>=200 && point<300) {
                                System.out.println("you are eligible for 20% discount.Details will sent to your email id");
                            }
                            else if(point>=300 && point<400) {
                                System.out.println("you are eligible for 30% discount.Details will sent to your email id");
                            }
                            else if(point>=400) {
                                System.out.println("you are eligible for 40% discount.Details will sent to your email id");
                            }else {
                                System.out.println("minimum 100  card points needed for discount");
                            }
                        break;
                    case 4:
                        System.out.println("please hold on line .we are connecting to our agent");
                        break;

                    case 5: break;
                    default:System.out.println("Invalid entry");
                    break;

                }
                break;
            case 2:
                System.out.println("ok .you can speak in malayalam");
                break;
            case 3:
                System.out.println("ok .you can speak in hindi");
                break;

            default:
                System.err.println("Invalid Input");
                break;
        }
    }
}
