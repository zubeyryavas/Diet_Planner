public class Plan {
    private final double body_weight;
    private final double body_fat;
    private final double desired_body_fat;
    private final double maintenance_calories;
    private final double WEEKLY_LOSING_AMOUNT= 0.007;
    private final double ONE_KG_TO_LBS = 2.204;
    private final double ONE_LB_TO_KG = 0.453;
    private final double CALORIES_EQUALS_TO_ONE_KG = 7700;
    private final double DAYS_OF_WEEK = 7;

    public Plan(double body_weight, double body_fat, double desired_body_fat, double maintenance_calories){
        this.body_fat=body_fat;
        this.body_weight=body_weight;
        this.desired_body_fat=desired_body_fat;
        this.maintenance_calories=maintenance_calories;
    }
    public void calculate_all(){

        double body_weight_as_lbs = body_weight*ONE_KG_TO_LBS;
        double fat_amount_lbs = (body_fat/100)*body_weight_as_lbs;
        double body_weight_without_fat_lbs = body_weight_as_lbs-fat_amount_lbs;

        double goal_body_weight_lbs = (body_weight_without_fat_lbs)/(1-(desired_body_fat/100));
        double lbs_fat_to_lose = body_weight_as_lbs-goal_body_weight_lbs;
        double goal_weight_loss_per_week_lbs = WEEKLY_LOSING_AMOUNT*body_weight_as_lbs;

        int weeks_to_complete_the_diet = (int)(lbs_fat_to_lose/goal_weight_loss_per_week_lbs);
        double goal_weight_loss_per_week_kg = goal_weight_loss_per_week_lbs*ONE_LB_TO_KG;

        double weekly_calories = maintenance_calories*DAYS_OF_WEEK;
        double weekly_calorie_deficit = CALORIES_EQUALS_TO_ONE_KG*goal_weight_loss_per_week_kg;
        double weekly_calories_to_take = weekly_calories-weekly_calorie_deficit;
        int daily_calories_to_take = (int)(weekly_calories_to_take/DAYS_OF_WEEK);


        System.out.println("" + weeks_to_complete_the_diet + "-" + (weeks_to_complete_the_diet+1) + " WEEKS TO REACH THE GOAL.");
        System.out.println("" +  (daily_calories_to_take-100)+ "-" + (daily_calories_to_take) + " CALORIES, TAKE THIS AMOUNT OF CALORIES EVERY DAY.");



    }


}
