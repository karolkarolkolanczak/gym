package com.example.elgrande.data;

import com.example.elgrande.repository.UserRepository;
import com.example.elgrande.service.diet_service.DietRepository;
import com.example.elgrande.service.diet_service.IngredientRepository;
import com.example.elgrande.service.diet_service.MealRepository;
import com.example.elgrande.service.training_service.ExerciseRepository;
import com.example.elgrande.service.training_service.TrainingRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private TrainingRepository trainingRepository;
    private ExerciseRepository exerciseRepository;
    private DietRepository dietRepository;
    private MealRepository mealRepository;
    private IngredientRepository ingredientRepository;
@Autowired
    public DataInitializer(UserRepository userRepository, TrainingRepository trainingRepository, ExerciseRepository exerciseRepository, DietRepository dietRepository, MealRepository mealRepository, IngredientRepository ingredientRepository) {
        this.userRepository = userRepository;
        this.trainingRepository = trainingRepository;
        this.exerciseRepository = exerciseRepository;
        this.dietRepository = dietRepository;
        this.mealRepository = mealRepository;
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public void run(String... args) throws Exception {

/*
//Proper Diet Database
        //Meso
        /*
        Ingredient beefStrips = new Ingredient("Beef Strips", 250);
        Ingredient chickenBreast = new Ingredient("Chicken Breast", 165);
        Ingredient chickenStrips = new Ingredient("Chicken Strips", 239);
        Ingredient eggs = new Ingredient("Eggs", 155);
        Ingredient grilledChickenStrips = new Ingredient("Grilled Chicken Strips", 300);
        Ingredient grilledShrimp = new Ingredient("Grilled Shrimp", 154);
        Ingredient groundBeef = new Ingredient("Ground Beef", 330);
        Ingredient groundTurkey = new Ingredient("Ground Turkey", 203);
        Ingredient gyroMeat = new Ingredient("Gyro Meat", 209);
        Ingredient hardBoiledEggs = new Ingredient("Hard-Boiled Eggs", 155);
        Ingredient pork = new Ingredient("Pork", 242);
        Ingredient pulledPork = new Ingredient("Pulled Pork", 167);
        Ingredient salmonFillet = new Ingredient("Salmon Fillet", 334);
        Ingredient shrimp = new Ingredient("Shrimp", 99);
        Ingredient tuna = new Ingredient("Tuna", 132);
        Ingredient turkeySlices = new Ingredient("Turkey Slices", 189);
        Ingredient sirloinSteak = new Ingredient("Sirloin Steak", 244);
        Ingredient porkRibs = new Ingredient("Pork Ribs", 361);
        Ingredient porkShoulder = new Ingredient("Pork Shoulder", 269);
        Ingredient baconStrips = new Ingredient("Bacon Strips", 477);
        Ingredient lambChops = new Ingredient("Lamb Chops", 294);
        Ingredient chickenWings = new Ingredient("Chicken Wings", 203);
        //Nabiał
        Ingredient cheddarCheese = new Ingredient("Cheddar Cheese", 402);
        Ingredient fetaCheese = new Ingredient("Feta Cheese", 263);
        Ingredient mozzarellaCheese = new Ingredient("Mozzarella Cheese", 248);
        Ingredient parmesanCheese = new Ingredient("Parmesan Cheese", 431);
        Ingredient ricottaCheese = new Ingredient("Ricotta Cheese", 174);
        Ingredient tofu = new Ingredient("Tofu", 76);
        Ingredient butter = new Ingredient("Butter", 717);
        Ingredient sourCream = new Ingredient("SourCream", 193);
        //Warzywa
        Ingredient avocado = new Ingredient("Avocado", 160);
        Ingredient basil = new Ingredient("Basil", 23);
        Ingredient blackBeans = new Ingredient("Black Beans", 132);
        Ingredient broccoli = new Ingredient("Broccoli", 34);
        Ingredient carrots = new Ingredient("Carrots", 41);
        Ingredient celery = new Ingredient("Celery", 8);
        Ingredient cherryTomatoes = new Ingredient("Cherry Tomatoes", 18);
        Ingredient chickpeas = new Ingredient("Chickpeas", 364);
        Ingredient coleslaw = new Ingredient("Coleslaw", 152);
        Ingredient corn = new Ingredient("Corn", 86);
        Ingredient cucumber = new Ingredient("Cucumber", 16);
        Ingredient eggplantSlices = new Ingredient("Eggplant Slices", 25);
        Ingredient freshBasil = new Ingredient("Fresh Basil", 22);
        Ingredient garlic = new Ingredient("Garlic", 150);
        Ingredient ginger = new Ingredient("Ginger", 80);
        Ingredient greenBeans = new Ingredient("Green Beans", 31);
        Ingredient kalamataOlives = new Ingredient("Kalamata Olives", 88);
        Ingredient kale = new Ingredient("Kale ", 50);
        Ingredient lemon = new Ingredient("Lemon", 29);
        Ingredient lentils = new Ingredient("Lentils", 353);
        Ingredient lettuce = new Ingredient("Lettuce", 15);
        Ingredient lime = new Ingredient("Lime", 30);
        Ingredient mixedGreens = new Ingredient("Mixed Greens", 9);
        Ingredient mushrooms = new Ingredient("Mushrooms", 22);
        Ingredient onion = new Ingredient("Onion", 40);
        Ingredient orange = new Ingredient("Orange", 47);
        Ingredient parsley = new Ingredient("Parsley", 36);
        Ingredient pickles = new Ingredient("Pickles", 11);
        Ingredient pineappleChunks = new Ingredient("Pineapple Chunks", 50);
        Ingredient potatoes = new Ingredient("Potatoes", 313);
        Ingredient redBellPeppers = new Ingredient("Red Bell Peppers", 31);
        Ingredient redOnion = new Ingredient("Red Onion", 42);
        Ingredient romaineLettuce = new Ingredient("Romaine Lettuce", 17);
        Ingredient rosemary = new Ingredient("Rosemary", 131);
        Ingredient scallions = new Ingredient("Scallions", 32);
        Ingredient snowPeas = new Ingredient("Snow Peas", 67);
        Ingredient spinach = new Ingredient("Spinach", 23);
        Ingredient sweetPotatoes = new Ingredient("Sweet Potatoes", 86);
        Ingredient tomatoes = new Ingredient("Tomatoes", 19);
        Ingredient zucchini = new Ingredient("Zucchini", 17);
        //Zapychacze
        Ingredient arborioRice = new Ingredient("Arborio Rice", 130);
        Ingredient brownRice = new Ingredient("Brown Rice", 111);
        Ingredient cornTortillas = new Ingredient("Corn Tortillas", 218);
        Ingredient fettuccinePasta = new Ingredient("Fettuccine Pasta", 99);
        Ingredient flourTortillas = new Ingredient("Flour Tortillas", 287);
        Ingredient hamburgerBun = new Ingredient("Hamburger Bun", 150);
        Ingredient jasmineRice = new Ingredient("Jasmine Rice", 170);
        Ingredient lasagnaPasta = new Ingredient("Lasagna Pasta", 354);
        Ingredient linguinePasta = new Ingredient("Linguine Pasta", 353);
        Ingredient pennePasta = new Ingredient("Penne Pasta", 157);
        Ingredient pitaBread = new Ingredient("Pita Bread", 275);
        Ingredient quinoa = new Ingredient("Quinoa", 370);
        Ingredient spaghettiPasta = new Ingredient("Spaghetti Pasta", 158);
        Ingredient sushiRice = new Ingredient("Sushi Rice", 139);
        Ingredient tagliatellePasta = new Ingredient("Tagliatelle Pasta", 288);
        Ingredient wholeWheatWrap = new Ingredient("Whole Wheat Wrap", 263);
        //Sosy
        Ingredient alfredoSauce = new Ingredient("Alfredo Sauce", 410);
        Ingredient BBQSauce = new Ingredient("BBQ Sauce", 172);
        Ingredient caesarDressing = new Ingredient("Caesar Dressing", 269);
        Ingredient dijonMustard = new Ingredient("Dijon Mustard", 66);
        Ingredient hotSauce = new Ingredient("Hot Sauce", 11);
        Ingredient marinaraSauce = new Ingredient("Marinara Sauce", 51);
        Ingredient pestoSauce = new Ingredient("Pesto Sauce", 534);
        Ingredient salsa = new Ingredient("Salsa", 36);
        Ingredient teriyakiSauce = new Ingredient("Teriyaki Sauce", 84);
        Ingredient tomatoSauce = new Ingredient("Tomato Sauce", 29);
        Ingredient tzatzikiSauce = new Ingredient("Tzatziki Sauce", 85);
        //Dodatki
        Ingredient balsamicGlaze = new Ingredient("Balsamic Glaze", 88);
        Ingredient brownSugar = new Ingredient("Brown Sugar", 380);
        Ingredient breadCrumbs = new Ingredient("Bread Crumbs", 395);
        Ingredient cayennePepper = new Ingredient("Cayenne Pepper", 318);
        Ingredient chickenBroth = new Ingredient("Chicken Broth", 267);
        Ingredient chiliPowder = new Ingredient("Chili Powder", 282);
        Ingredient coconutMilk = new Ingredient("Coconut Milk", 230);
        Ingredient croutons = new Ingredient("Croutons", 465);
        Ingredient cumin = new Ingredient("Cumin", 375);
        Ingredient curryPowder = new Ingredient("Curry Powder", 325);
        Ingredient freshMint = new Ingredient("Fresh Mint", 58);
        Ingredient garlicPowder = new Ingredient("Garlic Powder", 331);
        Ingredient vegetableBroth = new Ingredient("Vegetable Broth", 11);
        Ingredient mixedHerbs = new Ingredient("Mixed Herbs", 303);
        Ingredient oliveOil = new Ingredient("Olive Oil", 884);
        Ingredient paprika = new Ingredient("Paprika", 282);
        Ingredient pineNuts = new Ingredient("Pine Nuts", 673);
        Ingredient soySauce = new Ingredient("Soy Sauce", 53);
        Ingredient tacoSeasoning = new Ingredient("Taco Seasoning", 292);
        Ingredient whiteWine = new Ingredient("White Wine", 82);

// 1. Spaghetti Bolognese
        Meal spaghettiBolognese = new Meal("Spaghetti Bolognese", FoodType.NORMAL, List.of(groundBeef, tomatoSauce, spaghettiPasta, onion, garlic),
                List.of(250, 200, 150, 50, 10), "1. Cook spaghetti according to package instructions.\n" +
                "2. In a pan, brown ground beef with chopped onions and garlic.\n" +
                "3. Add tomato sauce to the beef mixture and let it simmer.\n" +
                "4. Serve the Bolognese sauce over the cooked spaghetti.");

// 2. Vegetarian Stir-Fry
        Meal vegetarianStirFry = new Meal("Vegetarian Stir-Fry", FoodType.VEGAN, List.of(tofu, broccoli, redBellPeppers, carrots, soySauce),
                List.of(200, 150, 100, 75, 20), "1. Press tofu to remove excess water and cut into cubes.\n" +
                "2. Stir-fry tofu, broccoli, bell peppers, and carrots in a wok.\n" +
                "3. Add soy sauce and toss until well-cooked.\n" +
                "4. Serve over rice or noodles.");

// 3. Salmon Quinoa Bowl
        Meal salmonQuinoaBowl = new Meal("Salmon Quinoa Bowl", FoodType.VEGETARIAN, List.of(salmonFillet, quinoa, avocado, kale, lemon),
                List.of(180, 100, 80, 50, 10), "1. Grill salmon fillet until cooked through.\n" +
                "2. Cook quinoa according to package instructions.\n" +
                "3. Assemble the bowl with quinoa, grilled salmon, sliced avocado, and kale.\n" +
                "4. Squeeze lemon juice over the bowl before serving.");

// 4. Caprese Salad
        Meal capreseSalad = new Meal("Caprese Salad", FoodType.VEGETARIAN, List.of(mozzarellaCheese, tomatoes, freshBasil, balsamicGlaze, oliveOil),
                List.of(150, 100, 30, 20, 15), "1. Slice fresh mozzarella, tomatoes, and arrange on a plate.\n" +
                "2. Sprinkle fresh basil over the mozzarella and tomatoes.\n" +
                "3. Drizzle balsamic glaze and olive oil on top.\n" +
                "4. Season with salt and pepper to taste.");

// 5. Chicken Caesar Wrap
        Meal chickenCaesarWrap = new Meal("Chicken Caesar Wrap", FoodType.NORMAL, List.of(grilledChickenStrips, romaineLettuce, parmesanCheese, caesarDressing, wholeWheatWrap),
                List.of(200, 100, 50, 30, 50), "1. Grill chicken strips until fully cooked.\n" +
                "2. In a bowl, mix Romaine lettuce, Parmesan cheese, and Caesar dressing.\n" +
                "3. Lay out a whole wheat wrap, add the lettuce mixture, and top with grilled chicken.\n" +
                "4. Roll up the wrap and secure with a toothpick.");

// 6. Shrimp and Broccoli Alfredo
        Meal shrimpBroccoliAlfredo = new Meal("Shrimp and Broccoli Alfredo", FoodType.VEGETARIAN, List.of(shrimp, broccoli, fettuccinePasta, alfredoSauce, parmesanCheese),
                List.of(250, 150, 120, 100, 30), "1. Cook fettuccine pasta according to package instructions.\n" +
                "2. In a pan, sauté shrimp and broccoli until shrimp is pink and broccoli is tender.\n" +
                "3. Add Alfredo sauce and cooked pasta to the pan, toss until well coated.\n" +
                "4. Sprinkle Parmesan cheese on top before serving.");

// 7. Mushroom Risotto
        Meal mushroomRisotto = new Meal("Mushroom Risotto", FoodType.NORMAL, List.of(arborioRice, mushrooms, chickenBroth, whiteWine, parmesanCheese),
                List.of(200, 150, 250, 50, 40), "1. Sauté mushrooms in a pan until browned.\n" +
                "2. In a separate pot, cook Arborio rice in chicken broth.\n" +
                "3. Add sautéed mushrooms and white wine to the rice, stirring until creamy.\n" +
                "4. Finish by stirring in grated Parmesan cheese.");

// 7.1. Mushroom Risotto
        Meal vegetarianMushroomRisotto = new Meal("Vegetarian Mushroom Risotto", FoodType.VEGETARIAN, List.of(arborioRice, mushrooms, vegetableBroth, whiteWine, parmesanCheese),
                List.of(200, 150, 250, 50, 40), "1. Sauté mushrooms in a pan until browned.\n" +
                "2. In a separate pot, cook Arborio rice in vegetable broth.\n" +
                "3. Add sautéed mushrooms and white wine to the rice, stirring until creamy.\n" +
                "4. Finish by stirring in grated Parmesan cheese.");

// 8. Taco Salad
        Meal tacoSalad = new Meal("Taco Salad", FoodType.NORMAL, List.of(groundTurkey, lettuce, cherryTomatoes, blackBeans, cheddarCheese),
                List.of(200, 100, 75, 50, 40), "1. Cook ground turkey in a skillet until fully browned.\n" +
                "2. In a large bowl, combine cooked turkey, lettuce, cherry tomatoes, black beans, and shredded cheddar cheese.\n" +
                "3. Toss with your favorite dressing and top with crushed tortilla chips.");

// 9. Veggie Omelette
        Meal veggieOmelette = new Meal("Veggie Omelette", FoodType.VEGETARIAN, List.of(eggs, redBellPeppers, spinach, tomatoes, fetaCheese),
                List.of(3, 100, 50, 50, 30), "1. Whisk eggs in a bowl and season with salt and pepper.\n" +
                "2. In a non-stick skillet, sauté bell peppers, spinach, and tomatoes.\n" +
                "3. Pour the whisked eggs over the veggies and cook until set.\n" +
                "4. Fold the omelette in half and serve with crumbled feta cheese.");

// 10. Beef and Vegetable Stir-Fry
        Meal beefVegetableStirFry = new Meal("Beef and Vegetable Stir-Fry", FoodType.NORMAL, List.of(beefStrips, broccoli, snowPeas, carrots, ginger),
                List.of(250, 100, 75, 50, 10), "1. Sauté beef strips in a wok until browned.\n" +
                "2. Add broccoli, snow peas, carrots, and ginger, stir-frying until vegetables are tender.\n" +
                "3. Pour soy sauce over the stir-fry and toss until well-coated.\n" +
                "4. Serve over rice.");

// 11. Caesar Salad with Grilled Shrimp
        Meal caesarSaladGrilledShrimp = new Meal("Caesar Salad with Grilled Shrimp", FoodType.VEGETARIAN, List.of(grilledShrimp, romaineLettuce, croutons, caesarDressing, parmesanCheese),
                List.of(200, 100, 50, 30, 20), "1. Grill shrimp until pink and fully cooked.\n" +
                "2. In a large bowl, mix Romaine lettuce, croutons, Parmesan cheese, and Caesar dressing.\n" +
                "3. Top the salad with grilled shrimp.\n" +
                "4. Toss the salad and serve.");

// 12. Pesto Pasta with Cherry Tomatoes
        Meal pestoPastaCherryTomatoes = new Meal("Pesto Pasta with Cherry Tomatoes", FoodType.VEGETARIAN, List.of(pestoSauce, cherryTomatoes, pennePasta, pineNuts, parmesanCheese),
                List.of(100, 150, 120, 30, 25), "1. Cook penne pasta according to package instructions.\n" +
                "2. In a blender, combine pesto sauce, cherry tomatoes, and pine nuts.\n" +
                "3. Toss the cooked pasta in the pesto mixture.\n" +
                "4. Sprinkle grated Parmesan cheese on top before serving.");

// 13. Hawaiian Chicken Skewers
        Meal hawaiianChickenSkewers = new Meal("Hawaiian Chicken Skewers", FoodType.NORMAL, List.of(chickenBreast, pineappleChunks, redBellPeppers, redOnion, teriyakiSauce),
                List.of(200, 100, 75, 50, 30), "1. Thread chicken, pineapple chunks, bell peppers, and red onion onto skewers.\n" +
                "2. Grill skewers until chicken is fully cooked.\n" +
                "3. Baste with teriyaki marinade during grilling.\n" +
                "4. Serve skewers over rice.");

// 14. Sweet Potato and Black Bean Bowl
        Meal sweetPotatoBlackBeanBowl = new Meal("Sweet Potato and Black Bean Bowl", FoodType.VEGAN, List.of(sweetPotatoes, blackBeans, corn, avocado, lime),
                List.of(150, 100, 75, 50, 10), "1. Roast sweet potatoes until tender.\n" +
                "2. Mix roasted sweet potatoes with black beans, corn, and diced avocado.\n" +
                "3. Squeeze lime juice over the bowl before serving.\n" +
                "4. Season with salt and pepper to taste.");
*/
        //Diets -----------------------------------------------------------------------------------------------------------------
//
//        Ingredient egg = new Ingredient("egg", 150);
//        Ingredient ham = new Ingredient("ham", 200);
//
//        Meal meal1 = new Meal("meal1", FoodType.NORMAL, List.of(egg, ham), List.of(210, 110), "no instructions");
//        Meal meal2 = new Meal("meal2", FoodType.NORMAL, List.of(egg, ham), List.of(220, 120), "no instructions");
//        Meal meal3 = new Meal("meal3", FoodType.NORMAL, List.of(egg, ham), List.of(230, 130), "no instructions");
//        Meal meal4 = new Meal("meal4", FoodType.NORMAL, List.of(egg, ham), List.of(240, 140), "no instructions");
//        Meal meal5 = new Meal("meal5", FoodType.NORMAL, List.of(egg, ham), List.of(250, 150), "no instructions");
//        Meal meal6 = new Meal("meal6", FoodType.NORMAL, List.of(egg, ham), List.of(260, 160), "no instructions");
//        Meal meal7 = new Meal("meal7", FoodType.NORMAL, List.of(egg, ham), List.of(270, 170), "no instructions");
//
//        Diet diet1 = new Diet("diet1", List.of(meal1, meal2, meal3, meal4, meal5, meal6, meal7), FoodType.NORMAL, DietType.STAYING);
//        Diet diet2 = new Diet("diet2", List.of(meal1, meal2, meal3, meal4, meal5, meal6, meal7), FoodType.NORMAL, DietType.STAYING);
//        Diet diet3 = new Diet("diet3", List.of(meal1, meal2, meal3, meal4, meal5, meal6, meal7), FoodType.NORMAL, DietType.STAYING);
//
//        ingredientRepository.saveAll(List.of(egg, ham));
//        mealRepository.saveAll(List.of(meal1, meal2, meal3, meal4, meal5, meal6, meal7));
//        dietRepository.saveAll(List.of(diet1, diet2, diet3));
//
//            //Users -----------------------------------------------------------------------------------------------------------------

//
//       User user1 = new User("User1", "password1", "MALE",24,70, 170, Level.BEGINNER,24);
//       User user2 = new User("User2", "password2", "FEMALE",26,75, 175, Level.INTERMEDIATE, 10);
//       User user3 = new User("User3", "password3", "MALE",30,80, 180, Level.PROFESSIONAL,5);
//       User user4 = new User("User4", "password4", "FEMALE",34,85, 185, Level.ELITE,4);
//       User user5 = new User("User5", "password5", "MALE",44,90, 190, Level.EXPERT,0);
//
//       Exercise squats = new Exercise("Squats", Level.BEGINNER, Type.WEIGHTS,4,10,100);
//       Exercise running = new Exercise("Running", Level.EXPERT, Type.CARDIO, 1, 30, 0); // 0.0 for no weight
//       Exercise pushUps = new Exercise("Push-Ups", Level.BEGINNER, Type.WEIGHTS, 3, 15, 0);
//       Exercise deadlifts = new Exercise("Deadlifts", Level.INTERMEDIATE, Type.WEIGHTS, 3, 6, 225);
//       Exercise yoga = new Exercise("Yoga", Level.EXPERT, Type.CALISCENICKS, 1, 60, 0);
//
//       Training t1 = new Training("xd", Body.BICEPS,Level.BEGINNER);
//       Training t2 = new Training("tako",Body.CHEST,Level.INTERMEDIATE);
//       Training t3 = new Training("XDX", Body.BACK,Level.EXPERT);
//
//        userRepository.saveAll(List.of(user1, user2, user3, user4, user5));
//        exerciseRepository.saveAll(List.of(squats,running,pushUps,deadlifts));
//        trainingRepository.saveAll(List.of(t1,t2,t3));
//
//        User user1 = new User("User1", "password1", "MALE",24,70, 170, UserLevel.BEGINNER);
//        User user2 = new User("User2", "password2", "FEMALE",26,75, 175, UserLevel.INTERMEDIATE);
//        User user3 = new User("User3", "password3", "MALE",30,80, 180, UserLevel.PROFESSIONAL);
//        User user4 = new User("User4", "password4", "FEMALE",34,85, 185, UserLevel.ELITE);
//        User user5 = new User("User5", "password5", "MALE",44,90, 190, UserLevel.EXPERT);
//
//        //Exercises-----------------------------------------------------------------------------------------------------------------
//        Exercise barDipBeginner = new Exercise("Bar Dip", Type.CALISTHENICS, Body.CHEST, 5, 0, 3);
//        Exercise barDipIntermediate = new Exercise("Bar Dip", Type.CALISTHENICS, Body.TRICEPS, 10, 0, 3);
//        Exercise barDipAdvanced = new Exercise("Bar Dip", Type.CALISTHENICS, Body.TRICEPS, 15, 0, 3);
//        Exercise barDipElite = new Exercise("Bar Dip", Type.CALISTHENICS, Body.TRICEPS, 25, 0, 4);
//        Exercise barDipExpert = new Exercise("Bar Dip", Type.CALISTHENICS, Body.TRICEPS, 30, 0, 4);
//
//        Exercise benchPressBeginner = new Exercise("Bench Press", Type.WEIGHTS, Body.CHEST, 10, 60, 3);
//        Exercise benchPressIntermediate = new Exercise("Bench Press", Type.WEIGHTS, Body.CHEST, 10, 80, 3);
//        Exercise benchPressAdvanced = new Exercise("Bench Press", Type.WEIGHTS, Body.CHEST, 5, 100, 4);
//        Exercise benchPressElite = new Exercise("Bench Press", Type.WEIGHTS, Body.CHEST, 8, 140, 4);
//        Exercise benchPressExpert = new Exercise("Bench Press", Type.WEIGHTS, Body.CHEST, 10, 180, 3);
//
//        Exercise cableChestPressBeginner = new Exercise("Cable Chest Press", Type.WEIGHTS, Body.CHEST, 8, 15, 3);
//        Exercise cableChestPressIntermediate = new Exercise("Cable Chest Press", Type.WEIGHTS, Body.CHEST, 10, 45, 3);
//        Exercise cableChestPressAdvanced = new Exercise("Cable Chest Press", Type.WEIGHTS, Body.CHEST, 10, 70, 4);
//        Exercise cableChestPressElite = new Exercise("Cable Chest Press", Type.WEIGHTS, Body.CHEST, 12, 100, 4);
//        Exercise cableChestPressExpert = new Exercise("Cable Chest Press", Type.WEIGHTS, Body.CHEST, 15, 120, 5);
//
//        Exercise dumbbellChestPressBeginner = new Exercise("Dumbbell Chest Press", Type.WEIGHTS, Body.CHEST, 5, 20, 3);
//        Exercise dumbbellChestPressIntermediate = new Exercise("Dumbbell Chest Press", Type.WEIGHTS, Body.CHEST, 8, 30, 4);
//        Exercise dumbbellChestPressAdvanced = new Exercise("Dumbbell Chest Press", Type.WEIGHTS, Body.CHEST, 10, 50, 4);
//        Exercise dumbbellChestPressElite = new Exercise("Dumbbell Chest Press", Type.WEIGHTS, Body.CHEST, 10, 60, 4);
//        Exercise dumbbellChestPressExpert = new Exercise("Dumbbell Chest Press", Type.WEIGHTS, Body.CHEST, 10, 80, 5);
//
//        Exercise dumbbellChestFlyBeginner = new Exercise("Dumbbell Chest Fly", Type.WEIGHTS, Body.CHEST, 8, 20, 3);
//        Exercise dumbbellChestFlyIntermediate = new Exercise("Dumbbell Chest Fly", Type.WEIGHTS, Body.CHEST, 10, 25, 4);
//        Exercise dumbbellChestFlyAdvanced = new Exercise("Dumbbell Chest Fly", Type.WEIGHTS, Body.CHEST, 12, 30, 4);
//        Exercise dumbbellChestFlyElite = new Exercise("Dumbbell Chest Fly", Type.WEIGHTS, Body.CHEST, 12, 35, 5);
//        Exercise dumbbellChestFlyExpert = new Exercise("Dumbbell Chest Fly", Type.WEIGHTS, Body.CHEST, 15, 40, 5);
//
//        Exercise pushUpBeginner = new Exercise("Push-Up", Type.CALISTHENICS, Body.CHEST, 5, 0, 3);
//        Exercise pushUpIntermediate = new Exercise("Push-Up", Type.CALISTHENICS, Body.CHEST, 10, 0, 3);
//        Exercise pushUpAdvanced = new Exercise("Push-Up", Type.CALISTHENICS, Body.CHEST, 15, 0, 4);
//        Exercise pushUpElite = new Exercise("Push-Up", Type.CALISTHENICS, Body.CHEST, 25, 0, 4);
//        Exercise pushUpExpert = new Exercise("Push-Up", Type.CALISTHENICS, Body.CHEST, 35, 0, 5);
//
//        Exercise inclineBenchPressBeginner = new Exercise("Incline Bench Press", Type.WEIGHTS, Body.CHEST, 8, 40, 3);
//        Exercise inclineBenchPressIntermediate = new Exercise("Incline Bench Press", Type.WEIGHTS, Body.CHEST, 10, 60,3);
//        Exercise inclineBenchPressAdvanced = new Exercise("Incline Bench Press", Type.WEIGHTS, Body.CHEST, 10, 80, 3);
//        Exercise inclineBenchPressElite = new Exercise("Incline Bench Press", Type.WEIGHTS, Body.CHEST, 15, 100, 4);
//        Exercise inclineBenchPressExpert = new Exercise("Incline Bench Press", Type.WEIGHTS, Body.CHEST, 15, 140, 4);
//
//        Exercise barbellFrontRaiseBeginner = new Exercise("Barbell Front Raise", Type.WEIGHTS, Body.SHOULDER, 5, 20, 3);
//        Exercise barbellFrontRaiseIntermediate = new Exercise("Barbell Front Raise", Type.WEIGHTS, Body.SHOULDER, 8, 25, 3);
//        Exercise barbellFrontRaiseAdvanced = new Exercise("Barbell Front Raise", Type.WEIGHTS, Body.SHOULDER, 10, 30, 3);
//        Exercise barbellFrontRaiseElite = new Exercise("Barbell Front Raise", Type.WEIGHTS, Body.SHOULDER, 10, 35, 4);
//        Exercise barbellFrontRaiseExpert = new Exercise("Barbell Front Raise", Type.WEIGHTS, Body.SHOULDER, 10, 40, 4);
//
//        Training training = new Training("Chest Day!",Level.ELITE);


//        UserEntity user1 = new UserEntity("User1", "password1", "MALE@gmail.com");
//
//
//        //CHEST
        Exercise BarDip = new Exercise("Bar Dip", Type.CALISTHENICS, Body.CHEST, 8, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/09/Muscles-worked-by-bar-dip-exercise.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/02/Dips.gif?resize=600%2C600&ssl=1");

        Exercise BenchPress = new Exercise("Bench Press", Type.WEIGHTS, Body.CHEST, 4, 30, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/11/Bench-press-muscles-worked.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/09/bench-press.gif?resize=600%2C600&ssl=1");

        Exercise CableChestPress = new Exercise("Cable Chest Press", Type.WEIGHTS, Body.CHEST, 7, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-cable-chest-press.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/cable-chest-press.gif?resize=600%2C600&ssl=1");

        Exercise DeclineBenchPress = new Exercise("Decline Bench Press",  Type.WEIGHTS, Body.CHEST, 4, 30, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-in-decline-bench-press-exercise.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Decline-Bench-Press.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellChestFly = new Exercise("Dumbb Chest Fly", Type.WEIGHTS, Body.CHEST, 4, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/06/Muscles-worked-by-dumbbell-chest-flyes-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Dumbbell-Chest-Fly.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellChestPress = new Exercise("Dumbbell Chest Press",  Type.WEIGHTS, Body.CHEST, 5, 15, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-dumbbell-chest-press.png?resize=768%2C769&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Dumbbell-Chest-Press.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellPullover = new Exercise("Dumbbell Pull Over", Type.WEIGHTS, Body.CHEST, 5, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-dumbbell-pullover.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Dumbbell-Pullover.gif?resize=600%2C600&ssl=1");

        Exercise InclineBenchPress = new Exercise("Incline Bench Press",  Type.WEIGHTS, Body.CHEST, 5, 30, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-incline-bench-press.png?resize=768%2C769&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Incline-Bench-Press.gif?resize=600%2C600&ssl=1");

        Exercise InclineDumbbellPress = new Exercise("Incline Dumbell Press",  Type.WEIGHTS, Body.CHEST, 5, 20, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/04/muscles-worked-by-dumbbell-incline-press-female.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Dumbbell-Incline-Press.gif?resize=600%2C600&ssl=1");

        Exercise MachineChestFly = new Exercise("Machine Chest Fly",  Type.WEIGHTS, Body.CHEST, 8, 15, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/07/Muscles-worked-by-machine-chest-fly.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/machine-chest-fly.gif?resize=600%2C600&ssl=1");

        Exercise MachineChestPress = new Exercise("Machine Chest Press",  Type.WEIGHTS, Body.CHEST, 5, 20, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-machine-chest-press.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/machine-chest-press.gif?resize=600%2C600&ssl=1");

        Exercise PushUp = new Exercise("Push Up", Type.CALISTHENICS, Body.CHEST, 5, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-push-ups.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/02/Push-up.gif?resize=600%2C600&ssl=1");

        Exercise BandExternalShoulderRotation = new Exercise("Band External Shoulder Rotation",  Type.CALISTHENICS, Body.SHOULDER, 10, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Muscles-worked-by-band-shoulder-external-rotation.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Band-shoulder-external-rotation.gif?resize=600%2C600&ssl=1");

        Exercise BandInternalShoulderRotation = new Exercise("Band Internal Shoulder Rotation",  Type.CALISTHENICS, Body.SHOULDER, 10, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Muscles-worked-by-band-shoulder-external-rotation.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Band-shoulder-internal-rotation.gif?resize=600%2C600&ssl=1");

        Exercise BandPullApart = new Exercise("Band Pull-Apart",  Type.CALISTHENICS, Body.SHOULDER, 10, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-band-pull-aparts-1.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/04/Band-Pull-Apart.gif?resize=600%2C600&ssl=1");

        Exercise BarbellFrontRaise = new Exercise("Barbell Front Raise",  Type.WEIGHTS, Body.SHOULDER, 5, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-barbell-front-raise.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Barbell-Front-Raise.gif?resize=600%2C600&ssl=1");

        Exercise BarbellRearDeltRow = new Exercise("Barbell Rear Delt Row",  Type.WEIGHTS, Body.SHOULDER, 4, 20, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/01/Muscles-worked-in-rear-delt-row.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/01/Barbell-Rear-Delt-Row.gif?resize=600%2C600&ssl=1");

        Exercise BarbellUprightRow = new Exercise("Barbell Upright Row",  Type.WEIGHTS, Body.SHOULDER, 4, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/07/Muscles-worked-by-barbell-upright-row.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/11/Barbell-upright-row.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellHorizontalExternalShoulderRotation = new Exercise("Dumbbell Horizontal External Shoulder Rotation",  Type.WEIGHTS, Body.SHOULDER, 8, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Muscles-worked-by-band-shoulder-external-rotation.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/DB-standing-external-shoulder-rotation.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellLateralRaise = new Exercise("Dumbbell Lateral Raise",  Type.WEIGHTS, Body.SHOULDER, 5, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/05/Muscles-worked-by-dumbbell-lateral-raise-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Dumbbell-Lateral-Raise.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellShoulderPress = new Exercise("Dumbbell Shoulder Press",  Type.WEIGHTS, Body.SHOULDER, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-trained-by-dumbbell-shoulder-press-exercise.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/02/Dumbbell-shoulder-press.gif?resize=600%2C600&ssl=1");

        Exercise OverheadPress = new Exercise("Overhead Press",  Type.WEIGHTS, Body.SHOULDER, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/01/Muscles-worked-in-overhead-press-exercise.png?w=563&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Overhead-press-exercise.gif?resize=600%2C600&ssl=1");

        Exercise BarbellCurl = new Exercise("Barbell Curl", Type.WEIGHTS, Body.BICEPS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/05/Muscles-worked-in-the-barbell-curl-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/12/Barbell-biceps-curl.gif?resize=600%2C600&ssl=1");

        Exercise BarbellPreacherCurl = new Exercise("Barbell Preacher Curl", Type.WEIGHTS, Body.BICEPS, 5, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/06/muscles-worked-in-preacher-curl-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/04/preacher-curl-barbell.gif?resize=600%2C600&ssl=1");

        Exercise CurlWithBar = new Exercise("Curl With Bar", Type.WEIGHTS, Body.BICEPS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-cable-curl.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/cable-curl-with-handle.gif?resize=600%2C600&ssl=1");

        Exercise ConcentrationCurl = new Exercise("Concentration Curl", Type.WEIGHTS, Body.BICEPS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-concentration-curl-exercise.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Concentration-curl.gif?resize=600%2C600&ssl=1");

        Exercise HammerCurl = new Exercise("Hammer Curl", Type.WEIGHTS, Body.BICEPS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/05/Muscles-worked-in-the-hammer-curl-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/02/Hammer-curl.gif?resize=600%2C600&ssl=1");

        Exercise SpiderCurl = new Exercise("Spider Curl", Type.WEIGHTS, Body.BICEPS, 4, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/09/Muscles-worked-in-spider-curl-exercise-1024x1024-1.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/09/spider-curl-does-whatever-a-spider-curl-does-2.gif?resize=600%2C600&ssl=1");

        Exercise BarbellStandingTricepsExtension = new Exercise("Barbell Standing Triceps Extension", Type.WEIGHTS, Body.TRICEPS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/07/Muscles-worked-by-standing-tricep-extension.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Barbell-Standing-Triceps-Extension.gif?resize=600%2C600&ssl=1");

        Exercise BenchDip = new Exercise("Bench Dip", Type.CALISTHENICS, Body.TRICEPS, 5, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/11/Muscles-worked-in-bench-dips.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/12/C7251A7B-7A1B-47AE-A88C-7054692BCEF0.gif?resize=600%2C600&ssl=1");

        Exercise CloseGripPushUp = new Exercise("Close-Grip Push-Up", Type.CALISTHENICS, Body.TRICEPS, 5, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/09/Muscles-worked-in-close-grip-push-up-exercise-1024x1024-1.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/09/close-grip-push-up.gif?resize=600%2C600&ssl=1");

        Exercise DumbbellLyingTricepsExtension = new Exercise("Dumbbell Lying Triceps Extension", Type.WEIGHTS, Body.TRICEPS, 5, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/09/Muscles-worked-by-lying-triceps-extension-1024x1024-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/03/Lying-Dumbbell-Triceps-Extension-1.gif?resize=600%2C600&ssl=1");

        Exercise PushdownWithRope = new Exercise("Pushdown With Rope", Type.WEIGHTS, Body.TRICEPS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/07/Muscles-worked-by-triceps-pushdown.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/triceps-pushdown-with-rope.gif?resize=600%2C600&ssl=1");

        Exercise BarbellLunge = new Exercise("Barbell Lunge", Type.WEIGHTS, Body.LEGS, 5, 20, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-barbell-lunge.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/Barbell-Lunge.gif?resize=600%2C600&ssl=1");

        Exercise BulgarianSplitSquat = new Exercise("Bulgarian Split Squat", Type.WEIGHTS, Body.LEGS, 5, 5, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/04/muscles-worked-bulgarian-split-squat-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/02/Bulgarian-split-squat-barbell.gif?resize=600%2C600&ssl=1");

        Exercise BarbellSquat = new Exercise("Barbell Squat", Type.WEIGHTS, Body.LEGS, 5, 30, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/05/Squat-muscles-worked.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/11/squat.gif?resize=600%2C600&ssl=1");

        Exercise LegExtension = new Exercise("Leg Extension", Type.WEIGHTS, Body.LEGS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/05/muscles-worked-in-leg-extension-2.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/leg-extension-seated.gif?resize=600%2C600&ssl=1");

        Exercise RomanianDeadlift = new Exercise("Romanian Deadlift", Type.WEIGHTS, Body.LEGS, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/09/Muscles-worked-by-romanian-deadlifts.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/01/Romanian-deadlift.gif?resize=600%2C600&ssl=1");

        Exercise BoxSquat = new Exercise("Box Squat", Type.WEIGHTS,Body.LEGS,5,20,4,"https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-box-squat.png?resize=768%2C768&ssl=1","https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Box-Squat.gif?resize=600%2C600&ssl=1");

        Exercise Squat = new Exercise("Squat",Type.WEIGHTS,Body.LEGS,5,30,4,"https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/05/Squat-muscles-worked.png?resize=768%2C768&ssl=1","https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2021/11/squat.gif?resize=600%2C600&ssl=1");

        Exercise BarbellRows = new Exercise("Barbell Rows", Type.WEIGHTS, Body.BACK, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/01/Barbell-row-muscles-worked.png?w=563&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2022/03/Barbell-Row.gif?resize=600%2C600&ssl=1");

        Exercise CableWideGripSeatedRow = new Exercise("Cable Wide Grip Seated Row",  Type.WEIGHTS, Body.BACK, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-seated-cable-row-with-wide-grip.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/cable-row-seated-wide-grip.gif?resize=600%2C600&ssl=1");

        Exercise CableCloseGripSeatedRow = new Exercise("Cable Close Grip Seated Row", Type.WEIGHTS,Body.BACK,5,10,4,"https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2023/03/Muscles-worked-by-seated-cable-row-with-close-grip.png?resize=768%2C768&ssl=1","https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/cable-row-seated-narrow-grip.gif?resize=600%2C600&ssl=1");

        Exercise ChinUp = new Exercise("Chin-Up", Type.CALISTHENICS, Body.BACK, 3, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-chin-ups.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/chin-up.gif?resize=600%2C600&ssl=1");

        Exercise Deadlift = new Exercise("Deadlift", Type.WEIGHTS, Body.BACK, 5, 30, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/04/Deadlift-muscles-worked.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/11/Deadlift.gif?resize=600%2C600&ssl=1");

        Exercise PullUps = new Exercise("Pull-Ups", Type.CALISTHENICS, Body.BACK, 2, 0, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/10/Muscles-worked-by-pull-ups.png?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/03/pull-up.gif?resize=600%2C600&ssl=1");

        Exercise GoodMorning = new Exercise("Good Morning",  Type.WEIGHTS, Body.BACK, 5, 10, 4, "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/09/Muscles-worked-in-the-good-morning-exercise.jpg?resize=768%2C768&ssl=1", "https://i0.wp.com/www.strengthlog.com/wp-content/uploads/2020/02/Good-morning.gif?resize=600%2C600&ssl=1");



        Training chestTriceps1 = new Training("Chest & Triceps 1", List.of(Body.CHEST, Body.TRICEPS),
                List.of(BarDip, BenchPress, BenchDip, CableChestPress, DumbbellChestFly));
        Training chestTriceps2 = new Training("Chest & Triceps 2", List.of(Body.CHEST, Body.TRICEPS),
                List.of(InclineBenchPress, DumbbellChestPress, DumbbellPullover, MachineChestFly, MachineChestPress));
        Training chestTriceps3 = new Training("Chest & Triceps 3", List.of(Body.CHEST, Body.TRICEPS),
                List.of(PushUp, DeclineBenchPress, InclineDumbbellPress, BandExternalShoulderRotation, BandInternalShoulderRotation));
        Training chestTriceps4 = new Training("Chest & Triceps 4", List.of(Body.CHEST, Body.TRICEPS),
                List.of(DumbbellChestPress, MachineChestPress, BenchDip, CloseGripPushUp, DumbbellLyingTricepsExtension));
        Training chestTriceps5 = new Training("Chest & Triceps 5", List.of(Body.CHEST, Body.TRICEPS),
                List.of(DumbbellChestFly, InclineBenchPress, InclineDumbbellPress, BandPullApart, BarbellFrontRaise));

// Shoulder Training
        Training shoulder1 = new Training("Shoulder 1", List.of(Body.SHOULDER),
                List.of(BandExternalShoulderRotation, BarbellFrontRaise, DumbbellShoulderPress, BarbellRearDeltRow, BarbellUprightRow));
        Training shoulder2 = new Training("Shoulder 2", List.of(Body.SHOULDER),
                List.of(BandPullApart, BarbellUprightRow, DumbbellLateralRaise, DumbbellShoulderPress, OverheadPress));
        Training shoulder3 = new Training("Shoulder 3", List.of(Body.SHOULDER),
                List.of(DumbbellHorizontalExternalShoulderRotation, DumbbellLateralRaise, DumbbellShoulderPress, OverheadPress, BarbellRearDeltRow));
        Training shoulder4 = new Training("Shoulder 4", List.of(Body.SHOULDER),
                List.of(BarbellUprightRow, BandInternalShoulderRotation, DumbbellShoulderPress, OverheadPress, BarbellFrontRaise));
        Training shoulder5 = new Training("Shoulder 5", List.of(Body.SHOULDER),
                List.of(DumbbellLateralRaise, OverheadPress, DumbbellHorizontalExternalShoulderRotation, BandPullApart, BarbellRearDeltRow));

// Biceps Training
        Training biceps1 = new Training("Biceps 1", List.of(Body.BICEPS),
                List.of(BarbellCurl, ConcentrationCurl, HammerCurl, BarbellPreacherCurl, CurlWithBar));
        Training biceps2 = new Training("Biceps 2", List.of(Body.BICEPS),
                List.of(BarbellPreacherCurl, CurlWithBar, SpiderCurl, ConcentrationCurl, HammerCurl));
        Training biceps3 = new Training("Biceps 3", List.of(Body.BICEPS),
                List.of(CurlWithBar, HammerCurl, ConcentrationCurl, BarbellCurl, SpiderCurl));
        Training biceps4 = new Training("Biceps 4", List.of(Body.BICEPS),
                List.of(HammerCurl, BarbellCurl, SpiderCurl, ConcentrationCurl, BarbellPreacherCurl));
        Training biceps5 = new Training("Biceps 5", List.of(Body.BICEPS),
                List.of(ConcentrationCurl, BarbellPreacherCurl, CurlWithBar, HammerCurl, SpiderCurl));

// Legs Training
        Training legs1 = new Training("Legs 1", List.of(Body.LEGS),
                List.of(BarbellSquat, BulgarianSplitSquat, BoxSquat, Squat, LegExtension));
        Training legs2 = new Training("Legs 2", List.of(Body.LEGS),
                List.of(BarbellLunge, RomanianDeadlift, LegExtension, BoxSquat, Deadlift));
        Training legs3 = new Training("Legs 3", List.of(Body.LEGS),
                List.of(RomanianDeadlift, BoxSquat, Squat, BarbellLunge, LegExtension));
        Training legs4 = new Training("Legs 4", List.of(Body.LEGS),
                List.of(BulgarianSplitSquat, LegExtension, BarbellLunge, Squat, GoodMorning));
        Training legs5 = new Training("Legs 5", List.of(Body.LEGS),
                List.of(Squat, BarbellSquat, GoodMorning, RomanianDeadlift, BoxSquat));

// Back Training
        Training back1 = new Training("Back 1", List.of(Body.BACK),
                List.of(BarbellRows, Deadlift, PullUps, CableWideGripSeatedRow, CableCloseGripSeatedRow));
        Training back2 = new Training("Back 2", List.of(Body.BACK),
                List.of(ChinUp, CableWideGripSeatedRow, BarbellRows, Deadlift, PullUps));
        Training back3 = new Training("Back 3", List.of(Body.BACK),
                List.of(GoodMorning, Deadlift, PullUps, CableWideGripSeatedRow, BarbellRows));
        Training back4 = new Training("Back 4", List.of(Body.BACK),
                List.of(PullUps, CableCloseGripSeatedRow, BarbellRows, GoodMorning, ChinUp));
        Training back5 = new Training("Back 5", List.of(Body.BACK),
                List.of(CableWideGripSeatedRow, PullUps, Deadlift, BarbellRows, CableCloseGripSeatedRow));


        UserEntity user = new UserEntity("jt","JT","xdddd@gmail.com");

        user.setTrainings(List.of(chestTriceps1,shoulder2,back1, legs4,biceps5));


        List<Exercise> allExercises = List.of(
                BarDip, BenchPress, CableChestPress, DeclineBenchPress,
                DumbbellChestFly, DumbbellChestPress, DumbbellPullover,
                InclineBenchPress, InclineDumbbellPress, MachineChestFly,
                MachineChestPress, PushUp, BandExternalShoulderRotation,
                BandInternalShoulderRotation, BandPullApart, BarbellFrontRaise,
                BarbellRearDeltRow, BarbellUprightRow,
                DumbbellHorizontalExternalShoulderRotation, DumbbellLateralRaise,
                DumbbellShoulderPress, OverheadPress, BarbellCurl,
                BarbellPreacherCurl, CurlWithBar, ConcentrationCurl,
                HammerCurl, SpiderCurl, BarbellStandingTricepsExtension,
                BenchDip, CloseGripPushUp, DumbbellLyingTricepsExtension,
                PushdownWithRope, BarbellLunge, BulgarianSplitSquat,
                BarbellSquat, LegExtension, RomanianDeadlift, BoxSquat,
                Squat, BarbellRows, CableWideGripSeatedRow,
                CableCloseGripSeatedRow, ChinUp, Deadlift, PullUps, GoodMorning
        );

        List<Training> allTrainings = List.of(
                chestTriceps1, chestTriceps2, chestTriceps3, chestTriceps4, chestTriceps5,
                shoulder1, shoulder2, shoulder3, shoulder4, shoulder5,
                biceps1, biceps2, biceps3, biceps4, biceps5,
                legs1, legs2, legs3, legs4, legs5,
                back1, back2, back3, back4, back5
        );


        //userRepository.saveAll(List.of(user1, user2, user3, user4, user5));
        exerciseRepository.saveAll(allExercises);
        trainingRepository.saveAll(allTrainings);
        userRepository.saveAll(List.of(user));
    }
}

