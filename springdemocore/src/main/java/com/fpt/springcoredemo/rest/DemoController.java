package com.fpt.springcoredemo.rest;

import com.fpt.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //-------------------------------------
    //Field Injection
//    @Autowired
//    private Coach myCoach;
    // define a private field for the dependency
//    private Coach myCoach;
//    @Autowired
//    public  DemoController(Coach coach){
//        myCoach = coach;
//    }

//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return myCoach.getDailyWorkout();
//    }

    //----------------------------
    // Setter Injection
//    private Coach myCoach;
//    @Autowired
//    public  void doSomeStuff(Coach theCoach){
//        myCoach = theCoach;
//    }
//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return myCoach.getDailyWorkout();
//    }

// no need for constructor or setter
//    @Autowired
//    private Coach coach;
//    // no need for constructors or setter
//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout(){
//        return coach.getDailyWorkout();
//    }

    //----------------------------------
    // multiple imple Coach
    // @Qualifier
//    private Coach coach;
//
//    @Autowired
//    public DemoController(@Qualifier("tennisCoach") Coach coach) {
//        this.coach = coach;
//    }
  //---------------------------------
//    @Primary

//    private Coach coach;
//    @Autowired
//    public DemoController( Coach coach) {
//        this.coach = coach;
//    }

    //-------------------------------
//    @Lazy
//    @Autowired
//    @Qualifier("tennisCoach")
//    private Coach coach;
 // ------------------------------
//    @Scope
//    private Coach myCoach;
//    private Coach anotherCoach;
//
//    @Autowired
//    public DemoController(
//            @Qualifier("tennisCoach") Coach myCoach,
//            @Qualifier("tennisCoach") Coach anotherCoach)
//
//    {
//        this.myCoach = myCoach;
//        this.anotherCoach = anotherCoach;
//
//        System.out.println(myCoach.getClass().getSimpleName());
//        System.out.println(anotherCoach.getClass().getSimpleName());
//    }
//@GetMapping("/check")
//    public String check() {
//        return "comparing beans: mycoach == anotherCoach: " + (myCoach == anotherCoach);
// }
    //----------------------------


    //@Bean LifeCycle Methods

//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout() {
//        System.out.println(coach.getClass().getSimpleName());
//        return coach.getDailyWorkout();
//    }

    //------------------------------
//    @java config bean
    private  Coach coach;

    public DemoController(@Qualifier("aquatic")Coach coach) {
        System.out.println("In constructor: "+coach.getClass().getSimpleName());
        this.coach = coach;
    }
}
