import java.lang.System;
import java.util.*; 
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Youtubpost myYTvid = new Youtubpost();
        myYTvid.title = "How to learn OOP.";
        myYTvid.channelName = "Raijhin";
        myYTvid.postTime = "23 june 2025";
        System.out.println("Current Views: \n");
        myYTvid.view = scan.nextInt();
        System.out.println("Current Likes: \n");
        myYTvid.view = scan.nextInt();
        System.out.println("Current Comments: \n");
        myYTvid.view = scan.nextInt();
        System.out.println("How many times your mom watched your video? \n");
        int x = scan.nextInt();
        for(int i = 0 ; i < x ; i++){
            myYTvid.momWatched();
            int g = myYTvid.view;
            if(g%2==0){
                myYTvid.likeUpdate();
            }
            else myYTvid.countCommentsUpdate();
        }
        System.out.println("after mom watched your video, your view is : " + myYTvid.view + " \n");
        myYTvid.info();
        scan.close();
    }
}
