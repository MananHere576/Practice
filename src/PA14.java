import java.util.Scanner;

public class PA14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Player arr[] = new Player[4];

        for(int i=0;i<4;i++)
        {
            int playerId = sc.nextInt();
            sc.nextLine();

            String playerName = sc.nextLine();

            int runs = sc.nextInt();
            sc.nextLine();

            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            arr[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();

        int res = findPlayerWithLowestRuns(arr, inp1);

        if(res > 0)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("No such player");
        }

        Player ans[] = findPlayerByMatchType(arr, inp2);

        if(ans == null)
        {
            System.out.println("No Player with given matchType");
        }
        else
        {
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(ans[i].getplayerId());
            }
        }
    }

    public static int findPlayerWithLowestRuns(Player arr[], String inp1)
    {
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getplayerType().equalsIgnoreCase(inp1))
            {
                if(arr[i].getruns() < min)
                {
                    min = arr[i].getruns();
                    found = true;
                }
            }
        }

        if(found)
            return min;

        return 0;
    }

    public static Player[] findPlayerByMatchType(Player arr[], String inp2)
    {
        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getmatchType().equalsIgnoreCase(inp2))
            {
                count++;
            }
        }

        if(count == 0)
        {
            return null;
        }

        Player brr[] = new Player[count];
        int k = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getmatchType().equalsIgnoreCase(inp2))
            {
                brr[k++] = arr[i];
            }
        }

        // Descending order of playerId
        for(int i=0;i<brr.length-1;i++)
        {
            for(int j=i+1;j<brr.length;j++)
            {
                if(brr[i].getplayerId() < brr[j].getplayerId())
                {
                    Player temp = brr[i];
                    brr[i] = brr[j];
                    brr[j] = temp;
                }
            }
        }

        return brr;
    }
}

class Player
{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType)
    {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getplayerId()
    {
        return playerId;
    }

    public void setplayerId(int playerId)
    {
        this.playerId = playerId;
    }

    public String getplayerName()
    {
        return playerName;
    }

    public void setplayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public int getruns()
    {
        return runs;
    }

    public void setruns(int runs)
    {
        this.runs = runs;
    }

    public String getplayerType()
    {
        return playerType;
    }

    public void setplayerType(String playerType)
    {
        this.playerType = playerType;
    }

    public String getmatchType()
    {
        return matchType;
    }

    public void setmatchType(String matchType)
    {
        this.matchType = matchType;
    }
}