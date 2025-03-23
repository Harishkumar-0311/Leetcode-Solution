class Solution {
    public int addDigits(int num) {
        int sum=0;
if(num==0){
    return 0;

}else if(num!=9){
    sum=num%9;
    return sum;
}return 9;
}
    }      
    }
