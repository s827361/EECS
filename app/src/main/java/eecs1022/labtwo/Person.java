package eecs1022.labtwo;

/**
 * Created by user on 1/24/18.
 */
public class Person
{
    double income;
    String name;
    String selectedItem;

    public Person(String n, double in, String sel){
        this.name=n;
        this.income=in;
        this.selectedItem=sel;


    }
    public String toString()
    {
        String s = "";
        s += this.name;
        double t1 = 0;
        double t2 = 0;
        double t3 = 0;
        double t4 = 0;


        if (selectedItem.equals("Single"))
        {
            if (income < 8350)
            {
                t1 = income * 0.1;
                t2 = 0;
                t3 = 0;
                t4 = 0;


            } else if (income < 33950 && income > 8350)
            {
                t1 = 8350 * 0.1;
                t2 = (income - 8350) * 0.15;
                t3 = 0;
                t4 = 0;

            } else if (income > 33950 && income < 82250)
            {
                t1 = 8350 * 0.1;
                t2 = (33950 - 8350) * 0.15;
                t3 = (income - 33950) * 0.25;
                t4 = 0;
            }
            else {
                t1 = 8350 * 0.1;
                t2 = ( 33950 - 8350 ) * 0.15;
                t3 = ( 82250 - 33950) * 0.25;
                t4 = ( income - 82250) *0.30;

            }

            double total= t1 +t2 +t3 +t4;
            String ttt = String.format("%.2f",total);
            s += "'s tax due is $" ;
            s += ttt ;
            s += "\n";

            s += "Calculation is based on the scheme of Single  Filing:";
            s += "\n";





        } else if (selectedItem.equals("Household"))
        {
            if (income < 16700)
            {
                t1 = income * 0.1;
                t2 = 0;
                t3 = 0;
                t4 = 0;


            } else if (income < 67900 && income > 16700)
            {
                t1 = 16700 * 0.1;
                t2 = (income - 16700) * 0.15;
                t3 = 0;
                t4 = 0;

            } else if (income > 67900 && income < 137050)
            {
                t1 = 16700 * 0.1;
                t2 = (67900 - 16700) * 0.15;
                t3 = (income - 67900) * 0.25;
                t4 = 0;
            }
            else {
                t1 = 16700 * 0.1;
                t2 = ( 67900 - 16700 ) * 0.15;
                t3 = ( 137050 - 67900) * 0.25;
                t4 = ( income - 137050) *0.30;

            }
            double total= t1 +t2 +t3 +t4;
            String ttt = String.format("%.2f",total);
            s += "'s tax due is $";
            s += ttt ;
            s += "\n";

            s +=  "Calculation is based on the scheme of Household  Filing:";
            s += "\n";

        } else if (selectedItem.equals("Married"))
        {
            if (income < 11950)
            {
                t1 = income * 0.1;
                t2 = 0;
                t3 = 0;
                t4 = 0;

            } else if (income < 11950 && income > 45500)
            {
                t1 = 11950 * 0.1;
                t2 = (income - 45500) * 0.15;
                t3 = 0;
                t4 = 0;

            } else if (income > 45500 && income < 117450)
            {
                t1 = 11950 * 0.1;
                t2 = (45500 - 11950) * 0.15;
                t3 = (income - 45500) * 0.25;
                t4 = 0;
            }
            else {
                t1 = 11950 * 0.1;
                t2 = ( 45500 - 11950 ) * 0.15;
                t3 = ( 117450 - 45500) * 0.25;
                t4 = ( income - 117450) *0.30;

            }
            double total= t1 +t2 +t3 +t4;
            String ttt = String.format("%.2f",total);
            s += "'s tax due is $";
            s += ttt ;
            s += "\n";

            s += "Calculation is based on the scheme of Married  Filing:";
            s += "\n";

        }
        String tt1 = String.format("%.2f",t1);
        String tt2 = String.format("%.2f",t2);
        String tt3 = String.format("%.2f",t3);
        String tt4 = String.format("%.2f",t4);

        s += "Part I: $ ";
        s += tt1 ;
        s += "\n";
        s += "Part II: $";
        s += tt2 ;
        s += "\n";
        s += "Part III:$";
        s += tt3 ;
        s += "\n";
        s += "Part IV:$";
        s += tt4 ;
        return s;


    }
}
