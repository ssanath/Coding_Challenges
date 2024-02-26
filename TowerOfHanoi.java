class HanoiTower {
    public static void towerHanoi(int n, String src, String inter, String dest){
        if(n == 1)
        {
            System.out.println("Transferred 1 disk from "+src+" to "+dest);
            return;
        }
        towerHanoi(n-1,src,dest,inter);
        System.out.println("Transferred 1 disk from "+src+" to "+dest);
        towerHanoi(n-1,inter,src,dest);
    }
    public static void main(String[] args) {
        int n = 3;
        String src = "S";
        String inter = "I";
        String dest = "D";
        towerHanoi(n,src,inter,dest);
    }
}
