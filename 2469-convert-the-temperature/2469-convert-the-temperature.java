class Solution {
    public double[] convertTemperature(double celsius) {
        double[]ans=new double[2];
        ans[0]=celsius+273.15f;
        ans[1]=(celsius*1.80)+32;
        return ans;
    }
}