class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        int maxDeadLine = Integer.MIN_VALUE;
        int result[] = new int[2];
        Arrays.sort(arr, new Comparator<Job>(){
            @Override
            public int compare(Job a, Job b)
            {
                return Integer.compare(b.profit,a.profit);
            }
        });
        for(Job job:arr)
        {
            if(job.deadline > maxDeadLine)
            {
                maxDeadLine = job.deadline;
            }
        }
        int schedule[] = new int[maxDeadLine];
        for(int i=0;i<maxDeadLine;i++)
        {
            schedule[i] = -1;
        }
        for(Job job:arr)
        {
            for(int i=job.deadline;i>=1;i--)
            {
                if(schedule[i-1] == -1)
                {
                    schedule[i-1] = job.id;
                    result[0]++;
                    result[1] += job.profit;
                    break;
                }
            }
        }
        return result;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
