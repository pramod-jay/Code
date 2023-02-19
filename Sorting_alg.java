import java.util.Random;
import java.util.Scanner;

public class Sorting_alg {
    public static void main(String[] args) { //Main method
        int arr[]=new int[1000];
        arr=new Genarate_num().Genarate_numbers();
        Scanner user_input=new Scanner(System.in);

        //Get sorting method from the user
        System.out.println("Select sorting algorithm: ");
        System.out.println("Insertion sort -> Press No 1");
        System.out.println("Selectiion sort -> Press No 2");
        System.out.println("Bubble Sort -> Press No 3");
        
        int input=user_input.nextInt();

        if(input==1){
            int case_input=new Sorting_alg().Case_selection();//Call Case_selection method for get case selection
            //Insertion sort, Worst case
            if (case_input==1){
                long Start_time=System.currentTimeMillis();
                new Insert_sort(arr);//pass array as a parameter to Insert_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            //Insertion sort, Average case
            }else if(case_input==2){
                new Avg_sort(arr);//Initially pass array as a parameter to Avg_sort constructor for sort first half of the array
                long Start_time=System.currentTimeMillis();
                new Insert_sort(arr);//pass array as a parameter to Insert_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            //Insertion sort, Best case
            }else if(case_input==3){
                new Insert_sort(arr);//Initially pass array as a parameter to Avg_sort constructor for sort the array
                long Start_time=System.currentTimeMillis();
                new Insert_sort(arr);//pass array as a parameter to Insert_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            }else{
                System.out.println("\nInvalid input..!!");
            }
        }else if(input==2){
            int case_input=new Sorting_alg().Case_selection();//Call Case_selection method for get case selection
            //Selection sort, Worst case
            if (case_input==1){
                long Start_time=System.currentTimeMillis();
                new Select_sort(arr);//pass array as a parameter to Select_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            //Insertion sort, Average case
            }else if(case_input==2){
                new Avg_sort(arr);
                long Start_time=System.currentTimeMillis();
                new Select_sort(arr);//pass array as a parameter to Select_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            //Insertion sort, Best case
            }else if(case_input==3){
                new Insert_sort(arr);
                long Start_time=System.currentTimeMillis();
                new Select_sort(arr);//pass array as a parameter to Select_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            }else{
                System.out.println("\nInvalid input..!!");
            }
        }else if(input==3){
            int case_input=new Sorting_alg().Case_selection();
            //Bubble sort, Worst case
            if (case_input==1){
                long Start_time=System.currentTimeMillis();
                new Bubble_sort(arr);//pass array as a parameter to Bubble_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            //Bubble sort, Average case
            }else if(case_input==2){
                new Avg_sort(arr);
                long Start_time=System.currentTimeMillis();
                new Bubble_sort(arr);//pass array as a parameter to Bubble_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            //Bubble sort, Best case
            }else if(case_input==3){
                new Insert_sort(arr);
                long Start_time=System.currentTimeMillis();
                new Bubble_sort(arr);//pass array as a parameter to Bubble_sort constructor
                long End_time=System.currentTimeMillis();
                System.out.println("\nExecution time: "+(End_time-Start_time)+" miliseconds");
            }else{
                System.out.println("\nInvalid input..!!");
            }
        }else{
            System.out.println("Invalid ibput..!!");
        }
        user_input.close();
    }

    public int Case_selection(){//Method for case selection
        Scanner user_input=new Scanner(System.in);
        System.out.println("Select case: ");
        System.out.println("Worst case -> Press No 1");
        System.out.println("Average case -> Press No 2");
        System.out.println("Best case -> Press No 3");

        int case_input=user_input.nextInt();
        user_input.close();
        return case_input;
    }
}

class Genarate_num{//Class for create 1000 elements random numbers array
    public int[] Genarate_numbers(){
        Random rand=new Random();
        int arr[]=new int[1000];
        for(int i=0; i<1000; i++){
            arr[i]=rand.nextInt(10000);
        }
        return arr;
    }   
}

//Class for insertion method
class Insert_sort{
    Insert_sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

//Class for selection method
class Select_sort{
    Select_sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                   min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
}

//Class for bubble method
class Bubble_sort{
    Bubble_sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

//Class for sorting the first half of the array
class Avg_sort{
    Avg_sort(int[] arr){
        for(int i=0; i<500; i++){
            for(int j=0; j<500-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}