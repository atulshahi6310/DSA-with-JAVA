class Solution {
    static int romannum(char c){
        switch(c){
            case 'I':return 1;
            case 'V' : return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
            default :return 0;
        }
        // return -1;

    }
    public int romanToInt(String s) {
       int current_elem =0;
       int prev_elem =0;
       int num =0;
       for(int i=s.length()-1;i>=0;i--){
            current_elem =romannum(s.charAt(i));
            if(current_elem <prev_elem){
                num -= current_elem;
            }else{
                num += current_elem;
            }
            prev_elem = current_elem;
       }

       return num;
    }
}


 // HashMap <Character,Integer> roman = new  HashMap<>();
        // roman.put('I', 1);
        // roman.put('V', 5);
        // roman.put('X', 10);
        // roman.put('L', 50);
        // roman.put('C', 100);
        // roman.put('D', 500);
        // roman.put('M', 1000);
        // int num =0;
        // for(int i=0;i<s.length()-1;i++){
        //     if(roman.get(s.charAt(i)) <roman.get(s.charAt(i+1))){
        //         num -= roman.get(s.charAt(i));
        //     }else{
        //         num += roman.get(s.charAt(i));
        //     }
        // }
        // num += roman.get(s.charAt(s.length()-1));
        // return num;