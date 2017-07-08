import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static boolean isReplicable(String[] collection, String[] ransom) {
		ArrayList<String> cols = new ArrayList<String>(Arrays.asList(collection));
		ArrayList<String> rans = new ArrayList<String>(Arrays.asList(ransom));
		int count = 0;
		for(int i = 0; i < rans.size(); i++) {
			boolean exist = false;
			for(int j = 0; j < cols.size(); j++) {
				if(rans.get(i).equals(cols.get(j))) {
					cols.remove(j);
					exist = true;
					count++;
					break;
				}
			}
			if(!exist)
				return false;
		}
		return count == rans.size();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
		if(isReplicable(magazine, ransom))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}