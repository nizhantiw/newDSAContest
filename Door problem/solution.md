import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        int[] direction = new qint[n];
        List<Map<Integer, Integer>> entryList = new ArrayList();
        List<Map<Integer, Integer>> exitList = new ArrayList();
        for(int i=0;i<n;i++){
            time[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            direction[i]=sc.nextInt();
            Map<Integer, Integer> map =new HashMap();
            map.put(time[i],i);
            if(direction[i]==0){
                entryList.add(map);
            }
            else
            {
                exitList.add(map);
            }
        }
        int[] res = new int[n];
        Arrays.fill(res, -1);
        int i=0, j=0, t=0, entryTime=0, exitTime=0;
        boolean prevExit = true;
        while(entryList.size()!= i || exitList.size()!= j)
        {
            int s = 0, e= 0;
            if(entryList.size() == i)
            {
                entryTime = Integer.MAX_VALUE;
            }
            else
            {
                for(Map.Entry<Integer, Integer> entry : entryList.get(i).entrySet()){
                    s = entry.getKey();
                }
                entryTime = s;

            }
            if(exitList.size() == j)
            {
                exitTime = Integer.MAX_VALUE;
            }
            else{
                for(Map.Entry<Integer, Integer> entry : exitList.get(j).entrySet()){
                    e = entry.getKey();
                }
                exitTime = e;
            }
            if(entryTime < t) entryTime = t;
            if(exitTime < t ) exitTime = t;
            if(entryTime == exitTime){
                if(entryTime == t){
                if(prevExit){
                    res[exitList.get(j).get(e)]= exitTime;
                    j++;
                    t= exitTime + 1;
                }
                else{
                    res[entryList.get(i).get(s)] = entryTime;
                    i++;
                    t = entryTime + 1;
                }
            }
            else{
                res[exitList.get(j).get(e)] = exitTime;
                j++;
                t=exitTime +1;
                prevExit = true;
            }
        }
        else{
            if(entryTime < exitTime){
                res[entryList.get(i).get(s)] = entryTime;
                i++;
                t = entryTime + 1;
                prevExit = false;
            }
            else{
                res[exitList.get(j).get(e)] = exitTime;
                j++;
                t = exitTime + 1;
                prevExit = true;
            }
        }
    
        }
    for(int value : res)
        System.out.print(value + " ");
    }
}