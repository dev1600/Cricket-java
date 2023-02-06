package rungenerator;

public class Generator {
    public static int generateRuns(){
        return (int)(Math.random()*8);

    }
    static int generateForBatsman(double r){
        if(r>=0 && r<=0.3){
            return 0;
        }
        else if(r>0.3 && r<=0.72){
            return 1;
        }
        else if(r>0.72 && r<=0.77){
            return 2;
        }
        else if(r>0.77 && r<=0.8){
            return 3;
        }
        else if(r>0.8 && r<=0.925){
            return 4;
        }
        else if(r>0.925 && r<=0.975){
            return 6;
        }
        return 7;

    }
    public static int generateForBowler(double r){
        if(r>=0 && r<=0.4){
            return 0;
        }
        else if(r>0.4 && r<=0.72){
            return 1;
        }
        else if(r>0.72 && r<=0.75){
            return 2;
        }
        else if(r>0.75 && r<=0.78){
            return 3;
        }
        else if(r>0.78 && r<=0.85){
            return 4;
        }
        else if(r>0.85 && r<=0.90){
            return 6;
        }
        return 7;
    }
    public static int generateRuns(String role){
        double r=Math.random();
        return role.equals("Bat")?generateForBatsman(r):generateForBowler(r);

    }
}
