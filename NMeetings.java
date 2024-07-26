//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class meeting
{
    int start,end;
    
    meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting m1, meeting m2) {
        return m1.end - m2.end;
    }
    
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int count = 1;
        List<meeting> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(new meeting(start[i],end[i]));
        }
        meetingComparator mc = new meetingComparator();
        Collections.sort(list,mc);
        int limit = list.get(0).end;
        for(int i=1;i<n;i++) {
            if(list.get(i).start>limit) {
                count++;
                limit = list.get(i).end;
            }
        }
        return count;
    }
}
