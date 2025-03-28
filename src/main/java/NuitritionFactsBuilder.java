

class NuitritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static class Builder {
        private final int servingSize;
        private final int Servings;
        private final int calories;
        private final int fat;
        private final int sodium;
        private final int carbohydrate;


        public Builder(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize = servingSize;
            Servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }
    }

    private NuitritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.Servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;

    }


    //  public NuitritionFacts build(){
    //return new NuitritionFacts(Builder);
    //}
//}
}