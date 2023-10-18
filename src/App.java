public class App {
    public static void main(String[] args) throws Exception {
        //a) vi behöver lösa ut denna kod och varför den inte funkar: 
        // int litetTal=10;
        // if(litetTal < 1000)
        // { 
        // int stortTal=1000;
        // System.out.println(litetTal +" är mindre än "+stortTal);
        // }
        // else
        // {
        // System.out.println(litetTal +" är mindre än "+stortTal);
        // }
        // System.out.println("litetTal="+litetTal+", stortTal="+stortTal);

        // int litetTal=10;
        // int stortTal=1000;
        // if(litetTal < 1000)
        // {
        // System.out.println(litetTal +" är mindre än "+stortTal);
        // }
        // else
        // {
        // System.out.println(litetTal +" är mindre än "+stortTal);
        // }
        // System.out.println("litetTal="+litetTal+", stortTal="+stortTal);

        //Svar: Det ända märkvärdiga vi behövde ändra på i koden var att flytta upp int stortal från if-satsen till ovan ifrån den vilket gör att den funkar för både else och if.
    }
}
