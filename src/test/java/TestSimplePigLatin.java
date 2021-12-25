import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class TestSimplePigLatin {

    @Test
    public void FixedTests() {
//        System.out.println("Pig latin is cool");
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
//        System.out.println("=========================================");
//        System.out.println("This is my string");
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
//        System.out.println("=========================================");
//        System.out.println("Hello world !");
        assertEquals("elloHay orldway !",SimplePigLatin.pigIt("Hello world !"));
//        System.out.println("=========================================");
//        System.out.println("...tmpora o mores[ !]");
        assertEquals("...mporatay oay oresmay[ !]", SimplePigLatin.pigIt("...tmpora o mores[ !]"));
    }

    @Test
    public void FixedTests2() {
//        System.out.println("FixedTests2");
//        System.out.println("Pig latin is cool");
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt2("Pig latin is cool"));
//        System.out.println("=========================================");
//        System.out.println("This is my string");
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt2("This is my string"));
//        System.out.println("=========================================");
//        System.out.println("Hello world !");
        assertEquals("elloHay orldway !",SimplePigLatin.pigIt2("Hello world !"));
//        System.out.println("=========================================");
//        System.out.println("...tmpora o mores[ !]");
        assertEquals("...mporatay oay oresmay[ !]", SimplePigLatin.pigIt2("...tmpora o mores[ !]"));
//        System.out.println("=========================================");
//        System.out.println("...tmpora o mores9[ !]");
        assertEquals("...mporatay oay ores9may[ !]", SimplePigLatin.pigIt2("...tmpora o mores9[ !]"));
    }

    @Test
    public void FixedTests3() {
//        System.out.println("FixedTests3");
//        System.out.println("Pig latin is cool");
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt3("Pig latin is cool"));
//        System.out.println("=========================================");
//        System.out.println("This is my string");
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt3("This is my string"));
//        System.out.println("=========================================");
//        System.out.println("Hello world !");
        assertEquals("elloHay orldway !",SimplePigLatin.pigIt3("Hello world !"));
//        System.out.println("=========================================");
//        System.out.println("...tmpora o mores[ !]");
//        assertEquals("...mporatay oay oresmay[ !]", SimplePigLatin.pigIt3("...tmpora o mores[ !]"));
    }

    @Test
    public void FixedTests4() {
        System.out.println("FixedTests4");
        System.out.println("Pig latin is cool");
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt4("Pig latin is cool"));
        System.out.println("=========================================");
        System.out.println("This is my string");
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt4("This is my string"));
        System.out.println("=========================================");
        System.out.println("Hello world !");
        assertEquals("elloHay orldway !",SimplePigLatin.pigIt4("Hello world !"));
        System.out.println("=========================================");
//        System.out.println("...tmpora o mores[ !]");
//        assertEquals("...mporatay oay oresmay[ !]", SimplePigLatin.pigIt4("...tmpora o mores[ !]"));
    }
}

