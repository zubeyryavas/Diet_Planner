public class Maintenance_Calories {
    private final int age;
    private final int height;
    private final double body_weight;
    private final String sex;
    private final int _case;
    private double BMR;
    private double maintenance_calories;

    public Maintenance_Calories(int age, int height, double body_weight,String sex,int _case){
        this.age = age;
        this.height = height;
        this.body_weight = body_weight;
        this.sex = sex;
        this._case = _case;
    }
    public double calculate_BMR(){
        switch (sex){
            case "man":
                BMR = 66.47 + (13.75*body_weight) + (5.003 * height) - (6.755*age);
                break;
            case "woman":
                BMR = 655.1 + (9.563*body_weight) + (1.85*height) - (4.676*age);
                break;

        }
        return BMR;
    }
    public double calculate_maintenance_calories(){
        switch (_case){
            case 1:
                maintenance_calories= calculate_BMR()*1.2;
                break;
            case 2:
                maintenance_calories= calculate_BMR()*1.375;
                break;
            case 3:
                maintenance_calories= calculate_BMR()*1.55;
                break;
            case 4:
                maintenance_calories= calculate_BMR()*1.725;
                break;
            case 5:
                maintenance_calories= calculate_BMR()*1.9;
                break;
        }
        return maintenance_calories;
    }

    @Override
    public String toString() {
        return "DAILY MAINTENANCE CALORIES : " + (int)calculate_maintenance_calories() +"";
    }
}
