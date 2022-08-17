package com.tahera;

public class CountMatchingRule {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}};

        String ruleKey = "color";
        String ruleValue = "silver";
        int index = 0;
        int count = 0;

        if(ruleKey.equals("color"))
            index = 1;
        if(ruleKey.equals("name"))
            index = 2;

        for(String[] i:items){
            if(i[index].equals(ruleValue)){
                count++;
            }
        }
        System.out.println(count);
    }
}
