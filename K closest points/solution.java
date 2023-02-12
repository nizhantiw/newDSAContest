public static ArrayList<pair> kNeighbourPoints(ArrayList<pair> points, pair P, int K)
{
// Your code here
ArrayList<pair> ans=new ArrayList<>();
ArrayList<pair1> dist=new ArrayList<>();
for(int i=0;i<points.size();i++){
long point1=(points.get(i).first-P.first);
long point2=(points.get(i).second-P.second);
long val=point1*point1 + point2*point2;
dist.add(new pair1(val,points.get(i)));
}

        Collections.sort(dist,new Comparator<pair1>(){
            public int compare(pair1 p1,pair1 p2){
               return  p1.third < p2.third? - 1:1;
            }
        });
        for(int i=0;i<K;i++){
            ans.add(dist.get(i).p);
        }
        return ans;

}
static class pair1{
long third;
pair p;
pair1(long t,pair p){

                 this.third=t;
                 this.p=p;
             }
         }
