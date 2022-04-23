class Solution {
    public int numberOfSteps(int num)
    {
        return numberOfStepsImpl(num,0);
    }
    
    public int numberOfStepsImpl(int num,int count)
    {
        if (num == 0)
        {
            return count;
        }
        
        else if (num % 2 == 0)
        {
            count++;
            return numberOfStepsImpl(num / 2,count);
        }
        
        else
        {
            count++;
            return numberOfStepsImpl(num - 1,count);
        }
    }
}