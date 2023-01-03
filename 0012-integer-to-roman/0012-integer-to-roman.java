class Solution {
    public String intToRoman(int num) {
        String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int value[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int base = -1;
        StringBuilder result = new StringBuilder();

        for(int i=0; i<roman.length; i++){
            if((base=num/value[i])!=0){
                while(base--!=0)result.append(roman[i]);
                num=num%value[i];
            }
        }
        return result.toString();
    }
}