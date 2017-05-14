package com.courses.apollo.model;

public class TextTestData {

    public String getTextOne(){
        return "Core form design tends to, as a general rule, be more economical, and therefore more prevalent, " +
                "than shell form design for high voltage power transformer applications at the lower end of their " +
                "voltage and power rating ranges (less than or equal to, nominally, 230 kV or 75 MVA)";
    }

    public String getTextTwo(){
        return "/**\n" +
                "     * Find sum even numeral in text.\n" +
                "     * @param text - input text.\n" +
                "     * @return count sum even numeral.\n" +
                "     */\n" +
                "    public int findSumEvenNumeral(String text){\n" +
                "        return count;\n" +
                "    }\n" +
                "// egegegegegeg\n" +
                "\n" +
                "/* egegeg*/";
    }

    public String expectedTextTwo() {
        return  "\n" +
                "    public int findSumEvenNumeral(String text){\n" +
                "        return count;\n" +
                "    }\n"+
                "\n" +
                "";
    }


    public String getTextThree(){
        return "Apollo find resolution and resolution find apollo";
    }

    public String getTextFour(){
        return "It is estimated that 50% of power transformers will survive 50 years of use, that the average age of " +
                "failure of power transformers is about 10 to 15 years, and that about 30% of power transformer" +
                " failures are due to insulation and overloading failures.";
    }

    public String getTextFive(){
        return "A  transformer is an electrical  device , that transfers electrical energy between two or more circuits" +
                " through electromagnetic induction! . A varying current in one coil of the transformer produces a " +
                "varying   magnetic field   , which in turn induces a  voltage in a second     coil. ?";
    }

    public String expectedTextFive(){
        return "A transformer is an electrical device, that transfers electrical energy between two or more circuits" +
                " through electromagnetic induction!. A varying current in one coil of the transformer produces a" +
                " varying magnetic field, which in turn induces a voltage in a second coil.?";
    }
}
