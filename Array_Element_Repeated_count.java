class freq{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,1,2,2,3};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i=0;i<n;i++)
        {
            if(visited[i]==true)
            continue;
            int c=1;
            for (int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j] = true;
                    c++;
                }
            }
            System.out.println(arr[i]+" reapeated " + c +" times");
        }

    }
}
