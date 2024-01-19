public class TrappingRainwater {

    public static int trappedRainWater(int height[]){
        int n=height.length;

        //calculate  the max boundary
        int leftMAx[] = new int[n];
        leftMAx[0] = height[0];

        for (int i=1;i<n;i++){
            leftMAx[i]=Math.max(height[i],leftMAx[i-1]);
        }
        //calculate right max boundary[
        int rightMax[]= new int[n];
        rightMax[n-1] = height[n-1];

        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedwater =0;

        //Usining loop
        for(int i=0;i<n;i++){
            int watelevel =Math.min(leftMAx[i], rightMax[i]);
            trappedwater += watelevel - height[i];

        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[]={4, 2, 0, 6, 3, 2, 5};

        System.out.println(trappedRainWater(height));
    }
}
