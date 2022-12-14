/*package com.example.petsimulator;

public class Pet<isSameDayFeed> {
    /*Write a pet simulator
ability to give pet a name
ability to feed pet
ability to fast forward days
ability to change pet weight based on how much food in a day
feed once > 0.1 kg per day
feed 2 - 3 times > 0.25 kg per day
feed 4+ times > 1kg per day
ability to say a greeting to pet and receive different message
if pet has not eaten (total feed 0)
if pet is filled (total feed 3)
if pet has eaten too much (total feed > 3) */


        private final String name;
        private final String type;
        private int currentDay;
        private int lastFeedDay;
        private int totalFeedForDay;
        private float weight;

        public Pet(String name, String type, float weight) {
            this.name = name;
            this.type = type;
            this.weight = weight;
        }

        public String introduce() {
            return " my name is " + name + " and i am a " + type;
        }

        public String feed() {
            this.totalFeedForDay ++;
            return "Yummy!";
        }
        private float calculateWeightForFeed(){
            float additionWeight;
            boolean isSameDayFeed = this.isSameDayFeed();
        }
            /*feed once > 0.1 kg per day
              feed 2 - 3 times > 0.25 kg per day
              feed 4+ times > 1kg per day*/
            if (isSameDayFeed && (this.totalFeedForDay > 1 && this.totalFeedForDay < 4)) {
               additionWeight = 0.25f;
            } else if (isSameDayFeed() && this.totalFeedForDay >= 4) {
                additionWeight = 1f;
            } else {
                additionWeight = 0.1f;
            }
            return additionWeight;
}




        private boolean isSameDayFeed() {
            return currentDay == lastFeedDay;
        }
        public String nextDay(){
                this.currentDay ++;
                this.totalFeedForDay = 0;

            return "Day: " + this.currentDay + ":;It's a new day!";

        }
        public  float getWeight(){
            return this.weight;

        }
           public String sayHello(){
                if (totalFeedForDay == 0) return this.name + " is hungry, give food!";
                if (totalFeedForDay <= 3) return this.name + "Happy!, Tommy filled!";

                return "Help!! too much food!";


           }
    }

*/