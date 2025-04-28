//package second;
//import second.ArrayList;
//public class QuickSort {
//
//    public Arr solution(ArrayList<Integer> arr){
//        ArrayList<Integer> left = new ArrayList<>();
//        ArrayList<Integer> right = new ArrayList<>();
//        ArrayList<Integer> pivot = new ArrayList<>();
//        if(arr.getSize()<=1){
//            return arr;
//        }
//        else{
//            pivot.addLast(arr.get(0));
//            for(int i = 1 ; i < arr.getSize() ; i++){
//                if(arr.get(i)<pivot.get(0)){
//                    left.addLast(arr.get(i));
//                }
//            }
//            for(int i = 1 ; i < arr.getSize() ; i++){
//                if(arr.get(i)>=pivot.get(0)){
//                    right.addLast(arr.get(i));
//                }
//            }
//        }
//        solution(left);
//        solution(right);
//    }
//}
