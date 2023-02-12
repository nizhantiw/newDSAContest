import java.io._;
import java.util._;

class Main {
public static void main (String[] args) throws Exception{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String[] input = reader.readLine().split(" ");
int a = Integer.parseInt(input[0]);
int b = Integer.parseInt(input[1]);
long sum = 0;
for(int i = a; i <= b; ++i) {
int tmp =i;
while(tmp%2 == 0) {
sum += tmp;

                    tmp/=2;
                }

        }
        System.out.println(sum);
    }

}
