package org.itstep;

import org.itstep.enums.Color;
import org.itstep.enums.Sex;
import org.itstep.exceptions.InvalidLoginException;
import org.itstep.exceptions.InvalidPasswordException;
import org.itstep.models.*;

public class Main {

    public static void main(String[] args) {
        /*Person[] people = new Person[] {
                new Student("Vasya", "Pupkin", 20, "PP-17", 1),
                new Student("Masha", "Ivanova", 23, "PP-17", 4),
                new Worker("Petya", "Stepanov", 21, 10000),
        };

        for (Person person : people) {
            System.out.println(person);
        }*/

        /*System.out.println(Sex.FEMALE);
        System.out.println(Sex.MALE);

        System.out.println(Color.BLUE);
        System.out.println(Color.RED);
        System.out.println(Color.GREEN.getValue());*/

        //Внутренние / вложенные классы
        /*
        * Вложенные классы, могут быть использованы только внутри родительского класса
        * Экземпляр внутреннего класса невозможно создать за пределами его родителя
        * */


        /*Student student = new Student("Vasya", "Pupkin", 20, "PP-17", 1);
        System.out.println(student.getPassport().getNumber());*/
        //Error
        //Person.Passport passport = new Person.Passport()

        /*Car.Engine carEngine = new Car.Engine();
        Car.Door door = new Car.Door();*/


        //Point2D<int> p = new Point2D<int>(10, 10);

        try {
            if (loginInSystem("va", "pupkin")) {
                System.out.println("Success login");
            }
            else {
                System.out.println("User doesn`t exists");
            }
        } catch (InvalidPasswordException | InvalidLoginException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        catch (Exception e) {

        }

    }

    public static Boolean loginInSystem(String login, String password) throws InvalidLoginException, InvalidPasswordException {
        //Login validation
        if (login.length() < 4 || login.length() > 16) {
            throw new InvalidLoginException("Login must be 4 - 16 symbs");
        }

        //Password validation
        if (password.length() < 4 || password.length() > 12) {
            throw new InvalidPasswordException("Password must be 4 - 12 symbs");
        }


        if (login.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}
