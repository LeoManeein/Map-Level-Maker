//Leo Maneein
import java.util.Scanner;
public class MapLevelMaker
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a level map width: ");
        int width = scan.nextInt();
        System.out.print("Enter a level map height: ");
        int height = scan.nextInt();
        String[][] map = new String [height][width];
        for (int i = 0; i< map.length; i++)
        {
            System.out.println();
            for (int j = 0; j<map[0].length; j++)
            {
                map [i][j] = "*";
                System.out.print(map[i][j]);
            }
        }
        int index = 0;
        int x;
        int y;
        int length;
        do {
            System.out.print("\n\nOptions\n1. Clear Level\n2. Add Platform\n3. Add Item\n4. Quit\nEnter a choice: ");
            index = scan.nextInt();
            switch (index)
            {
                case 1:
                    System.out.print("\n[Clear Level]");
                    for (int i = 0; i< map.length; i++)
                    {
                        for (int j = 0; j<map[0].length; j++)
                        {
                            map [i][j] = "*";
                        }
                    }
                    break;
                case 2:
                    System.out.print("\n[Add Platform]\n");
                    System.out.print("Enter X coordinate: ");
                    x = scan.nextInt();
                    System.out.print("Enter Y coordinate: ");
                    y = scan.nextInt();
                    System.out.print("Enter Length: ");
                    length = scan.nextInt();
                    if (length+x-1>=map[0].length||y>= map.length)
                    {
                        System.out.print("This platform won’t fit in the level!");
                    }
                    else
                    {
                        for (int i = 0; i< length; i++)
                        {
                            map [y][x+i] = "=";
                        }
                    }
                    break;
                case 3:
                    System.out.print("\n[Add Item]\n");
                    System.out.print("Enter X coordinate: ");
                    x = scan.nextInt();
                    System.out.print("Enter Y coordinate: ");
                    y = scan.nextInt();
                    if (x>=map[0].length||y>= map.length)
                    {
                        System.out.print("This is not a valid location!");
                    }
                    else
                    {
                        map [y][x] = "O";
                    }
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            for (int i = 0; i<map.length; i++)
            {
                System.out.println();
                for(int j = 0; j<map[0].length;j++)
                {
                    System.out.print(map[i][j]);
                }
            }
        } while (index != 4);
        System.out.print("\n\nGoodbye!");
    }
}
