package MakeChocolate;

public class MakeChocolate {
int small;
int big;
int goal;

public MakeChocolate()
{

}

public MakeChocolate(int small, int big, int goal)
{
    this.small = small;
    this.big = big;
    this.goal = goal;
}

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getBig() {
        return big;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int makeChocolate(int small, int big, int goal) {

        int rem = goal % 5;

        if (small + (big * 5) < goal)
            return -1;
        else if (rem <= small && goal - big * 5 > 4)
            return rem + 5;
        else if (rem <= small)
            return rem;
        else
            return -1;



//        int temp =0;
//        temp = (big * 5) - goal;
//        int little = small;
//        if(temp < 0){return -1;}
//        while(small > 0 || temp > 0){
//            temp = temp - 1;
//            little--;
//        }
//        return small;

    }

    @Override
    public String toString() {
        return "MakeChocolate{" +
                "small=" + small +
                ", big=" + big +
                ", goal=" + goal +
                '}';
    }
}
