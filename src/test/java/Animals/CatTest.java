package Animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    public void checkCatClass() {

        Cat cat = new Cat("CatTest1", "", "");
        //GIVEN
        String expectedClassName = "Animals.Ca";

        //WHEN
        String actualClassName = cat.getClass().getName();

        //THEN
        Assertions.assertEquals(expectedClassName, actualClassName,
        String.format("Expected is '%s' and actual was '%s'", expectedClassName, actualClassName));
    }

    @Test
    public void checkCatName() {

        Cat cat = new Cat("CatTest2", "", "");
        //GIVEN
        String expectedCatName = "Mick";

        //WHEN
        String actualCatName = cat.name;

        //THEN
        Assertions.assertEquals(expectedCatName, actualCatName,
        String.format("Expected is '%s' and actual was '%s'", expectedCatName, actualCatName));
    }

    @Test
    public void checkCatSound() {

        Cat cat = new Cat("CatTest3", "", "");
        //GIVEN
        String expectedCatSound = ("meow");

        //WHEN
        String actualCatSound = cat.makesSound();

        //THEN
        Assertions.assertEquals(expectedCatSound, actualCatSound,
                String.format("Expected is '%s' and actual was '%s'", expectedCatSound, actualCatSound));
    }
}

