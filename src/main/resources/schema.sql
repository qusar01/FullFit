DROP TABLE IF EXISTS "users";
DROP TABLE IF EXISTS "workouts";
DROP TABLE IF EXISTS "exercises";
DROP TABLE IF EXISTS "meals";
DROP TABLE IF EXISTS "fooditems";
DROP TABLE IF EXISTS "challenges";

CREATE TABLE "users" {
    "id" bigint DEFAULT nextval("users_id_seq") NOT NULL,
    "username" text,
    "password" text,
    "email" text,
    "height" numeric,
    "weight" numeric,
    "age" integer,
    CONSTRAINT "users_pkey" PRIMARY KEY ("id")
    };

CREATE TABLE "workouts" {
    "id" bigint DEFAULT nextval("workouts_id_seq") NOT NULL,
    "date" date,
    duration time,
    "type" text,
    "caloriesBurned" numeric,
    "user_id" bigint,
    CONSTRAINT "workouts_pkey" PRIMARY KEY ("id")
    CONSTRAINT "fk_user" FOREIGN KEY (user_id)
    REFERENCES users(id)
    }

CREATE TABLE "exercises" {
    "id" bigint DEFAULT nextval("exercises_id_seq") NOT NULL,
    "name" text,
    "sets" integer,
    "reps" integer,
    "weight" numeric,
    "workout_id" bigint,
    CONSTRAINT "exercises_pkey" PRIMARY KEY ("id")
    CONSTRAINT "fk_workout" FOREIGN KEY (workout_id)
    REFERENCES workouts(id)
    }

CREATE TABLE "meals" {
    "id" bigint DEFAULT nextval("meals_id_seq") NOT NULL,
    "date" date,
    "totalCalories" numeric,
    "user_id" bigint,
    CONSTRAINT "meals_pkey" PRIMARY KEY ("id")
    CONSTRAINT "fk_user" FOREIGN KEY (user_id)
    REFERENCES users(id)
    }

CREATE TABLE "fooditems" {
    "id" bigint DEFAULT nextval("fooditems_id_seq") NOT NULL,
    "name" text,
    "quantity" numeric,
    "calories" numeric,
    "meal_id" bigint,
    CONSTRAINT "fooditems_pkey" PRIMARY KEY ("id")
    CONSTRAINT "fk_meal" FOREIGN KEY (meal_id)
    REFERENCES meals(id)
    }

CREATE TABLE "challenges" {
    "id" bigint DEFAULT nextval("fooditems_id_seq") NOT NULL,
    "name" text,
    "start_date" date,
    "end_date" date,
    "desc" text,
    "user_id" bigint,
    CONSTRAINT "challenges_pkey" PRIMARY KEY ("id")
    CONSTRAINT "fk_user" FOREIGN KEY (user_id)
    REFERENCES users(id)
    }