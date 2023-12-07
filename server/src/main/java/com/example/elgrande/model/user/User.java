package com.example.elgrande.model.user;

import com.example.elgrande.model.diet.Diet;
import com.example.elgrande.model.enums.Level;
import com.example.elgrande.model.enums.enums_diet.Allergy;
import com.example.elgrande.model.enums.enums_diet.DietType;
import com.example.elgrande.model.enums.enums_diet.FoodType;
import com.example.elgrande.model.enums.enums_training.Body;
import com.example.elgrande.model.enums.enums_training.Type;
import com.example.elgrande.model.training.Exercise;
import com.example.elgrande.model.training.Training;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Data
@Entity(name = "\'User\'")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date creationDate;
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;
    private int weight;
    private int height;
    private int timesToMultiply;
    @Enumerated(EnumType.STRING)
    private Level level;
    @Enumerated(EnumType.STRING)
    private DietType dietType;
    @Enumerated(EnumType.STRING)
    private FoodType foodType;
    @Enumerated(EnumType.STRING)
    private Type trainingType;
    private int amountOfTrainingsDone;
    private int TrainingsPerWeek;
    @Enumerated(EnumType.STRING)
    private List<Allergy> allergies;
    @Enumerated(EnumType.STRING)
    private List<Body> bodyPart;
    @ManyToMany
    @JoinTable(name = "user_training",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "trening_id"))
    private List<Training> trainings;

    @ManyToMany
    @JoinTable(name = "user_diet",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "diet_id"))
    private List<Diet> diets;

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public User(String gender, int age, int weight, int height, Level level, DietType dietType, FoodType foodType,Type trainingType, List<Allergy> allergies,List<Body> bodyPart) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.level = level;
        this.dietType = dietType;
        this.foodType = foodType;
        this.trainingType=trainingType;
        this.allergies = allergies;
        this.bodyPart=bodyPart;
    }
    public void addDiet(Diet diet) {
        diets.add(diet);
    }

    public void removeDiet(Diet diet) {
        diet.setUser(null);
        diets.remove(diet);
    }
    public double getBMI() {
        return weight / (Math.pow((double)height / 100, 2));
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", level=" + level +
                ", dietType=" + dietType +
                ", foodType=" + foodType +
                ", amountOfTrainingsDone=" + amountOfTrainingsDone +
                ", TrainingsPerWeek=" + TrainingsPerWeek +
                ", allergies=" + allergies +
                ", trainings=" + trainings +
                ", diets=" + diets +
                '}';
    }
}